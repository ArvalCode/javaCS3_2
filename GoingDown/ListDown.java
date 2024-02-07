
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Nolan Tran
//Date -Feb 2 24
import java.util.List;
import java.util.ArrayList;

public class ListDown {
    // go() will return true if all numbers in numArray
    // are in decreasing order [31,12,6,2,1]
    public static boolean go(List<Integer> numArray) {
        int max = Integer.MAX_VALUE;
        boolean isInOrder = true;
        for (int i = 0; i < numArray.size(); i++) {
            if (max > numArray.get(i)) {
                isInOrder = true;
                max = numArray.get(i);
                continue;
            }else {
                return false;
            }
        }
        return isInOrder;
    }
}
