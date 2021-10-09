import java.util.Scanner;

class Assignment_18
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first binary no.");
String binary1 = sc.next();

System.out.println("Enter secound binary no.");
String binary2 = sc.next();

int b1 = Integer.parseInt(binary1,2);
int b2 = Integer.parseInt(binary2,2);
int b3 = b1*b2;

System.out.println("Multiplication is "+Integer.toBinaryString(b3));
}
}