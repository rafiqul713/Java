/*
Write a program that accepts a string input and outputs the number of
characters in the string and the first and last character in separate lines. For
example, if the input is I like Java then the output would be
11
I
a
*/
package Chapter2;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram8 {
   public static void main(String[] args){
       String inputString;
       Scanner scanner= new Scanner(System.in);
       inputString=scanner.nextLine();
       System.out.println(inputString.length());
       System.out.println(inputString.substring(0,1));
       System.out.println(inputString.substring(inputString.length()-1,inputString.length()));
   }
}
