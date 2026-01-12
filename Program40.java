//missing element from 1 to n

class Program40
{
public static void main(String[]args)
{

    int a[]={1,3,4,5};

    int n=a.length;

    int total=n*(n+1)/2;

    int sum=0;

    for(int i=0;i<n;i++){

        sum+=i;

    }

    System.out.println(total-sum);

  }
}

    