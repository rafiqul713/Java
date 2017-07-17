/*
Your weight is actually the amount of gravitational attraction exerted on
you by the Earth. Since the Moon’s gravity is only one-sixth of the Earth’s
gravity, on the Moon you would weigh only one-sixth of what you weigh on
Earth. Write a program that inputs the user’s Earth weight and outputs her or
his weight on Mercury, Venus, Jupiter, and Saturn. Use the values in this
table.

Planet              Multiply the Earth Weight by
Mercury------------------------0.4        
Venus--------------------------0.9
Jupiter------------------------2.5
Saturn-------------------------1.1

*/
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram5 {
    public static void main(String[] args){
        final double Mercury=0.4;
        final double Venus=0.9;
        final double Jupiter=0.5;
        final double Saturn=1.1;
        Scanner scanner= new Scanner(System.in);
        double earthWeight;
        System.out.print("Input Earth weight ");
        earthWeight=scanner.nextDouble();
        System.out.println("Weight in Mercury is "+earthWeight*Mercury);
        System.out.println("Weight in Venus is "+earthWeight*Venus);
        System.out.println("Weight in Jupiter is "+earthWeight*Jupiter);
        System.out.println("Weight in Saturn is "+earthWeight*Saturn);
    }
}
