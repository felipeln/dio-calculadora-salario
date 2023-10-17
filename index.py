def salaryCalculator(salaryValue,benefitsValue):
  if (salaryValue >= 0 and salaryValue <= 1100):
    taxValue = 0.05* salaryValue
  if (salaryValue >= 1000.01 and salaryValue <= 2500.00):
    taxValue = 0.1* salaryValue
  if (salaryValue > 2500):
    taxValue = 0.15 * salaryValue
  output = (salaryValue - taxValue) + benefitsValue
  print(output)

salaryCalculator(2000,250)