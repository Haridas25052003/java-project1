public class Program165 {
    public static void main(String[] args) {
        
        String s1="listen";
        String s2="silent";

        int count[]=new int[256];
        for(char c : s1.toCharArray())
            count[c]++;

        for(char c : s2.toCharArray())
            count[c]--;

        boolean isAnagram=true;
        for(int i : count){
            if(i !=0)
                isAnagram=false;
        }

        System.out.println(isAnagram);
    }
}
