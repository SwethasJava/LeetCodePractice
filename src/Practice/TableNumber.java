package Practice;

public class TableNumber {
    public static void main(String args[]) {

        int rows=6;


        for(int i=rows;i>=0;i--) {
            System.out.println(" ");
            for (int j = i; j <= rows-1; j++) {
                System.out.print(" * ");
            }
        }
    }
}
