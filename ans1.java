//circumference of a circle
import java.util.*;
class ans1{
public static void main(String[] args){
	final float pi =3.14f;
	Scanner sc=new Scanner(System.in);
	String r1=sc.nextLine();
	float r2=Float.parseFloat(r1);
	System.out.print("Enter radius");
	float ci=pi*2*r2;
	System.out.print("Circumference is "+ci);
}
}