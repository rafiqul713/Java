/*
Write a program that accepts a word and prints out the middle character.
The length of the input word is odd. For example, if the input is magnificent ,
which has 11 characters, you output the sixth character f . You use the
division operator /. This operator returns only the quotient. For example, the
expression 10/4 would result in 2 (not 2.5).
*/
package Chapter2;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram9 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        int len=input.length();
        if(len%2!=0){
            int middle=(len/2)+1;
            System.out.println(input.substring(middle-1,middle));
        }
        else{
            System.out.println("The length of the Input should be ODD. You entered EVEN length "
                    + "string");
        }
        
        
    }
}
