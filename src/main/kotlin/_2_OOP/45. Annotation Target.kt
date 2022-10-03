package _2_OOP
@Target(AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.FIELD,
        AnnotationTarget.VALUE_PARAMETER)
@Retention
@MustBeDocumented
annotation class Beta

class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)