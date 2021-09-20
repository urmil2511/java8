package HomeTask1;
interface palindrome{
    public String perform(String s);
}

public class PalindromeTest {
    public static void main(String[] args) {

        palindrome p=new palindrome() {
            @Override
            public String perform(String s) {
                String temp="";
                int size=s.length();
                for(int i=size-1;i>=0;i--)
                {
                    temp=temp+s.charAt(i);
                }
                System.out.println("Without Lambda Expression:");
                if(s.equals(temp))
                {
                    return "String is Palindrome";
                }
                else
                {
                    return "String is not Palindrome";
                }
            }
        };
        System.out.println( p.perform("abcdcba"));
        System.out.println("With Lambda Expression:");
        palindrome p2=(String s)->{
            String rev="";
            int size=s.length();
            for(int i=size-1;i>=0;i--)
            {
                rev=rev+s.charAt(i);
            }
            if(s.equals(rev)) return "String is Palindrome";
                return "String is not Palindrome";
        };
        System.out.println(p2.perform("level"));

    }

}
