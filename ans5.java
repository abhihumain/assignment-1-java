//surface area of a sphere
import java.util.*;
public class ans5{
public static void main(String[] args){
	final float pi= 3.14f;
	Scanner sc=new Scanner(System.in);
	String n=sc.nextLine();
	float r=Float.parseFloat(n);
	float sa=pi*4*r*r;
	System.out.print("Surface area is "+sa);
}
}