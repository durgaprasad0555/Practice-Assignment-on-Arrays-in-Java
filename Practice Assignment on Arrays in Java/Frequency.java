import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int[] arrSubSet = {1, 2, 3, 5, 9};
        HashMap<Integer, Integer> mp= new HashMap<Integer, Integer>();
        for (int i = 0; i < arrSubSet.length; i++) {
            mp.put(arrSubSet[i], 0);
        }
        for (int i = 0; i < arrSuperSet.length; i++) {
            if (mp.containsKey(arrSuperSet[i])) {
                mp.put(arrSuperSet[i], mp.get(arrSuperSet[i]) + 1);
            }
        }
        for (int i = 0; i < arrSubSet.length; i++) {
            int frequency = mp.get(arrSubSet[i]);
            System.out.println("Frequency of " + arrSubSet[i] + ": " + frequency);
        }
    }
}

