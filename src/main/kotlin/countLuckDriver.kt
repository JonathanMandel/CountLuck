fun countLuckDriver() {
    val matrix2f = arrayOf(
        ".X.XXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X." ,
        "...XXXXXXXXXXXXXXXXXXX..................." ,
        ".X..X.X.X.X.X.X.X..XXXX*X.X.X.X.X.X.X.XX." ,
        ".XXXX.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X" ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X" ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X" ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        ".XX.X.X.X.XX.X.XX.X.X.X.X.X.X.X.X.X.X.X.X" ,
        ".X.X.X.X.X.XXX.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "X........................................" ,
        "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        ".X.XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.XX" ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XMX." ,
        ".X....................................X.." ,
        "..X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        ".X...................................X..." ,
        ".XX.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.XX.XXXX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................." ,
        "X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX." ,
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X." ,
        "........................................."
    ) // 294
    val matrix2a = arrayOf(
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
        "M.......................................*",
        ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
    ) // 20
    val matrix2b = arrayOf(
        "..........*",
        ".XXXXXXXXXX",
        "...........",
        "XXXXXXXXXX.",
        "M..........",
    ) // 0
    val matrix2c = arrayOf(
        "XXXXXXXXXXXXXXXXX",
        "XXX.XX.XXXXXXXXXX",
        "XX.*..M.XXXXXXXXX",
        "XXX.XX.XXXXXXXXXX",
        "XXXXXXXXXXXXXXXXX",
    ) // 1
    val matrixTest1 = arrayOf(
        ".X.X*X.X.X." ,
        "..........." ,
        "..X.X.XX.XX" ,
        ".X.X.X.XMX." ,
        "........X.." ,
        "X.X.X.X.XX." ,
    ) // 4
    val result = countLuck(matrix2f, 294)
    println(result)
}
