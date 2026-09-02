/* Name: Riza Jane Antonio 
Course/Year/Section: BSIT NETSEC 1-1 */

import java.util.Scanner;

public class ConcatenateString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        String color;
        String animal;
        String food;
        
        System.out.print("Enter your friend's name: ");
        name = input.next();
        System.out.print("Enter your favorite color: ");
        color = input.next();
        System.out.print("Enter your favorte animal: ");
        animal = input.next();
        System.out.print("Enter your favorite food: ");
        food = input.next();
        System.out.println("I had a dream that "+ name +" ate a "+ color +" "+ animal + " and said it tasted like " + food + "!");
    }
}
