public class character {
    public static void main(String[] args) {
        
    
    String s="helloeveryone";
    int []arr= new int[26];
    for(int i=0;i<s.length();i++)
  {
    arr[s.charAt(i)-'a']++;

  }
  for(int i=0;i<26;i++)
  {
    if(arr[i]>0)
    {
        char x=(char)(i+'a');
        System.out.println(x+"=count is="+arr[i]);
    }
  }
}
}
