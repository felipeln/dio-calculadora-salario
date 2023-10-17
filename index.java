import java.util.Scanner;
public class index
{
	public static void main(String[] args){
    // le os valores de entrada
    Scanner entry = new Scanner(System.in);
    float salaryValue = entry.nextFloat();
    float benefitsValue = entry.nextFloat();

    float taxValue = 0;
    if (salaryValue >= 0 && salaryValue <= 1100){
      taxValue = 0.05F * salaryValue;
    }
    if (salaryValue >= 1000.01 && salaryValue <= 2500.00){
      taxValue = 0.1F * salaryValue;
    }
    if (salaryValue > 2500){
      taxValue = 0.15F * salaryValue;
    }

    float output = (salaryValue - taxValue) + benefitsValue;
    System.out.println(String.format("%.2f", output));
  }
}