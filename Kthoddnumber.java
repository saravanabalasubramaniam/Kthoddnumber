import java.io.*;
import java.util.*;
public class Kthoddnumber
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
	    arr[i]=input.nextInt();
	}
	int b=input.nextInt();
	int flag=0;
	for(int j=0;j<a;j++)
	{
	    if(arr[j]%2!=0)
	    {
	        flag++;
	    }
	    if(flag==b)
	    {
	        System.out.println(arr[j]);
	        break;
	    }
	}
 }
}
	 
