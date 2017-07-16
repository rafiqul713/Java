/*
Write a program that displays a frame window 800 pixels wide and 600 pixels
high. Set the title of the frame to Welcome to Java .

*/
package Chapter2;
import javax.swing.*;
/**
 *
 * @author rafiqul
 */
public class SampleProgram1 {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setSize(800,600);
        frame.setTitle("Welcome to Java");
        frame.setVisible(true);
        
    }
}
