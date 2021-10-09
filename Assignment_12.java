import java.util.Scanner;
class Assignment_12
{
public static void main(String [] args)
{
int num1,num2,num3,avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number 1st");
num1=sc.nextInt();

System.out.println("Enter number 2nd");
num2=sc.nextInt();

System.out.println("Enter number 3rd");
num3=sc.nextInt();

 int sum= num1+num2+num3;
 avg = sum/3;
System.out.println("average of "+num1+" , "+num2+" and "+num3+" is "+avg);

}
}