//surface area of a cube
import java.util.*;
public class ans9{
public static void main(String[] args){
System.out.print("Enter the length of the edge of the cube");
Scanner sc=new Scanner(System.in);
String e=sc.nextLine();
double ee=Double.parseDouble(e);

double sa=6*ee*ee;
System.out.print("Surface area of the cube is "+sa);
}
}