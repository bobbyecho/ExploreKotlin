fun main() {
    /**
     * For Array
     */
    val names = arrayOf("Bobby", "Echo", "Prasetyo")
    for (name in names) {
        println("name: $name")
    }

    /**
     * For Range
     */
    for (value in 0..100 step 2) {
        println("for range: $value")
    }

    for (value in 100 downTo 3 step 5 ) {
        println("for range downTo: $value")
    }
}