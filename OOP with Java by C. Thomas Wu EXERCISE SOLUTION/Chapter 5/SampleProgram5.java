/*
Define a class called Triangle that is capable of computing the perimeter and
area of a triangle, given its three sides a , b , and c. Notice
that side b is the base of the triangle.
Define a private method isValid to check the validity of three
sides. If any one of them is invalid, the methods getArea and getPerimeter
will return the constant INVALID_DIMENSION .
*/
package Chapter5;
import java.util.*;
/**
 *
 * @author rafiqul
 */

class Triangle{
    private int a,b,c,perimeter;
    double area;
    final static double INVALID_DIMENSION=-1;
    
    private boolean isValid(int a,int b, int c){
        if( (a+b>c) && (a+c>b) && (b+c>a)){
            return true;
        }
        
        return false;
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getArea() {
        if(isValid(a,b,c)==true){
            double s= (a+b+c)/2;
            area= Math.sqrt( s*(s-a)*(s-b)*(s-c) );
            return area;     
        }
        
        else{
            return INVALID_DIMENSION;
        }

    }

    public int getPerimeter() {
        if(isValid(a,b,c)==true){
            perimeter=(a+b+c);
            System.out.println("Perimeter");
            return perimeter;
            
        }

        else{
            return (int)INVALID_DIMENSION;
        }

    }
    
    
}
public class SampleProgram5 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int a,b,c,perimeter;
        double area;
        Triangle obj= new Triangle();
        System.out.print("Give the length of a: ");
        a=input.nextInt();
        System.out.print("Give the length of b(base): ");
        b=input.nextInt();
        System.out.print("Give the length of c: ");
        c= input.nextInt();
        obj.setA(a);
        obj.setB(b);
        obj.setC(c);
        area=obj.getArea();
        perimeter=obj.getPerimeter();
        if(area!=Triangle.INVALID_DIMENSION && perimeter!=Triangle.INVALID_DIMENSION){
            System.out.println("Area is: "+area);
            System.out.println("Perimeter is: "+perimeter);
                    
        }
        else{
            System.out.println("Invalid Dimension");
        }
    }
    
}
