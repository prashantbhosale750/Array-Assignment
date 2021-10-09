import java.util.Scanner;
class Assignment_25
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Octal Number");
int t = sc.nextInt();
int n = t;
int r,sum=0,i=0;
while(n!=0)
{
r=n%10;
sum+=r*Math.pow(8,i++);
n=n/10;
}
System.out.println(t+" is in deciaml is --> "+sum);
}
}