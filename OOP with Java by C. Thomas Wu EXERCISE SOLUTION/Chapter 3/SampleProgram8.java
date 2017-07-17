/*
If the population of a country grows according to the formula



where y is the population after x years from the reference year, then we can
determine the population of a country for a given year from two census
figures. For example, given that a country with a population of 1,000,000 in
1970 grows to 2,000,000 by 1990, we can predict the country’s population in
the year 2000. Here’s how we do the computation. Letting x be the number
of years after 1970, we obtain the constant c as 1,000,000 because


Then we determine the value of k as


Finally we can predict the population in the year 2000 by substituting
0.03466 for k and 30 for x (2000 Ϫ 1970 ϭ 30). Thus, we predict

as the population of the country for the year 2000. Write an application that
accepts five input values—year A, population in year A, year B, population
in year B, and year C—and predict the population for year C.
*/
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram8 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double e,k,x;
        int yearA, populationInYearA,yearB,populationInYearB,yearC;
        int c,y;
        System.out.print("Input year A: ");
        yearA=scanner.nextInt();
        System.out.print("Population in year A: ");
        populationInYearA=scanner.nextInt();
        System.out.print("Input year B: ");
        yearB=scanner.nextInt();
        System.out.print("Population in year B: ");
        populationInYearB=scanner.nextInt();
        System.out.print("Input Year C (Predicted population): ");
        yearC= scanner.nextInt();
        x=yearB-yearA;
        c=populationInYearA;
        k= (1/x)* Math.log(populationInYearB/c);
        System.out.println("k "+k);
        System.out.println("x "+x);
        x= yearC-yearA;
        System.out.println("x "+x);
        y=(int) (c*Math.exp(k*x));
        System.out.println("y "+y);
        
        
        
        
    }
}
