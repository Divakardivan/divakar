import java.util.*;
class shufflech
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String s=sc.next();
 char[] str=s.toCharArray();
 boolean a=true;
 for(int i=0;i<str.length-1;i++)
 {
   for(int j=i+1;j<str.length;j++)
     if(str[i]!=str[j])
     {
       char c=str[i+1];
       str[i+1]=str[j];
       str[j]=c;
     }
 }
 for(int i=0;i<str.length-1;i++)
   if(str[i]==str[i+1])
   {
        a=false;
        break;
   }
 System.out.println(a);
}
}
