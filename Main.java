
import java.util.ArrayList;
    class mystack{
        ArrayList<Integer> list =new ArrayList<>();
        //push
        public void push(int data){
            list.add(data);
        }
        //pop
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;

            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            return list.get(list.size()-1);

        }
        //Empty
        public boolean isEmpty(){   
            return list.size()==0;
        }
        //size
        public int size()
        {
            return list.size();

        }
    }
    public class Main{
        public static void main(String[] args) {
            mystack st=new mystack();
            st.push(10);
            st.push(20);
            st.push(30);
            System.out.println("Top:"+st.peek());
            System.out.println("pop:"+st.pop());
            System.out.println("size:"+st.size());
            System.out.println("Is empty:"+st.isEmpty());

        }
    }

