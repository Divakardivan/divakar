import java.util.*;
class DescByBinary
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  String[] as=new String[n];
  for(int i=0;i<n;i++)
  {
     arr[i]=sc.nextInt();
     as[i]=Integer.toBinaryString(arr[i]);
  }
  int count=0;
  int[] c=new int[n];
  for(int i=0;i<n;i++)
  { 
    count=0;
    for(int j=0;j<as[i].length();j++)
    { 
      if(as[i].charAt(j)=='1')
          count++;
    }
    c[i]=count;
  }
  for(int i=0;i<n-1;i++)
  {
  for(int j=i+1;j<n;j++)
  {
    if(c[i]<c[j])
    {
      String temp="";
      temp=as[i];
      as[i]as[j];
      as[j]=temp;
    }
    if(c[i]==c[j])
    {
     int a=Integer.parseInt(as[i],2);
     int b=Integer.parseInt(as[j],2);
     if(a<b)
     {
        String temp="";
        temp=as[i];
        as[i]=aas[j];
        as[j]=temp;
     }
    }
  }
  }
  String res="";
  for(int i=0;i<n;i++)
    res+=Integer.parseInt(as[i],2)+" ";
  System.out.println(res.trim());
}
}
