/*
    Write a program to display today’s date in this format: Monday December 10, 
    2008.
    Use the console window for output.
*/
package Chapter2;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author rafiqul
 */
public class SampleProgram4 {
    public static void main(String[] args){
        Date date= new Date();
        SimpleDateFormat simpleDate= new SimpleDateFormat("EEEE MMMM dd, YYYY");
        System.out.println(simpleDate.format(date));
    }
}
