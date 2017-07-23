/*
Write a program that computes the total ticket sales of a concert. There are
three types of seatings: A, B, and C. The program accepts the number of
tickets sold and the price of a ticket for each of the three types of seats. The
total sales are computed as follows:
totalSales = numberOfA_Seats * pricePerA_Seat +
numberOfB_Seats * pricePerB_Seat +
numberOfC_Seats * pricePerC_Seat;
Write this program, using only one class, the main class of the program.
*/
package Chapter4;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double A_seating_price,B_seating_price,C_seating_price;
        int numberOf_A_seat,numberOf_B_seat,numberOf_C_seat;
        double total;
        
        System.out.print("Price of seat A: ");
        A_seating_price=scanner.nextDouble();
        System.out.print("\n");
        System.out.print("Number of seat A: ");
        numberOf_A_seat=scanner.nextInt();
        System.out.print("\n");
        
        System.out.print("Price of seat B: ");
        B_seating_price=scanner.nextDouble();
        System.out.print("\n");
        System.out.print("Number of seat B: ");
        numberOf_B_seat=scanner.nextInt();
        System.out.print("\n");
        
        System.out.print("Price of seat C: ");
        C_seating_price=scanner.nextDouble();
        System.out.print("\n");
        System.out.print("Number of seat C: ");
        numberOf_C_seat=scanner.nextInt();
        System.out.print("\n");
        
        total= (A_seating_price*numberOf_A_seat)+ (B_seating_price*numberOf_B_seat)
                +(C_seating_price*numberOf_C_seat);
        System.out.println("Total Price is "+total);
    }
}
