/*
Write a program that accepts the unit weight of a bag of coffee in pounds and
the number of bags sold and displays the total price of the sale, computed as
totalPrice= unitWeight * numberOfUnits * 5.99;
totalPriceWithTax = totalPrice + totalPrice * 0.0725;
where 5.99 is the cost per pound and 0.0725 is the sales tax. Display the
result in the following manner:
Number of bags sold: 32   
Weight per bag: 5 lb
Price per pound: $5.99
Sales tax: 7.25%
Total price: $1027.884
*/
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram7 {
    public static void main(String[] args){
        double unitWeight,totalPrice,totalPriceWithTax;
        int numberOfUnit;
        final double cost_per_pound=5.99;
        final double salesTax=0.0725;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input the weight(pound): ");
        unitWeight=scanner.nextDouble();
        System.out.print("Input the number of bags: ");
        numberOfUnit=scanner.nextInt();
        totalPrice=unitWeight*numberOfUnit*cost_per_pound;
        totalPriceWithTax=totalPrice+totalPrice*salesTax;
        System.out.println("Number of bag sold: "+numberOfUnit);
        System.out.println("Weight per bag: "+unitWeight+" lb");
        System.out.println("Price per pound: "+cost_per_pound);
        System.out.println("Sales Tax: "+salesTax*100+"%");
        System.out.println("Total price: "+totalPriceWithTax);
    }
}
