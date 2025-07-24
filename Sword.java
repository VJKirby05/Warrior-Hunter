/*James Kirby
12/11/24
OOP Exam - Create Sword Class
 */

//Sub class
public class Sword extends Weapons //INHERITANCE USAGE
{
    //Sword Constructor

    public Sword(int pow)
    {
        super(pow);	//from superclass Weapons
    }

    //Power of Sword
    public void showPower(Weapons s)
    {
        s.power = 25;
        System.out.println("This sword has " + s.power + " power");
    }
}
