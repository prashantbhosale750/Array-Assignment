import java.util.Scanner;

class Assignment_21
{
public static void main(String [] args)
{
int n,t,r,i=1,octal=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a decimal number which you want to convert in octal number");
n = sc.nextInt();
t=n;
while(t!=0)
{
	r = t%8;
	octal = octal + r*i;
	i = i*10;
	t=t/8;
}

System.out.println(octal);
}
}