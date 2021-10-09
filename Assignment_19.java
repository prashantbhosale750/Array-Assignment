import java.util.Scanner;
class Assignment_19
{
public static void main(String [] args)
{
	String b="";
Scanner sc = new Scanner(System.in);
System.out.println("Enter number which you wants to convert in binary....");
int n=sc.nextInt();
int t=n;
while(t>0)
{
	int r = t%2;
	t = t/2;
	b = r+b;
	}
	System.out.println(n+" is in binary ->  "+b);
}
}