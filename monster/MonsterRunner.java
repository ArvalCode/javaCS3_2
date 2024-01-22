package monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import java.lang.System;

public class MonsterRunner {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        // input for names and size for monster 1
        System.out.print("Enter 1st monster's name: ");
        String monsterName1 = keyboard.nextLine();
        System.out.print("Enter 1st monster's size: ");
        int size1 = keyboard.nextInt();
        keyboard.nextLine();

        // create monster 1
        Monster monster1 = new Skeleton(monsterName1, size1);

        // input for names and size for monster 2
        System.out.print("Enter 2nd monster's name: ");
        String monsterName2 = keyboard.nextLine();
        System.out.print("Enter 2nd monster's size: ");
        int size2 = keyboard.nextInt();
        keyboard.nextLine(); 

        // create monster class 2
        Monster monster2 = new Skeleton(monsterName2, size2);

        // comparing monsters
        System.out.println("\nMonster 1 - " + monster1.getName() + " " + monster1.getHowBig());
        System.out.println("Monster 2 - " + monster2.getName() + " " + monster2.getHowBig());

        if (monster1.isBigger(monster2)) {
            System.out.println("Monster one is bigger than Monster two.");
        } else if (monster1.isSmaller(monster2)) {
            System.out.println("Monster one is smaller than Monster two.");
        } else {
            System.out.println("Monster one is the same size as Monster two.");
        }

        if (monster1.namesTheSame(monster2)) {
            System.out.println("Monster one has the same name as Monster two.");
        } else {
            System.out.println("Monster one does not have the same name as Monster two.");
        }
    }
}
