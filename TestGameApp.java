/*James Kirby
12/11/24
OOP Exam - Test The Classes in Game Application
 */

import java.util.Scanner;

public class TestGameApp
{

    public static void main(String[] args)  //this is the main, executable file
    {
        //Instance Methods for Character,Sword,Bow and GameEnhancer classes
        //Objects Created
        Character character1 = new Character("Warrior",100, 32.5, 55.7f);
        System.out.println("Char Stats: \n" + character1.toString());
        System.out.println(character1.showType() + " has entered the game!");
        character1.counter();
        System.out.println();

        Character character2 = new Character("Hunter",200, 26.5, 72.8f);
        System.out.println("Char Stats: \n" + character2.toString());
        System.out.println(character2.showType() + " has entered the game!");
        character2.counter();
        System.out.println();

        Sword rapier = new Sword(25);
        System.out.println(character1.showType() + " wields a rapier!");
        rapier.showPower(rapier);
        System.out.println();

        Bow crossbow = new Bow(15);
        System.out.println(character2.showType() + " loads their crossbow");
        crossbow.showPower(crossbow);
        System.out.println();

        Scanner scan = new Scanner(System.in);

        GameEnhancer ge = new GameEnhancer();
        
        System.out.println("Now enter some details to enchance this game");
        System.out.println();
        
        //User can input some debug diagnostics
        System.out.println("Enter Volume Adjustment:");
        int a = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Process Memory Usage:");
        double b = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Drive Location of Process:");
        String input = scan.nextLine();
        char c = input.charAt(0);

        System.out.println("Enter State of Exception Search[true/false]:");
        boolean d = scan.nextBoolean();

        //User data is initialized and finally printed
        ge.setVolume(a);
        ge.setMemory(b);
        ge.setDrive(c);
        ge.setExcept(d);

        System.out.println("Game Status Report: \n" + ge.toString());

    }
}
