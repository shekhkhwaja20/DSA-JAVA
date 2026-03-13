public class panagram {
    public static void main(String[] args) {
        String s="rajnesh";
        int []arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int flag=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Its a  panagram");
        }
        else{
            System.out.println("not panagram");
        }
    }
}
