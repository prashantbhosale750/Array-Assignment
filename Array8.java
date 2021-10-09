//Q8 How to find the repeating in an integer array of 1 to 100? 


class Array8
{
	void printRepeating(int arr[])
	{
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < arr.length-1; i++)
		{
			for (j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		Array8 repeat = new Array8();
		int arr[] = {6,5,4,3,7,8,1};
		
		repeat.printRepeating(arr);
	}
}
