class Program42
{
public static void main(String[]args)
{

 String s="java is my word okay";
 String rev=" ";

 for(int i=s.length()-1;i>=0;i--){

     rev=rev+s.charAt(i);

 }

 System.out.println("reverse the string: "+rev);

 }
}