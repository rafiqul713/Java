/*
A perfect number is a positive integer that is equal to the sum of its proper
divisors. A proper divisor is a positive integer other than the number itself
that divides the number evenly (i.e., no remainder). For example, 6 is a
perfect number because the sum of its proper divisors 1, 2, and 3 is equal
to 6. Eight is not a perfect number because 1+2+4!=8 . Write a
program that accepts a positive integer and determines whether the number
is perfect. Also, display all proper divisors of the number.
*/
package Chapter6;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram3 {
     public static void main(String[] args){
        int num;
        int j;
        int[] divisor_list=new int[100000];
        int sum=0;
        Scanner input=new Scanner(System.in);
        while(true){
            sum=0;
            j=0;
            System.err.print("Input a Number: ");
            num=input.nextInt();
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                    divisor_list[j]=i;
                    j++;
                }
            }
            
            if(sum==num){
                System.out.println(num+" is a Perfect Number");
                System.out.print(num+"'s Proper divisors are: ");
                for(int i=0;i<j;i++){
                    System.out.print(divisor_list[i]+" ");
                }
                System.out.println("\n");
            }
            
            else{
                System.out.println(num+" is Not Perfect Number");
            }
            
            
        }
        
    }
}
