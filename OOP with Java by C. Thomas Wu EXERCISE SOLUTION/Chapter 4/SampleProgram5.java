/*
Write a program that accepts the unit weight of a bag of coffee in pounds
and the number of bags sold and displays the total price of the sale,
computed as follows:
totalPrice= bagWeight * numberOfBags * pricePerLb;
totalPriceWithTax = totalPrice + totalPrice * taxrate;
Display the result in the following manner:
Number of bags sold: 32   
Weight per bag: 5 lb
Price per pound: $5.99
Sales tax: 7.25%
Total price: $1027.884
Define and use a programmer-defined CoffeeBag class. Include class
constants for the price per pound and tax rate with the values $5.99 per
pound and 7.25 percent, respectively.
*/
package Chapter4;

import java.util.Scanner;

/**
 *
 * @author rafiqul
 */

class CofeeBag{
    static double valuePerPound=5.99;
    static double tax=0.0725;
    private double bagWeight,totalPrice,totalPriceWithTax;
    private int numOfBag;
    void setWeight(double bagWeight){
        this.bagWeight=bagWeight;
    }
    void setNumOfBag(int numOfBag){
        this.numOfBag=numOfBag;
    }
    double getValuePerPound(){
        return valuePerPound;
    }
    
    double getSalesTax(){
        return tax;
    }
    double getWeightPerBag(){
        return bagWeight;
    }
    int getNumOfBag(){
        return numOfBag;
    }
    
    double calculateTotalPrice(){
        totalPrice=bagWeight*numOfBag*valuePerPound;
        totalPriceWithTax=totalPrice+totalPrice*tax;
        return totalPriceWithTax;
    }
}
public class SampleProgram5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CofeeBag cofeebag= new CofeeBag();
        double bagWeight;
        int numOfBag;
        System.out.print("Input the weight(pound): ");
        bagWeight=input.nextDouble();
        cofeebag.setWeight(bagWeight);
        System.out.print("Input the number of bags: ");
        numOfBag=input.nextInt();
        cofeebag.setNumOfBag(numOfBag);
        System.out.println("Number of bag sold: "+cofeebag.getNumOfBag());
        System.out.println("Weight per bag: "+cofeebag.getWeightPerBag()+" lb");
        System.out.println("Price per pound: "+CofeeBag.valuePerPound);
        System.out.println("Sales Tax: "+CofeeBag.tax*100+"%");
        System.out.println("Total price: "+cofeebag.calculateTotalPrice());
        
        
        
    }
}
