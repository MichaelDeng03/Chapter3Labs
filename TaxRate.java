import java.util.Scanner;
/**
Michael Deng
Oct 20, 2020
Calculates how much tax you would pay in 1916 based on your inputted income.
 */
public class TaxRate
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your income (int)");
        int income = keyboard.nextInt();
        double tax; 
        
        if (income > 500000)
        {
            tax = (income - 500000)*0.06 + 250000*0.05 + 150000*0.04 + 25000*0.03 + 25000*0.02 + 50000*0.01;
        }
        else if (income > 250000)
        {
            tax = (income - 250000)*0.05 + 150000*0.04 + 25000*0.03 + 25000*0.02 + 50000*0.01;
        }
        else if (income > 100000)
        {
            tax = (income - 100000)*0.04 + 25000*0.03 + 25000*0.02 + 50000*0.01;
        }
        else if (income > 750000)
        {
             tax = (income - 75000)*0.03 + 25000*0.02 + 50000*0.01;    
        }
        else if (income > 50000)
        {
             tax = (income - 50000)*0.02 + 50000*0.01;    
        }
        else
        {
            tax = income*0.01;
        }    
        System.out.println("With an income of $" + income + ", you will pay $" + tax + " in taxes");
    }
}
