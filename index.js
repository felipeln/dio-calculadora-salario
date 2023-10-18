function salaryCalculator(salaryValue,benefitsValue){
  let taxValue
  if (salaryValue >= 0 && salaryValue <= 1100){
    taxValue = 0.05* salaryValue
  }
  if (salaryValue >= 1000.01 && salaryValue <= 2500.00){
    taxValue = 0.1* salaryValue
  }
  if (salaryValue > 2500){
    taxValue = 0.15 * salaryValue
  }
  output = (salaryValue - taxValue) + benefitsValue
  console.log(output)
}


salaryCalculator(2000, 250)