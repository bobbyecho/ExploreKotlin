fun main() {
    val byte: Byte = 30 // range -128 - 127
    println("byte: $byte")

    val int: Int = 165
    println("Int: $int")

    val short: Short = 20000
    println("Short: $short")

    val long: Long = 100_000_000L
    println("Loing: $long")

    /**
     * FLOATING NUMBER
     */
    val float: Float = 99.98F
    println("Float: $float")

    var double: Double = 99.01
    println("Double: $double")

    /**
     * LITERALS
     */
    val decimalLiteral: Int = 100
    println("decimalLiteral: $decimalLiteral")

    val hexadecimalLiteral: Int = 0xFF
    println("hexadecimalLiteral: $hexadecimalLiteral")

    val binaryLiteral: Int = 0b011001
    println("binaryLiteral: $binaryLiteral")

    /**
     * CONVERSION
     * .toByte()
     * .toShort()
     * .toInt()
     * .toLong()
     * .toDouble()
     * .toFloat()
     */
    val longToByte = long.toByte()
    println("Long to Byte: $longToByte")

    val intToByte = int.toByte()
    println("Int to Byte: $intToByte")
}