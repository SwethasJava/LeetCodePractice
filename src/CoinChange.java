import java.util.Arrays;
import java.util.HashMap;


/**
 * 0+ 5*0 =0
 *
 * 0+ 5* 1 = 5
 *
 * 5 + 5*2 = 15
 *
 * 15+ 5*3 = 30 / break
 *
 * 15+ 2*0 = 15
 *
 * 15 + 2* 1 = 17
 *
 * 17+ 2*2 = break;
 *
 * 17 + 1*0 = 17
 *
 * 17 + 1*1 = 17
 */

public class CoinChange {
    public static void main(String args[])
    {
        System.out.println("Hellp Worlds");
        int amount=11;
        int coins[] = new int [] {5,2,1};
        int maxValu=getMaxfromArray(coins);

        int tempAmount=0;

        HashMap hm = new HashMap();
        int j=1;
        for(int i=0;i< coins.length;i++)
        {

            System.out.println(" Value of next "+i);
           for( j=1;((coins[i] * j) < amount);j++) {
               tempAmount = (coins[i] * j);
                System.out.println ("TempAmount "+tempAmount + "Number of times "+j);
                if(tempAmount <=amount) {
                    hm.put(coins[i], j);
                }

            }
           if (amount<tempAmount)
           amount = amount-tempAmount;
           System.out.println("Amount now is "+amount);
        }
        System.out.println("Coin change is "+Arrays.toString(hm.entrySet().toArray()));
    }



    /*private static int[] removeElementsFromArray(int[] coins, int maxValu) {
        int newCoins[] = new int[coins.length-1];
        for(i=0;i<coins.length;i++) {
            if (coins[i] != maxValu)
                newCoins[i] = coins[i];
        }
        return newCoins;
    }*/

    private static int getMaxfromArray(int[] coins) {
        int max=coins[0];
        int i;

        for(i=1;i<coins.length;i++) {
            if (coins[i] > max)
                max = coins[i];
        }
        return max;

    }
}
