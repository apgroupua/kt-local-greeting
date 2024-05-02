package mate.academy

fun greetUsers() {
    // implement function
    while (true) {
        print("Please enter a name (or press Enter to quit): ")
        val name = readlnOrNull()?.trim()
        if (name.isNullOrBlank()) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
