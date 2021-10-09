import java.util.Scanner;
class Assignment_6
{
public static void main(String [] args)
{
int num1,num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number 1st");
num1=sc.nextInt();

System.out.println("Enter number 2nd");
num2=sc.nextInt();

int Add = num1 + num2;
System.out.println("Addition = "+Add);

int Sub = num1 - num2;
System.out.println("Subtract = "+Sub);

int product = num1*num2;
System.out.println("product = "+product);

int div = num1 / num2;
System.out.println("Division = "+div);

int rem = num1 % num2;
System.out.println("remainder = "+rem);
}
}