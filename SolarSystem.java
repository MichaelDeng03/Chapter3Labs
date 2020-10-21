import java.util.Scanner;
/**
Michael Deng
Oct 20, 2020
Asks user for their weight, and outputs their weight on their chosen planet. 
 */
public class SolarSystem
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your weight (int)");
        int weight = keyboard.nextInt(); //
        
        //Prints out a column of possible planets and their corrresponding numbers, and asks the user to enter one of their 
        //corresponding numbers
        System.out.println("1 = Mercury");
        System.out.println("2 = Venus");
        System.out.println("3 = Earth");
        System.out.println("4 = Mars");
        System.out.println("5 = Jupiter");
        System.out.println("6 = Saturn");
        System.out.println("7 = Uranus");
        System.out.println("8 = Neptune");
        System.out.println("9 = Pluto");
        System.out.println("10 = Moon");
        System.out.println("Enter the number of your chosen celestial body");
        int x = keyboard.nextInt();
        
        switch(x) //Based off the planet they chose, multiply their weight by that planets gravity relative to earth, and print
            {
       
                case 1:  System.out.println(weight*0.055); break;
                case 2:  System.out.println(weight*0.815); break;
                case 3:  System.out.println("???? dummy"); break;
                case 4:  System.out.println(weight*0.107); break;
                case 5:  System.out.println(weight*317.8); break;
                case 6:  System.out.println(weight*95.16); break;
                case 7:  System.out.println(weight*14.54); break;
                case 8:  System.out.println(weight*17.15); break; 
                case 9:  System.out.println(weight*0.050); break; 
                case 10: System.out.println(weight*.0165); break;
                
            }
    }
}
