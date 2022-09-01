//area of a right angeled triangle
import java.util.*;
public class ans8{
public static void main (String[] args){

System.out.println("Enter breadth");
Scanner sc=new Scanner(System.in);
String b=sc.nextLine();
double b1=Double.parseDouble(b);

System.out.println("Enter height");
Scanner sc1=new Scanner(System.in);
String h=sc1.nextLine();
double h1=Double.parseDouble(h);	

double ar=(0.5)*b1*h1;
System.out.print("Area of right angeled triangle is "+ar);
}
}