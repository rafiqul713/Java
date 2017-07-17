/*
Leonardo Fibonacci of Pisa was one of the greatest mathematicians of the
Middle Ages. He is perhaps most famous for the Fibonacci sequence, which
can be applied to many diverse problems. One amusing application of the
Fibonacci sequence is in finding the growth rate of rabbits. Suppose a pair of
rabbits matures in 2 months and is capable of reproducing another pair every
month after maturity. If every new pair has the same capability, how many
pairs will there be after 1 year? (We assume here that no pairs die.) The table
below shows the sequence for the first 7 months. Notice that at the end of the
second month, the first pair matures and bears its first offspring in the third
month, making the total two pairs.
    Month No.       Number of Pairs
        1------------------1
        2------------------1
        3------------------2
        4------------------3
        5------------------5
        6------------------8
        7------------------13
The N th Fibonacci number in the sequence can be evaluated with the formula

*/

package Chapter3;

import java.util.Scanner;

/**
 *
 * @author rafiqul
 */
public class SampleProgram6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int F_n,N;
        System.out.print("Input the Nth term: ");
        N= scanner.nextInt();
        F_n = (int) ((1/Math.sqrt(5)) * ( (Math.pow(((1+Math.sqrt(5)) /2) ,N )) - 
                (Math.pow(((1-Math.sqrt(5)) /2) ,N ))));
        System.out.println(N+" th Fibonacci Number is "+F_n);
        
    }
}
