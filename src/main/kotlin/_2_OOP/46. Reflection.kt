import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank

fun validateRequest(request: Any): Boolean {
    val clazz = request::class
    val properties = clazz.memberProperties
    var error = false

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            when(val value = property.call(request)) {
                is String -> {
                    if (value == "") {
                        error = true
                    }
                }
            }
        }
    }

    return error
}

fun main() {
    val request = CreateProductRequest("1", "asd", 2000)
    val validateRequest = validateRequest(request)
    println("isError product: $validateRequest")

    val request2 = CreateCategoryRequest("1", "",)
    val validateRequest2 = validateRequest(request2)
    println("isError category: $validateRequest2")
}