

public class leaders {
    public static void main(String[] args) {
        int []arr={16,17,4,8,5,1,2};
        int[] ans=new int[7];
        int j=0;
        int curr_max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=curr_max)
            {
               
                curr_max=arr[i];
                ans[j]=curr_max;
                j++;
            }
            
        }
        for(int k=0;k<j;k++){
            System.out.println(ans[k]+" ");
    }
    }
    
}
