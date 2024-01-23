package monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import static java.lang.System.*;

public class Monster implements Comparable {
    private int myWeight;
    private int myHeight;
    private int myAge;

    // write a default Constructor
    public Monster() {
        myWeight = 0;
        myHeight = 0;
        myAge = 0;
    }

    // write an initialization constructor with an int parameter ht
    public Monster(int height) {
        myHeight = height;
    }

    // write an initialization constructor with int parameters ht and wt
    public Monster(int height, int weight) {
        myHeight = height;
        myWeight = weight;
    }

    // write an initialization constructor with int parameters ht, wt, and age
    public Monster(int height, int weight, int age) {
        myHeight = height;
        myWeight = weight;
        myAge = age;
    }

    // modifiers - write set methods for height, weight, and age
    public void setHeight(int i) {
        myHeight = i;
    }

    public void setWeight(int i) {
        myWeight = i;
    }

    public void setAge(int i) {
        myAge = i;
    }

    // accessors - write get methods for height, weight, and age
    public int getHeight() {
        return myHeight;
    }

    public int getWeight() {
        return myWeight;
    }

    public int getAge() {
        return myAge;
    }

    // creates a new copy of this Object
    public Object clone() {
        return new Monster(getHeight(), getWeight(), getAge());
    }

    public boolean equals(Object obj) {
        Monster other = (Monster) obj;
        if ((getHeight()==other.getHeight()) && (getWeight()==other.getWeight()) && (getAge()==other.getAge())) {
            return true;
        }
        return false;
    }
    //if and else if to follow the order of which monster is bigger through hierachy
    public int compareTo(Object obj) {
        Monster rhs = (Monster) obj;
        if (getHeight() > rhs.getHeight()) {
            return 1;
        } else if (getWeight() > rhs.getWeight()) {
            return 1;
        } else if (getAge()>rhs.getAge()) {
            return 1;
        }
        return -1;
     }

    // write a toString() method in order
    public String toString() {
        return getHeight() + " " + getWeight() + " " + getAge();
    }
}