/*
The velocity of a satellite circling around the Earth is computed by the
formula
    
where M_E  5.98 X 10^24 kg is the mass of the Earth, r the distance from the
center of the Earth to the satellite in meters, and G  6.67 X 10^11 m^3/kg.s^2
the universal gravitational constant. The unit of the velocity v is m/s. Write a
program that inputs the radius r and outputs the satellite’s velocity. Confirm
that a satellite that is closer to the Earth travels faster. Define symbolic
constants for M_E and G. The distance to the Hubble Space Telescope from
the center of the Earth, for example, is approximately 6.98X10^6 m.
*/
package Chapter3;
import java.util.Scanner;
/**
 *
 * @author rafiqul
 */
public class SampleProgram4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        final double M_E= 5.58* Math.pow(10,24);
        final double G= 6.67*Math.pow(10,-11);
        double r,v;
        System.out.print("Input radius: ");
        r= scanner.nextDouble();
        v= Math.sqrt((M_E*G)/r);
        System.out.println("Velocity v is "+v);
        
        
    }
}
