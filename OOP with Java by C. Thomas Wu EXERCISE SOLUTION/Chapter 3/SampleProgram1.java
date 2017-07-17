/*
Write a program to convert centimeters (input) to feet and inches (output).
1 in ϭ 2.54 cm.
*/
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram1 {
    public static void main(String[] args){
        double centi;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input Centimeter: ");
        centi=scanner.nextInt();
        SampleProgram1 obj= new SampleProgram1();
        System.out.println("Centimeter to Inches "+obj.centiToInches(centi));
        System.out.println("Centimeter to Feet "+obj.centiToFeet(centi));
        
    }
    double centiToFeet(double centi){
        return centi*0.0328;
    }
    
    double centiToInches(double centi){
        return centi* 0.3937;
    }
}
