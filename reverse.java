import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(31);
        lst.add(30);
        lst.add(29);
        lst.add(28);
        lst.add(27);
        lst.add(25);

      int i=0;
      int j=lst.size()-1;
      while(i<j)
        {
            int temp=lst.get(i);
            lst.set(i,lst.get(j));
            lst.set(j,temp);
            i++;
            j--;
        }  
        for(int val:lst)
        {
            System.out.println(val+"");
        }
        
    }
}