

public class leftrightsum {
    public static void main(String[] args) {
        int [] arr = {1,7,3,6,5,6};
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];

        for(int i = 1 ;  i<arr.length;i++){

            left[i] = left[i-1] + arr[i];

        } 

        for(int k =0;k<left.length;k++){
            System.out.print(left[k]+"   ");
            }

            System.out.println();
        
        right[arr.length-1] = arr[arr.length-1];

        for(int i = arr.length-2 ;  i>=0;i--){

            right[i] = right[i+1] + arr[i];
            

        } 

        for(int k =0;k<right.length;k++){
            System.out.print(right[k]+"   ");
            }

        System.out.println();
            for(int i=0 ; i <arr.length;i++){
                if(left[i]==right[i]){
                    System.out.println(i);
                }
            }
        
    }
}