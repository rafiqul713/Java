/*
Write a program that inputs temperature in degrees Celsius and prints out the
temperature in degrees Fahrenheit. The formula to convert degrees Celsius
to equivalent degrees Fahrenheit is
    Fahrenheit=  1.8*Celsius + 32
*/
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        SampleProgram2 obj= new SampleProgram2();
        double cel;
        System.out.print("Input Degree in Celsius: ");
        cel=scanner.nextDouble();
        System.out.println(cel+" Celsius is "+obj.celsiusToFahrenhite(cel)+" Fahrenhite");
    }
    double celsiusToFahrenhite(double cel){
        return 1.8*cel+32;
    }
}
