fun calculateTax(salaryValue: Float, benefitsValue: Float): Float {
    var taxValue = 0.0f

    if (salaryValue >= 0 && salaryValue <= 1100) {
        taxValue = 0.05f * salaryValue
    }
    if (salaryValue >= 1000.01 && salaryValue <= 2500.00) {
        taxValue = 0.1f * salaryValue
    }
    if (salaryValue > 2500) {
        taxValue = 0.15f * salaryValue
    }

    val output = (salaryValue - taxValue) + benefitsValue
    return output
}

fun main() {
    // Example usage of the calculateTax function
    val salary = 3000f
    val benefits = 500f

    val result = calculateTax(salary, benefits)
    println("After tax and benefits, the final value is: $result")
}
