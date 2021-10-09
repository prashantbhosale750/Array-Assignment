//5. How to find kth smallest element in an unsorted array?


class Problems_05
{
public static void main(String []args)
{
int [] a ={8,6,4,3,2,7};

int k=4;

for (int i=0; i<a.length-1; i++)
 {
   for(int j=i+1; j<a.length; j++)
   {
      if(a[i]>a[j])
	  {
	  int temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	  }
   }
 }
  System.out.println(k+"the smallest number is"+a[k-1]);
}

}