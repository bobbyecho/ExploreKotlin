class LazyStudent {
    lateinit var name: String

    fun callLazyStudent(name: String) {
        this.name = name
    }
}

fun main() {
    val student = LazyStudent()
    // student.name // error
    student.callLazyStudent("Sarah Rahmawati")
    println("lazy student: ${student.name}")

    val student2 = LazyStudent()
    student2.name = "Bobby Echo Prasetyo"
    println("Lazy studeny 2: ${student2.name}")


}