import java.util.Scanner;
class Assignment_23
{
public static void main(String [] args)
{
int k=1,m=0,cr,decno=0;
int hexa[]=new int[100];
Scanner sc = new Scanner(System.in);
System.out.println("Enter any binary number which you want to convert in to hexadecimal");
int binno = sc.nextInt();

while(binno>0)
{
	
	cr=binno%2;
	decno = decno+cr*k;
	k=k*2;
	binno = binno/10;
	
}
k=0;

while(decno!=0)
{
	hexa[k]= decno % 16;
	decno = decno/16;
	k++;
	
}
System.out.print("the HexaDecimal is: ");
for(m=k-1;m>=0;m--)
{
	if(hexa[m]>9)
	{
		System.out.print((char)(hexa[m]+55));
		
	}else
	{
		System.out.print(hexa[m]);
	}
}
System.out.println();
}
}