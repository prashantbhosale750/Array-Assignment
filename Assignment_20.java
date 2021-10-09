import java.util.Scanner;
class Assignment_20
{
public static void main(String [] args)
{
int n,t,r,i,j=0;
char hexa[]=new char[100];
Scanner sc = new Scanner(System.in);
System.out.println("Enter decimal number which you want to convert in to hexadecimal..");
 n = sc.nextInt();
 t = n;

while(t!=0)
{
r=t%16;
if(r<10)
{
hexa[j++]=(char)(48+r);
}
else
{
	hexa[j++]=(char)(55+r);
}
t=t/16;
}
System.out.print("Hexadecimal value of "+n+" = ");
for(i=j-1;i>=0;i--)
{
	System.out.println(hexa[i]);
}

}
}