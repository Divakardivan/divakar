import java.util.*;
class addtwonum
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
  for(int i=0;i<n-1;i++)
    for(int j=i+1;j<n;j++)
      for(k=0;k<n;k++)
          if(arr[i]+arr[j]==arr[k])
             System.out.println(arr[i]+"+"+arr[j]+"="+arr[k]);
}
}
