//remove duplicate 
import java.util.Hashset;
class Program84
{
public static void main(String[]args)
{

  int a[]={1,2,3,3,4,5,5,6};

  HashSet<Integer> set=new HashSet<>();

  for(int n:a)

   set.add(n);

  System.out.println(set);
 
 }
}