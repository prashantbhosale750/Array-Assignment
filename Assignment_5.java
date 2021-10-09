import java.util.Scanner;
class Assignment_5
{
public static void main(String [] args)
{
int num1,num2,product;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number 1st");
num1=sc.nextInt();

System.out.println("Enter number 2nd");
num2=sc.nextInt();

product = num1*num2;
System.out.println("product of "+num1+" and "+num2+" is = "+product);

}
}