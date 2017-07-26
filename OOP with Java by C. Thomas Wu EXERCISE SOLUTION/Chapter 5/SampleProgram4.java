/*
Employees at MyJava Lo-Fat Burgers earn the basic hourly wage of $7.25.
They will receive time-and-a-half of their basic rate for overtime hours.
In addition, they will receive a commission on the sales they generate
while tending the counter. The commission is based on the following
formula:

    IMAGE

Write a program that inputs the number of hours worked and the total sales
and computes the wage.
*/
package Chapter5;
import java.util.*;
/**
 *
 * @author rafiqul
 */
class Employee{
    private int hour=0;
    private double sales=0.0;
    private double wages=0.0;
    final double hourly_wage=7.25;
    final int workedHour=8;
    private double comission=0.0;
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setSell(double sales){
        this.sales=sales;
    }
    public double totalSellComission(){
        if(sales>=1.0 && sales<=99.99){
            comission= sales*0.05;
        }
        else if(sales>=100.00 && sales<=299.99){
            comission=sales*.10;
        }
        else if(sales>=300.00){
            comission=sales*.15;
        }

        return comission;
    }
    public double calculateWage(){
        if(hour>workedHour){
            int overTime=hour- workedHour;
            System.out.println("Your over time is: "+overTime+" hours");
            wages= (workedHour*hourly_wage) + totalSellComission()+ overTime*(hourly_wage/2);
        }
        else if(hour<=workedHour){
            wages= (hour*hourly_wage) + totalSellComission();
        }

        return wages;
    }
}
public class SampleProgram4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee emp= new Employee();
        int hour;
        double sells;
        System.out.print("Number of hours: ");
        hour=input.nextInt();
        System.out.print("Total Sells: ");
        sells=input.nextDouble();
        emp.setHour(hour);
        emp.setSell(sells);
        System.out.println("Wages "+emp.calculateWage());
    }
    
}
