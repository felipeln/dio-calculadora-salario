using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter salary value: ");
        string salaryInput = Console.ReadLine();
        if (float.TryParse(salaryInput, out float salaryValue))
        {
            Console.WriteLine("Enter benefits value: ");
            string benefitsInput = Console.ReadLine();
            if (float.TryParse(benefitsInput, out float benefitsValue))
            {
                float taxValue = 0;
                if (salaryValue >= 0 && salaryValue <= 1100)
                {
                    taxValue = 0.05F * salaryValue;
                }
                if (salaryValue >= 1000.01 && salaryValue <= 2500.00)
                {
                    taxValue = 0.1F * salaryValue;
                }
                if (salaryValue > 2500)
                {
                    taxValue = 0.15F * salaryValue;
                }

                float output = (salaryValue - taxValue) + benefitsValue;
                Console.WriteLine(output.ToString("0.00"));
            }
            else
            {
                Console.WriteLine("Invalid benefits value.");
            }
        }
        else
        {
            Console.WriteLine("Invalid salary value.");
        }
    }
}
