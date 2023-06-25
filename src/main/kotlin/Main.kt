fun main() {
    var name = "John"    // Declare a variable that can be modified
    val birthYear = 1999   // Declare a variable that cannot be modified
    val age: Int
    val country = "Kenya"
    val county = "Nairobi"
    val location = county + ", " + country

    name = "Ian Macharia" // Change the value of name to "Ian Macharia"
    age = 24 // Assign a value to age

    // var name: String = "John" // String
    // val birthYear: Int = 1975 // Int

    val statement1 = "My name is $name" // String concatenation
    val statement2 = "I was born in " + birthYear // String concatenation
    val statement3 = "I am $age years old and live in $location" // String concatenation

    println(name)          // Print the value of name
    println(birthYear)     // Print the value of birthYear
    println(age)           // Print the value of age
    println(statement1)    // Print the value of statement1
    println(statement2)    // Print the value of statement2
    println(statement3)    // Print the value of statement3

    // Names can contain letters, digits, underscores, and dollar signs
    // Names should start with a letter
    // Names can also begin with $ and _
    // Names are case-sensitive ("myVar" and "myvar" are different variables)
    // Names should start with a lowercase letter, and it cannot contain whitespace
    // Reserved words (like Kotlin keywords, such as var or String) cannot be used as names

    /*
    * print() is used to print a line of text to the console.
    * println() is used to print a line of text to the console and then move the cursor to the next line.
    * */
}