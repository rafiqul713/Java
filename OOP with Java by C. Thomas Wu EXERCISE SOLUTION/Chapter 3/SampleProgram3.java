/*
Write a program that accepts a person’s weight and displays the number of
calories the person needs in one day. A person needs 19 calories per pound
of body weight, so the formula expressed in Java is
calories = bodyWeight * 19;
(Note: We are not distinguishing between genders.)
 */
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double cal,bodyWeight;
        System.out.print("Input body Weight(Pound): ");
        bodyWeight=scanner.nextDouble();
        System.out.println("Calory needed "+bodyWeight*19);
    }
}
