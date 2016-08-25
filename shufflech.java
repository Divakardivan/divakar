import java.util.*;
class shufflech
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 StringBuffer s=new StringBuffer(sc.next());
 String str="";
 for(int i=0;i<s.length()-1;i++)
 {
   for(int j=i+1;j<s.length();j++)
   {
     if(s.charAt(i)!=s.charAt(j))
     {
        str+=s.charAt(i)+"";
        break;
     }
   }
 }
 boolean a=false;
 if(s.length()==str.length())
 {
   for(int i=0;i<str.length()-1;i++)
      if(str.charAt(i)!=str.charAt(i+1))
              a=true;
      else
      {
             a=false;
             break;
      }
 }
 System.out.println(a);
}
}
