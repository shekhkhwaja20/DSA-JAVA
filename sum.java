import java.util.Scanner;
public class sum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];

        }
        if(sum%2==0)
        {
            System.out.println("Even no");
        }
        else{
            System.out.println("odd");
        }

    }
}