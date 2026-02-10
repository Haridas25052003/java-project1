import java.util.HashSet;
public class Program176 {
    public static void main(String[] args) {
        
        int a[]={1,1,2,3,4,4,5,6,7};
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:a)
            set.add(i);

        System.out.println(set);

    }
}
