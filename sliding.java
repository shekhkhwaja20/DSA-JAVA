public class sliding {
    public static void main(String[] args) {
     int []arr={1,2,3,4,5,7,10};
     int k=4;
     int sum=0;
     for(int i=0;i<k;i++)
     {
         sum+=arr[i];

     }
     int max=sum;
     for(int i=k;i<arr.length;i++)
     {
        sum+=arr[i];
        sum-=arr[i-k];
        if(sum>max) max=sum;

     }
     System.out.println("maximum sum:"+max);
    }
}
