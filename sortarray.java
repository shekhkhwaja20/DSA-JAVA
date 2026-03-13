import java.util.ArrayList;

public class sortarray {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(10);
        lst.add(21);
        lst.add(30);
        lst.add(41);
        lst.add(50);
        lst.add(63);
        lst.add(70);
        lst.add(85);
        lst.add(90);
        lst.add(11);

        int left = 0;
        int right = lst.size() - 1;

        while(left < right){

            if(lst.get(left) % 2 == 0){
                left++;
            }
            else if(lst.get(right) % 2 != 0){
                right--;
            }
            else{
                int temp = lst.get(left);
                lst.set(left, lst.get(right));
                lst.set(right, temp);
            }
        }

        System.out.println(lst);
    }
}