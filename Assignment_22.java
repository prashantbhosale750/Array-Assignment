import java.util.Scanner;
class Assignment_22
{
public static void main(String [] args)
{
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter number which you wants to convert in decimal....");
int n=sc.nextInt();
int t=n;
int i=0,d=0;
while(t>0)
{
	int r = t%10;
	t = t/10;
	d = d + r * (int)Math.pow(2,i++);
	}
	System.out.println(n+" is in decimal ->  "+d);
}
}