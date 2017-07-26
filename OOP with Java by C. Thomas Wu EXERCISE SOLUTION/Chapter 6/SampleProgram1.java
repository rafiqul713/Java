/*
A prime number is an integer greater than 1 and divisible by only itself and
1. The first seven prime numbers are 2, 3, 5, 7, 11, 13, and 17. Write a
method that returns true if its parameter is a prime number. Using this
method, write a program that repeatedly asks the user for input and displays
Prime if the input is a prime number and Not Prime , otherwise. Stop the
repetition when the input is a negative number.
*/
package Chapter6;
import java.util.*;
/**
 *
 * @author rafiqul
 */


public class SampleProgram1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Inout a number: ");
            num= input.nextInt();
            if(num<0){
                break;
            }
            if(isPrime(num)){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
