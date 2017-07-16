/*
    Write a program that displays a frame window W pixels wide and H pixels
    high. Use the Scanner to enter the values for W and H . The title of the frame
    is also entered by the user.

*/
package Chapter2;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram5 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int W,H;
        String title;
        System.out.print("Enter the value of W: ");
        W=scanner.nextInt();
        System.out.print("\n");
        System.out.print("Enter the value of H: ");
        H=scanner.nextInt();
        System.out.print("\n");
        System.out.print("Enter the title of Frame: ");
        title=scanner.next();
        
        JFrame frame=new JFrame();
        frame.setSize(W,H);
        frame.setTitle(title);
        frame.setVisible(true);
    }
}
