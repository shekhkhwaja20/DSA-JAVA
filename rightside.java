
import java.util.Scanner;

// write a which will take an array as i/p from user and move all the zeroes of the array to the right side of the array..
public class rightside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={0,1,2,3,12};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i:arr)
        {
            System.out.print(arr[i]);
        }
    }


}
