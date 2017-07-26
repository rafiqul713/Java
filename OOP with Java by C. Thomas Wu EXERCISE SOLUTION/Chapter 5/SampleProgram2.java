/*
Write a program that displays the recommended weight (kg), given the
user’s age and height (cm). The formula for calculating the recommended
weight is recommendedWeight = (height - 100 + age / 10) * 0.90
Define a service class named Height and include an appropriate method for
getting a recommended weight of a designated height.

if (the height is between 140cm and 230cm)
    compute the recommended weight
else
    display an error message

*/

package Chapter5;

import java.util.Scanner;

/**
 *
 * @author rafiqul
 */

class Height{
    private double recomWeight,age;
    int height;
  
    public void setAge(double age){
        this.age = age;
    }
    public void setHeight(int height){
        this.height=height;
    }
    
    public double getRecommendedWeight(){
        recomWeight= (height-100+ age/10)*0.90;
        return recomWeight;
    }
 
}

public class SampleProgram2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Height obj= new Height();
        int height;
        int age;
        System.out.print("Give your Age: ");
        age=input.nextInt();
        obj.setAge(age);
        System.out.print("Give your Height: ");
        height=input.nextInt();
        obj.setHeight(height);
        if(height>=140 && height<=230){
            System.out.println("Recommended Weight: "+obj.getRecommendedWeight()+" Kg");     
        }
        
        else{
              System.out.println("Input Valid Height");
        }

    }
}
