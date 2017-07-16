/*
    Write a program to display today’s date in this format: 10 December 2008.
    Use the console window for output.
 */
package Chapter2;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author rafiqul
 */
public class SampleProgram3 {
    public static void main(String[] args){
        Date today=new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MMMM/YYYY");
        System.out.println(dateFormat.format(today));
    }
}
