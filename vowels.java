
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        int vowels=0,cons=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowels++;
            }
            else cons++;
        }
        System.out.println("vowels count="+vowels+"cons count="+cons);
    }
}
