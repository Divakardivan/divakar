import java.util.*;
class reverseword
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 String str[]=s.split(" ");
 String res="";
 for(int i=str.length-1;i>=0;i--)
       res+=str[i]+" ";
  System.out.println(res.trim());
}
}
