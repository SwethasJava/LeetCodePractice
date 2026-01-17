import java.util.Arrays;
import java.util.HashMap;

public class CommonPrefix {

    static HashMap commonPrefixMap = new HashMap();
    public static void main (String args[])
    {
        //String[] strs = {"aflower","flow","floight"};
        String[] strs={"dog","racecar","car"};
      //  String[] strs={"ab","a"};
        if(strs.length>1)
        System.out.println("Common prefix is " +longestCommonPrefix(strs));





    }
    public static String longestCommonPrefix(String[] strs) {

        String commonPrefix="";



            for(int i=0;i< strs.length;i++)
            {
                for(int j=1;j<=strs.length-1;j++) {


                    commonPrefix = stringComp(strs[i], strs[j]);

                }
            }
        commonPrefixMap.put(commonPrefix,commonPrefix);
            return commonPrefix;
    }

    private static String stringComp(String str, String str1) {

      // System.out.println("Comparing "+str + " "+ str1);
        StringBuilder commonPrefix =new StringBuilder();

        char [] first= str.toCharArray();
        char [] last= str1.toCharArray();


      //  System.out.println("Comparing " +str + " "+ str1);
        for(int i=0;i<Math.min(first.length, last.length);i++) {
           if(str1.charAt(i)== str.charAt(i)) {
               commonPrefix = commonPrefix.append(str1.charAt(i));
               System.out.println("commonPrefix"+commonPrefix);

           }

        }
        commonPrefixMap.put(commonPrefix.toString(),commonPrefix.toString());


            return commonPrefix.toString();

    }
}
