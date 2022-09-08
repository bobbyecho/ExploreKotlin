fun main() {
    val absenceValue = 75
    val examValue = 60
    val extraValue = 100

    val isExamPassed = examValue > 70
    val isAbsencePassed = absenceValue > 50
    val isExtraValuePassed = extraValue > 70

    val isStudentPassed = isExamPassed && isAbsencePassed
    println(isStudentPassed)

    val isStudentPassedWithExtraValue = isStudentPassed || isExtraValuePassed
    println(isStudentPassedWithExtraValue)
}