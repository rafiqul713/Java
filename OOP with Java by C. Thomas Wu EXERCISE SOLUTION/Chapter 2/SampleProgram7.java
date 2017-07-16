/*
Using the Scanner, input a string that contains a single exclamation mark.
Divide the input string into two strings, one before and the other after the
exclamation mark, and output them. Do not include the exclamation mark in
the output. For example, if the input string is one potato two potato !three ,
then the output would be
one potato two potato
three
*/
package Chapter2;

import java.util.Scanner;

/**
 *
 * @author rafiqul
 */
public class SampleProgram7 {
     public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        int pos=input.indexOf("!");
        if(pos!=-1 && input.length()>1){
            System.out.println(input.indexOf("!"));
            String sub1=input.substring(0,pos);
            System.out.println(sub1.trim());
            String sub2= input.substring(pos+1,input.length());
            System.out.println(sub2.trim());
        }
        
        else{
            System.out.println("Invalid Input. Input should contain Exclamation mark");
        }
    }
}
