package Factors;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse {
    public static ArrayList<Integer> getListOfFactors(int n) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i == n || i == 1) {
                continue;
            }
            if (n % i == 0)
                temp.add(i);

        }
        return temp;
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i) > 2) && (nums.get(i) % 2 == 0)) {
                temp.add(nums.get(i));
                continue;
            }
            for (int k = 2; k <= Math.sqrt(nums.get(i)); k++) {
                if (nums.get(i) % k == 0) {
                    temp.add(nums.get(i));
                    continue;
                }

            }

        }

        System.out.println("Composite List:\n" + temp);
    }
}
