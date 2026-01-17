import java.util.Arrays;

public class ReverseString {
    public static void main(String args[])
    {
        char []s={'h','e','l','l','o'};
        int len=s.length;
        char[]  reverse=new char[len];
        int j=0;
        StringBuilder t=new StringBuilder();
        for (int i= s.length-1;i>=0;i--) {

            reverse[j]=s[i];
            j++;
        }
        s = Arrays.copyOf(reverse, reverse.length);
        System.out.println("revv" + s);

    }
}
