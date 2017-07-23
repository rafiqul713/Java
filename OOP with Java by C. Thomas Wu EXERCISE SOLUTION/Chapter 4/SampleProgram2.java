/*
Define a new class named Temperature . The class has two accessors—to-
Fahrenheit and toCelsius —that return the temperature in the specified unit
and two mutators— setFahrenheit and setCelsius —that assign the temperature
in the specified unit. Maintain the temperature internally in degrees Fahrenheit.
Using this class, write a program that inputs temperature in degrees
Fahrenheit and outputs the temperature in equivalent degrees Celsius.
*/
package Chapter4;
import java.util.Scanner;

/**
 *
 * @author rafiqul
 */
class Temperature{
    private double fahrenheit,celsius;
    void setFahrenhite(double fahrenheit){
        this.fahrenheit=fahrenheit;
    }
    
    void setCelsius(double celsius){
        this.celsius=celsius;
    }
    
    double toFahrenheit(){
        return celsius*(9.0/5.0)+32;
    }
    double toCelsius(){
        return (fahrenheit-32)*(5.0/9.0);
    }
}
public class SampleProgram2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Temperature temp= new Temperature();
        double fahrenheit,celsius;
        System.out.print(" Input temperature(degree Fahrenheit): ");
        fahrenheit=input.nextDouble();
        temp.setFahrenhite(fahrenheit);
        System.out.print(" Input temperature(degree Celsius): ");
        celsius=input.nextDouble();
        temp.setCelsius(celsius);
        System.out.println(fahrenheit+" degree Fahrenheit is Equivalent to "+temp.toCelsius()+" degree Celsius");
        System.out.println(celsius+" degree Celsius is Equivalent to "+temp.toFahrenheit()+" degree Fahrenheit");
    }
}
