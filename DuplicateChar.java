import java.util.HashSet;
public class DuplicateChar {
    public static void main(String[] args) {
        
      String s="programming";
      char ch[]=s.toCharArray();
      HashSet <Character> set=new HashSet<>();
     
       


      for(char c : ch)
         set.add(c);
System.out.println(set);

    }
}
