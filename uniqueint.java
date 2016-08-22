import java.util.*;
class uniqueint
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> list=new ArrayList<Integer>();
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
       list.add(sc.nextInt());
  ArrayList<Integer> set=new ArrayList<Integer>();
  for(int i=0;i<list.size()-1;i++)
  {
    for(int j=i+1;j<list.size();j++)
    if(list.get(i)==list.get(j))
    {
      list.remove(j);
      set.add(i);
    }
  }
  list.removeAll(set);
  System.out.println(list);
}
}
