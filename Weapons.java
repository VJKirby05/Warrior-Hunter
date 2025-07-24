/*James Kirby
12/11/24
OOP Exam - Create Weapon Class
 */

public class Weapons //Super class
{

    int power;

    public Weapons(int power)
    {
        this.power = power;
    }

    public void showPower(Weapons w)
    {
        w.power = 10;
        System.out.println("This weapon has " + w.power + " power");
    }
}
