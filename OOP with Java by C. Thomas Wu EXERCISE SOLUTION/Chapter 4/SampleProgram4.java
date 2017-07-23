/*
Write a WeightConverter class. An instance of this class is created by
passing the gravity of an object relative to the Earth’s gravity.
Use the values in this table.
Planet              Multiply the Earth Weight by
Mercury------------------------0.4        
Venus--------------------------0.9
Jupiter------------------------2.5
Saturn-------------------------1.1
For example, the Moon’s gravity is approximately 0.167 of the Earth’s gravity, 
so we create a WeightConverter instance for the Moon as 
WeightConverter moonWeight; 
moonWeight = new WeightConverter( 0.167 );
To compute how much you weigh on the Moon, you pass your weight on
Earth to the convert method as yourMoonWeight = moonWeight.convert( 160 );
*/
package Chapter4;
import java.util.*;
/**
 *
 * @author rafiqul
 */
class WeightConverter{
     double weight;
     double gravity;

    public WeightConverter(double gravity) {
        this.gravity=gravity;
    }
    double convert(double w){
        weight=w;
        return weight*gravity;
    }
     
     
}
public class SampleProgram4 {
    public static void main(String[] args){
        final double Mercury=0.4;
        final double Venus=0.9;
        final double Jupiter=0.5;
        final double Saturn=1.1;
        final double Moon=0.167;
        

        WeightConverter yourMercuryWeight= new WeightConverter(Mercury);
        WeightConverter yourVenusWeight= new WeightConverter(Venus);
        WeightConverter yourJupiterWeight= new WeightConverter(Jupiter);
        WeightConverter yourSaturnWeight= new WeightConverter(Saturn);
        WeightConverter yourMoonWeight= new WeightConverter(Moon);
        Scanner input= new Scanner(System.in);
        double your_earth_weight;
        System.out.print("Give your Earth Weight: ");
        your_earth_weight=input.nextDouble();
        System.out.println("Your Mercury Weight: "+yourMercuryWeight.convert(your_earth_weight));
        System.out.println("Your Venus Weight: "+yourVenusWeight.convert(your_earth_weight));
        System.out.println("Your Jupiter Weight: "+yourJupiterWeight.convert(your_earth_weight));
        System.out.println("Your Saturn Weight: "+yourSaturnWeight.convert(your_earth_weight));
        System.out.println("Your Moon Weight: "+yourMoonWeight.convert(your_earth_weight));
        
    }
}
