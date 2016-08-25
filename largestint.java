import java.util.*;
class largestint
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  String[] temp=new String[n];
  String[] res=new String[n];
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
    temp[i]=arr[i]+"";
  }
  Arrays.sort(temp);
  int c=0;
  String a="";
  for(int i=n-1;i>=0;i--)
     {
        res[c]=temp[i];
        a+=res[c];
        c++;
     }
     int val=a.length()%3;
     int count=0;
     String final="";
     String sb="";
     String as="";
     sb+=(a.substring(0,val)+",");
     for(int i=val;i<a.length();i++)
     {
       if(count<3)
       {
          as+=a.charAt(i);
          count++;
          final=as;
       }
       else
       {
         sb+=as+",";
         count=0;
         as="";
         i--;
       }
       sb+=final;
       System.out.println(sb);
     }
    }
  }
  
  
