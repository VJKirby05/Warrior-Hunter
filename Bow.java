/*James Kirby
12/11/24
OOP Exam - Create Bow Class
 */

//Sub class
public class Bow extends Weapons
{
    //Bow Constructor

    public Bow(int pow)
    {
        super(pow);	//from superclass Weapons
    }

    //Power of Bow
    public void showPower(Weapons b)
    {
        b.power = 15;
        System.out.println("This bow has " + b.power + " power");
    }
}
