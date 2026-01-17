package Practice;

import java.util.ArrayList;
import java.util.List;

public class MinCoinChange {
    public static void main(String args[]) {
        int coinChange[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int total=500;
        List<Integer> minNumChange = getMinNumberCoin(coinChange, total);
        System.out.println(" Min coins required "+minNumChange.size());
    }

    private static List<Integer> getMinNumberCoin(int[] coinChange, int total) {
        int reminder=0;

        List<Integer> min = new ArrayList();

        for(int i=0;i<coinChange.length;i++)
        {
            if(coinChange[i]<= total) {
                reminder = total % coinChange[i];
                System.out.println("coinChange" + coinChange[i] + "Reminder is " + reminder);
                min.add(coinChange[i]);
                if (reminder != 0)
                {
                    min.add(coinChange[i]);
                    System.out.println("Min Numbers are " + coinChange[i]);

                }



            }
        }
        return min;
    }
}
