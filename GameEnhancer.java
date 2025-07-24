/*James Kirby
12/11/24
OOP Exam - Create GameEnhancer Class
 */

public class GameEnhancer
{
    //USE OF ENCAPSULATION - private variables, get+set methods

    private int volumeSlider;
    private double memoryUsage;	//In megabytes
    private char drive;		//Storage drive - C:,D:
    private boolean foundException;	//Is there exception found in the game code?

    public GameEnhancer()
    {
        volumeSlider = 0;
        memoryUsage = 0.0;
        drive = 'X';
        foundException = false;
    }

    public GameEnhancer(int v, double m, char d, boolean f)
    {
        volumeSlider = v;
        memoryUsage = m;
        drive = d;
        foundException = f;
    }

    //Ensures data cannot be directly accessed
    public void setVolume(int v)
    {
        this.volumeSlider = v;
    }

    public void setMemory(double m)
    {
        this.memoryUsage = m;
    }

    public void setDrive(char d)
    {
        this.drive = d;
    }

    public void setExcept(boolean e)
    {
        this.foundException = e;
    }

    //Returning all where required
    public int getVolume()
    {
        return volumeSlider;
    }

    public double getMemory()
    {
        return memoryUsage;
    }

    public char getDrive()
    {
        return drive;
    }

    public boolean getExcept()
    {
        return foundException;
    }

    //Overriden values are printed and returned
    public String toString()
    {
        String debug;
        debug = "Volume: " + volumeSlider + "\n"
                + "Memory: " + memoryUsage + "\n"
                + "Local Drive: " + drive + "\n"
                + "Exception Found: " + foundException;
        return debug;
    }
}
