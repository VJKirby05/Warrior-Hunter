/*James Kirby
12/11/24
OOP Exam - Create Character Class
 */

public class Character
{
    //Instance Variables
    
    private String type;    //i.e. mage,warrior,knight etc.
    private int health;
    private double money;
    private float speed;

    static int charCount = 0;

    //Default Constructor
    public Character()
    {
        type = null;
        health = 0;
        money = 0.0;
        speed = 0.0f;
    }

    //Parameterised Constructor
    public Character(String t, int h, double m, float s)
    {
        type = t;
        health = h;
        money = m;
        speed = s;
    }

    public int showHealth() //displays character's health
    {
        return health;
    }
    
    public String showType()    //displays character's type
    {
        return type;
    }

    public void counter()   //counts the number of characters in a game
    {
        charCount++;
        System.out.println("Number of Characters Online: " + charCount);
    }

    public String toString()
    {
        String stats;
        stats = "Health: " + health + "\n"
                + "Money: " + money + "\n"
                + "Speed: " + speed;
        return stats;
    }
}
