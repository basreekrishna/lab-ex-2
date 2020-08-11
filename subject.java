/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.until.*;
/**
 *
 * @author sksba
 */
public class subject {
    
   /**
    * @param args the command line arguments 
    */ 
class AverageMarks
{
   public static void main(String args[])
  {
 string name;

Scanner januu =new Scanner(System.in);

System.out.println("Enter the name ");

String name=januu.nextLine();

System.out.println(" enter the register number ");

int reg=januu.nextInt();

System.out.println(" enter marks of 5 subjects");

int m1=januu.nextInt();

int m2=januu.nextInt();

int m3=januu.nextInt();

int m4=januu.nextInt();

int m5=januu.nextInt();

int total = m1+m2+m3+m4+m5;

double average=total/5.0;

System.out.println("         MARKS LIST OF "+name);

System.out.println();

System.out.println("Total marks obtained ="+total);

System.out.println("Average marks = "+average);

}
}



 
    
