//area of a circle
import java.util.*;
public class ans2{
public static void main(String[] ags){
	final float pi=3.14f;
	Scanner sc=new Scanner(System.in);
	String r1=sc.nextLine();
	float r2=Float.parseFloat(r1);
	float ar=pi*r2*r2;
	System.out.print("Area is"+ ar);
}
}