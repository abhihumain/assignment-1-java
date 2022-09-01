//volume of a cube
import java.util.*;
public class ans10{
public static void main(String[] args){
System.out.println("Enter the edge of the cube");
Scanner e=new Scanner(System.in);
String edge=e.nextLine();
double ee=Double.parseDouble(edge);

double vol=ee*ee*ee;
System.out.print("The volume of the cube is "+vol);

}
}