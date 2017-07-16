/*
    Display the current time in the title of a frame window using this format:
    12:45:43 PM .
*/
package Chapter2;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.*;
/**
 *
 * @author rafiqul
 */
public class SampleProgram6 {
    public static void main(String[] args){
        Date date= new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("hh:mm:ss a");
        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setTitle(dateFormat.format(date));
        frame.setVisible(true);
        
    }
}
