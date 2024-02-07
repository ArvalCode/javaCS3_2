
//(c) A+ Computer Science
// www.apluscompsci.com
// Nolan Tran

import java.util.ArrayList;

public class FlowerGarden {
    
    ArrayList<String> flowers;

    public FlowerGarden() {
        flowers = new ArrayList<String>();
    }

    public void addFlower(String data) {
        if (findFlower(data) == -1) {
            flowers.add("01 " + data);
        } else { // If the flower is already in the garden
            int count = getCount(data);
            flowers.remove(findFlower(data));
            // If the count + 1 is less than or equal to 9, add a new entry with count increased
            if (count + 1 <= 9) {
                flowers.add("0" + (count + 1) + " " + data);
            }
            // If the count + 1 is greater than 9, add a new entry with count increased
            if (count + 1 > 9) {
                flowers.add((count + 1) + " " + data);
            }
        }
    }

    public int getCount(String s) {
        if (findFlower(s) != -1) {
            //Counts through looking at the substring of the string
            return Integer.parseInt(flowers.get(findFlower(s)).substring(0, 2));
        }
        return 0;
    }

    public String getFlowerName(int i) {
        if (i > flowers.size() - 1)
            return "out of range"; 
        // Otherwise, return the name of the flower at the specified index
        return flowers.get(i).substring(3);
    }

    public int findFlower(String s) {
        for (int i = 0; i <= flowers.size() - 1; i++) {
            if (s.equals(getFlowerName(i)))
                return i;
        }
        return -1;
    }

    // Method to find the flower with the maximum count in the garden
    public String maxFlower() {
        int greatest = 0;
        int indexOfGreat = 0;
        for (int i = 0; i <= flowers.size() - 1; i++) {
            // If the count of the current flower is greater than the current greatest count
            if (Integer.parseInt(flowers.get(i).substring(0, 2)) > greatest) {
                // Update the greatest count and the index of the flower with the greatest count
                indexOfGreat = i;
                greatest = Integer.parseInt(flowers.get(i).substring(0, 2));
            }
        }
        return flowers.get(indexOfGreat);
    }

    // Method to return a string representation of the flowers in the garden
    public String toString() {
        return flowers.toString();
    }
}
