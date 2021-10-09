import java.util.Scanner;
class problem4
{
public static void main(String [] args)
{
int []arr1={2,4,6,8,10};
int [] arr2={1,3,6,7,9};
for(int i=0;i<5;i++)
{
  for(int j=0;j<5;j++)
  {
  if(arr1[i]==arr2[j])
  {
  System.out.println("intersection point in both the arrays is:- "+arr1[i]);
  }
  }
}
}
}