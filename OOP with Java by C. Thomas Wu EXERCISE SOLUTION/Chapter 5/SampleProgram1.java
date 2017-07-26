/*
One million is 10^6 and 1 billion is 10^9 . Write a program that reads a power
of 10 (6, 9, 12, etc.) and displays how big the number is ( Million , Billion ,
etc.). Display an appropriate message for the input value that has no
corresponding word. The table below shows the correspondence between
the power of 10 and the word for that number.
Power of 10     Number
    6            Million
    9            Billion
    12           Trillion
    15           Quadrillion
    18           Quintillion
    21           Sextillion
    30           Nonillion
    100          Googol


*/

package Chapter5;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int power;
        System.out.print("Give the power of 10: ");
        power=input.nextInt();
        if(power==6){
            System.out.println("Million");
        }
        else if(power==9){
             System.out.println("Billion");
        }
        
        else if(power==9){
             System.out.println("Trillion");
        }
        else if(power==12){
            System.out.println("Quadrillion");
        }
        else if(power==15){
            System.out.println("Quintillion");
        }
        else if(power==18){
            System.out.println("Sextillion");
        }
        else if(power==21){
            System.out.println("Nonillion");

        }
        else if(power==100){
            System.out.println("Googol");

        }
        else{
            System.out.println("Does not Match");
        }
        
    }
}
