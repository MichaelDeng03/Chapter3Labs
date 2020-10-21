import java.util.Scanner;
/*
Michael Deng
October 16, 2020
Leap Year program
*/
public class LeapYear
{  
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a year");
        int year = keyboard.nextInt();
        
        
        if(year>1582) //Fails if year is less than 1583
        {
            if(year%4==0 && !(year%100==0 && year%400!=0)) //True if divisible by 4 unless divisible by 100 but not for 400
            {
                System.out.println("Leap year");
            }    
            else
                System.out.println("Not a leap year");
        }
        else
            System.out.println("error"); //If year is less than 1583
    }
    
}

/*
Input a year
1583
Not a leap year

Input a year
1581
error

Input a year
1900
Not a leap year

Input a year
1984
Leap year

Input a year
2000
Leap year


 */
