open class Shape {
    open val corner: Int = 1
}

open class Box: Shape() {
    override val corner: Int = 4
}

class Triangle: Box() {
    override val corner: Int = 4
}