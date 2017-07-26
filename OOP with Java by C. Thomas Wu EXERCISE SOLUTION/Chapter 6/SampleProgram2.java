/*
There are 25 primes between 2 and 100, and there are 1229 primes between
2 and 10,000. Write a program that inputs a positive integer N>2 and
displays the number of primes between 2 and N (inclusive). Use the timing
technique to show the amount of time it took to compute the result.
*/
package Chapter6;
import java.util.*;
/**
 *
 * @author rafiqul
 */
public class SampleProgram2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num;
        System.out.print("Input N: ");
        num=input.nextInt();
        Date startTime= new Date();
        System.out.println("There are "+counter(num)+" primes between "+ 2+" and "+num);
        Date endTime= new Date();
        long diff=  (endTime.getTime()- startTime.getTime());
        System.out.println("Time it took to compute the Result: "+diff+" Millisecond");
    }
    
    public static int counter(int n){
        int Count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                Count++;
            }
        }
        return Count;
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
