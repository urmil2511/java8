package HomeTask1;
interface stringRotations{
    public String rotate(String str1,String str2);
}
public class Rotations {
    public static void main(String[] args) {

        stringRotations r=new stringRotations() {
            @Override
            public String rotate(String str1,String str2) {
               String  str=str1+str1;
                if(str1.length()==str2.length() && str.indexOf(str2)!=-1)
                return "Second string is a rotation of first string";
                return "Second string is not a rotation of first string";
            }
        };
        System.out.println("Without Lambda Expression: " +r.rotate("test","stte"));
        stringRotations r2=(String str1,String str2)->{
            String  str=str1+str1;
            if(str1.length()==str2.length() && str.indexOf(str2)!=-1)
                return "Second string is a rotation of first string";
            return "Second string is not a rotation of first string";
        };
        System.out.println("With Lambda Expression: " +r.rotate("auto","stte"));
    }
}
