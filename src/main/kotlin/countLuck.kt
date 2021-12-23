/**
 * Traverse a 2D matrix to find the path from M to *,
 * avoiding trees (X). Return "Impressed" if number
 * of decision points matches k, "Oops" if not.
 * Must be exactly one path from M to *. Max size of
 * matrix is 100x100.
 */
fun countLuck(mat: Array<String>, k: Int): String {

    // Translate the matrix to a 102x102 Int matrix.
    // '.' becomes 0, 'X' becomes 1. '*' = 0 and 'M' = 0, since
    // port key and characters are on empty squares.
    // Fill the matrix with 1s to start, so that translated map
    // is surrounded by trees. This eliminates boundary checks.
    // Also finds M and *.
    val M = Array<Int>(2){0}
    val portKey = Array<Int>(2){0}
    val matrix = Array(102) { Array(102){1} }
    for (r in mat.indices) {
        for (c in mat[0].indices) {
            matrix[r+1][c+1] = when(mat[r][c]) {
                '.' -> 0
                'X' -> 1
                '*' -> { portKey[0] = r+1; portKey[1] = c+1; 0 }
                'M' -> { M[0] = r+1; M[1] = c+1; 0 }
                else -> 99
            }
        }
    }

    /**
     * Finds a path from the specified start point to the port key.
     * Marks valid decision points with 3. Returns number of decision
     * points.
     */
    fun findPath(row: Int, col: Int): Int {
        val stack = MutableStack<Triple<Int,Int,Int>>()
        var r = row // current row and col
        var c = col
        var decisionCount = 0
        var nextExit = -1 // The index of the next exit to try
        var nExits: Int
        // up, down, right, left
        val rowDelta = arrayOf(-1, 1, 0,  0)
        val colDelta = arrayOf(0,  0, 1, -1)

        // There is guaranteed to be one path from M to *.
        // This code keeps looking until it finds it.
        while (true) {
            if (r == portKey[0] && c == portKey[1]) {
                // We've found the port key.
                return decisionCount
            }

            // Mark this cell as visited, and make sure it only gets counted once.
            if (matrix[r][c] != 3) matrix[r][c] = 2

            // Count how many exits exist from this location
            nExits = 0
            for (i in 0..3) {
                val rd = r + rowDelta[i]
                val cd = c + colDelta[i]
                if (matrix[rd][cd] == 0) {
                    nExits++
                    nextExit = i // if >1 exits, this will point to the last one found
                }
            }

            // Decide where to go

            // Dead end.
            if (nExits == 0) {
                // Mark dead end. Go back to the last decision point, pick a
                // different direction, and restore the decisionCount for
                // that path. We only count DPs on the winning path.
                matrix[r][c] = 8
                val p = stack.pop()
                r = p.first
                c = p.second
                decisionCount = p.third
                continue
            }

            // Decision point.
            if (nExits > 1) {
                if (matrix[r][c] == 2) {
                    decisionCount++
                    matrix[r][c] = 3
                }
                // Save the position and decisionCount so far.
                stack.push(Triple(r, c, decisionCount))
            }

            // Advance to the next legal position
            r += rowDelta[nextExit]
            c += colDelta[nextExit]

        }
    }

    // Count the decision points
    val result = findPath(M[0], M[1])
    // print("result = $result, k = $k ")
    // printMatrix(result)
    return if (result == k) "Impressed" else "Oops!"
}
