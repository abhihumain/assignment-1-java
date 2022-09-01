//surace area of a cone
import java.util.*;
import java.lang.Math;
public class ans7{
public static void main(String[] args){
	final float pi=3.14f;
	System.out.print("Enter radius of cone");
	Scanner sc=new Scanner(System.in);
	double r=sc.nextDouble();
	System.out.print("Enter height of the cone");
	Scanner sc1=new Scanner(System.in);
	double h=sc1.nextDouble();
	double sa=pi*r*(r+Math.sqrt(h*h+r*r));
	System.out.print("Surface area of cone is "+sa);
}
}