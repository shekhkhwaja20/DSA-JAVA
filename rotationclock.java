public class rotationclock {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,2,8};


        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

        System.out.println("after reverse");

        for(int j = 0 ; j<3;j++){


        int one  = arr[0];
        for(int i=1 ; i<=arr.length-1;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = one;
        
    }
    for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

}
}