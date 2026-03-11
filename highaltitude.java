public class highaltitude {
    public static void main(String[] args) {
        int arr[]={-5,1,5,0-7};
         int max=0;
         int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(max<sum)
            {
                max=sum;
            }
        }
        System.out.println(sum);
    }
}
