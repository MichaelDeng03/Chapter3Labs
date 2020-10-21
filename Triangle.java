import java.util.Scanner;
/**
Michael Deng
Triangle Program
October 20th, 2020
 */
public class Triangle
{
    public static void main (String [] args)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Angles or Sides?");
            String answer = keyboard.nextLine();
            System.out.println("input values for either angles or sides");
            int a = keyboard.nextInt();
            int b = keyboard.nextInt();
            int c = keyboard.nextInt();
            
            if (answer.equals("Angles"))
            {
                if((a+b+c)==180 && ((a>0)&&(b>0)&&(c>0))) //Verification that triangle is possible
                {
                   //Checks to see if triangle is right, isosceles, equilateral, or none. 
                   if(a==90 || b==90 || c==90)
                        System.out.println("Right triangle");
                   else if((a==b && a!=c) || (b==c && a!=b))
                        System.out.println("Isosceles");
                   else if(a==b && b==c)
                        System.out.println("Equilateral");
                   else
                        System.out.println("None");
                
                }
                else
                    System.out.println("error"); //If the triangle can't exist. 
            }
            else if (answer.equals("Sides"))
            {
                if (((a+b)>c && (a+c)>b && (b+c)>a) && (a>0)&&(b>0)&&(c>0)) //Verification that the triangle is possible
                {
                     //Checks to see if equilateral, isosceles, scalene. No none, because scalene is basically the same as none. 
                     if(a==b && b==c)
                        System.out.println("Equilateral triangle");
                     else if((a==b && a!=c) || (b==c && a!=b))
                        System.out.println("Isosceles");
                     else if((a!=b) && (a!=c) && (b!=c))
                        System.out.println("scalene");
                }
                else
                    System.out.println("error"); //If the triangle cant exist
            }
            else //If the user didn't input Angles or Sides
                System.out.println("error");
        }
}

/*
Angles or Sides?
Angles
input values for either angles or sides
90
40
50
Right triangle

Angles or Sides?
Angles
input values for either angles or sides
60
60
60
Equilateral

Angles or Sides?
Angles
input values for either angles or sides
50
50
80
Isosceles

Angles or Sides?
Angles
input values for either angles or sides
50
60
70
None

Angles or Sides?
Sides
input values for either angles or sides

5
5
5
Equilateral triangle

Angles or Sides?
Sides
input values for either angles or sides
12
7
7
Isosceles

Angles or Sides?
Sides
input values for either angles or sides
4
5
6
scalene

 */
