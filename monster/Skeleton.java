package monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class Skeleton implements Monster {
    private String name;
    private int howBig;

    // Constructor
    public Skeleton(String name, int howBig) {
        this.name = name;
        this.howBig = howBig;
    }

    // Implementing methods from the Monster interface
    public int getHowBig() {
        return howBig;
    }

    public String getName() {
        return name;
    }

    public boolean isBigger(Monster reference) {
        return this.getHowBig() > reference.getHowBig();
    }

    public boolean isSmaller(Monster reference) {
        return this.getHowBig() < reference.getHowBig();
    }

    public boolean namesTheSame(Monster reference) {
        return this.getName().equals(reference.getName());
    }

    // standard representation of monster data
    public String toString() {
        return "Monster - " + name + " " + howBig;
    }
}
