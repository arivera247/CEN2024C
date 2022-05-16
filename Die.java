package COP_2800C_12995_Alex_Rivera;

import java.util.Random;

public class Die {

    private int roll; //value for a particular dice roll

    public Die(){
        Random randGen = new Random();
        roll = randGen.nextInt(6) + 1;
    }
    public void setRoll(int roll){ this.roll = roll;}
    public int getRoll(){
        return roll;
    }
}
