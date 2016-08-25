import java.util.*;
class leastdigit
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  int n=sc.nextInt();
  char[] arr=s.toCharArray();
  Arrays.sort(arr);
  String sb="";
  int val=arr.length-n;
  for(int i=0;i<val;i++)
     sb+=arr[i];
  System.out.println(sb);
}
}
