import java.util.Scanner;
class Assignment_24
{
public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter binary number which you want to convert in to octal number");
int binNo = sc.nextInt();
int decNo = 0,octNo = 0,i=0;

while(binNo != 0)
{
int r = binNo%10;
decNo = decNo + r * (int)Math.pow(2,i++);
binNo = binNo/10;
}
i=1;
while(decNo!=0)
{
int r = decNo%8;
octNo = octNo + r*i;
i=i*10;
decNo = decNo/8;
}
System.out.println("octal number is  "+octNo);
}
}