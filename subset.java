import java.util.*;
class subset
{
public static void main(String[] args)
{ 
 Scanner sc=new Scanner(System.in);
 ArrayList<Integer> list=new ArrayList<Integer>();
 ArrayList<Integer> list2=new ArrayList<Integer>();
 int n=sc.nextInt();
 int n2=sc.nextInt();
 for(int i=0;i<n;i++)
    list.add(sc.nextInt());
 for(int i=0;i<n2;i++)
    list2.add(sc.nextInt());
  if(list.containsAll(list2))
     System.out.println("Its a subset");
  else
     System.out.println("Not a subset");
}
}
