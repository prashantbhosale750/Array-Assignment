class Assignment_14
{

public static void main(String [] args)
{

for(int i=1;i<=9;i++)
{
	for(int j=1;j<=11;j++)
	{
		if(i%2!=0)
		{
			if(j%2!=0)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		else
		{
			if(i%2==0 && j<12)
			{
							//System.out.print("  ");
                 if(j%2==0)
				System.out.print("*");
			else
				System.out.print(" ");
			}
		}
		
	}
	for(int j=12;j<25;j++)
	{
		
		System.out.print("=");
	}
	
	
	System.out.println();
	
}
for(int i=10;i<25;i++)
{
   for(int j=1;j<25;j++)
   {
	System.out.print("=");
   }
   System.out.println();
}
}
}