package Array_List;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class faltu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int[] arr1 = new int[6];
            int[] arr2 = new int[6];
            for (int i = 0; i < 6; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < 6; i++) {
                arr2[i] = sc.nextInt();
            }
            float win = 0;
            float total = 0;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    continue;
                }
                if (arr1[i] > arr2[i]) {
                    win++;
                    total++;
                } else if (arr1[i] < arr2[i]) {
                    total++;
                }
            }
//            double ans = round(win/total,6);
//            Precision.round(PI, 3);
            float ans= win/total;
            ans=(float)Math.floor(Math.round(1000000*ans))/1000000;
            System.out.println(ans);
        }
    }
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
