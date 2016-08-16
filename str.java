import java.util.*;

class str
{
public static void main(String args[])
{
Scanner sc=new scanner(System.in);
String sd=sc.nextLine(),res="";
String s[]=sd.split(" ");
int c=0,cm=0;
for(int i=0;i<s.length;i++)
{
for(int j=i;j<s[i].length();j++)
{
if(s[i].charAt(j)==s[i+1].charAt(j))
{
c=c+1;
}
else
break;
}
if(c>=cm)
{
res=s[i];
cm=c;
}
}
System.out.println(res);
}
}
