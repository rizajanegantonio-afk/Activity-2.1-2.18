/* Name: Riza Jane Antonio 
Course/Year/Section: BSIT NETSEC 1-1 */

import java.util.Scanner;

public class ScanAndConvert 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String javaGradeStr, cppGradeStr, csharpGradeStr;
        
        System.out.print("Enter your final grade in Java: ");
        javaGradeStr = input.next();
        System.out.print("Enter your final grade in C++: ");
        cppGradeStr = input.next();
        System.out.print("Enter your final grade in C#: ");
        csharpGradeStr = input.next();
        
        double javaGrade = Double.parseDouble(javaGradeStr);
        double cppGrade = Double.parseDouble(cppGradeStr);
        double csharpGrade = Double.parseDouble(csharpGradeStr);
        double totalAverage = (javaGrade + cppGrade + csharpGrade) / 3.0;
        
        System.out.println("Java grade: " + javaGrade);
        System.out.println("C++ grade: " + cppGrade);
        System.out.println("C# grade: " + csharpGrade);
        System.out.println("Total average: " + totalAverage);
    }
}
