import java.util.Scanner;
class Assignment_7
{
public static void main(String [] args)
{
int num,r;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number ");
num = sc.nextInt();

for(int i=1;i<=10;i++)
{
r=num*i;
System.out.println(num+" * "+i+" = "+r);
}
}
}