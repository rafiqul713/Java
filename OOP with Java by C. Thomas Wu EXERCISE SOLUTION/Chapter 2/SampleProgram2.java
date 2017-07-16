/*
Input the user’s first and last name as two separate strings. Then display a
frame window with its title set to <last> , <first> , where <last> and <first> are
the input values. For example, if the input values are Johann and Strauss ,
then the title would be Strauss , Johann .
*/
package Chapter2;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author rafiqul
 */
public class SampleProgram2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String firstName,lastName;
        System.out.print("Input First Name: ");
        firstName=scanner.next();
        System.out.print("\n");
        System.out.print("Input Last Name: ");
        lastName=scanner.next();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle(lastName+" "+firstName);
        frame.setVisible(true);
        
    }
}
