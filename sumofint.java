import java.util.*;
class sumofint
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String s="";
  s+=Math.abs(n);
  String ch="";
  int sum=0;
  for(int i=0;i<s.length();i++)
  {
    ch+=s.charAt(i);
    int val=Integer.parseInt(ch);
    while(val>0)
    {
      int temp=val%10;
      sum+=temp;
      val/=10;
    }
  }
  System.out.println(sum);
}
}
