/*
Write a program that replies either Leap Year or Not a Leap Year , given a
year. It is a leap year if the year is divisible by 4 but not by 100 (for
example, 1796 is a leap year because it is divisible by 4 but not by 100). A
year that is divisible by both 4 and 100 is a leap year if it is also divisible by
400 (for example, 2000 is a leap year, but 1800 is not).
*/
package Chapter5;
import java.util.*;
/**
 *
 * @author rafiqul
 */

class LeapYear{
    private int year;
    public void setYear(int year){
        this.year=year;
    }
    public boolean isLeapYear(){
        if( (year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0)){
            return true;
        }
        return false;
    }
}
public class SampleProgram3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        LeapYear leapyear= new LeapYear();
        int year;
        while(true){
            System.out.print("Input a year: ");
            year=input.nextInt();
            leapyear.setYear(year);
            if(leapyear.isLeapYear()){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}
