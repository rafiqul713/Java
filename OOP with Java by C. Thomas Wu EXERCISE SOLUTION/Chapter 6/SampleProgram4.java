/*
A formula to compute the Nth Fibonacci number was given in Exercise 10 in
Chapter 3. The formula is useful in finding a number in the sequence, but a
more efficient way to output a series of numbers in the sequence is to use the
recurrence relation Fn= Fn-1 + Fn-2 , with the first two numbers in the
sequence F 1 and F 2 both defined as 1. Using this recurrence relation, we can
compute the first 5 Fibonacci numbers as follows:
F1= 1
F2=1
F3=F1+F2=1+1=2
F4=F2+F3=1+2=3
F5= F3+F4=2+3=5
Write a program that accepts N, N >= 1, from the user and displays the first N
numbers in the Fibonacci sequence.
*/
package Chapter6;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram4 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
         System.out.print("Input N: ");
        n=input.nextInt();
         System.out.println("First "+n+" number in Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.println(fib(i));
        }
    }
     
     public static int fib(int n){
         if(n==1){
             return 1;
         }
         else if(n==2){
             return 1;
         }
         else{
             return fib(n-1)+fib(n-2);
         }
     }
}
