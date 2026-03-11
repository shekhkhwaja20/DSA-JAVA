public class subcount {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,10,4,2,20};
        int k=3;
        int x=20;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            if(x<sum)
            {
                count++;
            }
        }
        System.out.println("total max subarray is="+count);
    }
}
