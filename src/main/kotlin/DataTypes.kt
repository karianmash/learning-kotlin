fun main() {
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    // Or

    val myNum2: Int = 5            // Int
    val myDoubleNum2: Double = 5.99    // Double
    val myLetter2: Char = 'D'        // Char (Notice the use of single quotes), store only one character
    val myBoolean2: Boolean = true      // Boolean
    val myText2: String = "Hello"      // String

    // Integer Types
    val myByte: Byte = 100 // 8-bit signed integer
    val myShort: Short = 5000 // 16-bit signed integer
    val myInt: Int = 1000000 // 32-bit signed integer
    val myLong: Long = 15000000000 // 64-bit signed integer

    // Floating Point Types
    val myFloat: Float = 5.99F // 32-bit floating point number
    val myDouble: Double = 19.99 // 64-bit floating point number

    /*
     * The main difference between Double and Float is that Double is more precise than Float.
     * Float is a single precision floating point number,
     * while Double is a double precision floating point number.
     *  */

    println("Integer Type: $myByte, $myShort, $myInt, $myLong")
    println("Floating Point Type: $myFloat, $myDouble")
    println("Other Types: $myNum, $myDoubleNum, $myLetter, $myBoolean, $myText")
}