/* Name: Riza Jane Antonio 
Course/Year/Section: BSIT NETSEC 1-1 */

import java.util.Scanner;

public class UsingScanner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        int age;
        
        System.out.print("Enter your first name:");
        firstName = input.next();
        System.out.print("Enter your middle name:");
        middleName = input.next();
        System.out.print("Enter your last name:");
        lastName = input.next();
        System.out.print("Age:");
        age = input.nextInt();
        System.out.println("Full Name:"+ firstName +""+ middleName +""+ lastName);
        System.out.println("Age:" + age);
    }
}
