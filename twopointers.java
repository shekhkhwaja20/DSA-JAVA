public static void main(String[] args) {
        int[] arr = {1,3,7,10,12};
        int target = 15;
        for(int i = 0 , j=arr.length-1;i<j;){
            int sum  = arr[i]+arr[j];
            if(sum== target){
                System.out.println("Pair is present " + arr[i]+" + "+arr[j]+ " = "+target);
                break;
            }
            if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Pair is not Present");
    }