/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author SMK TELKOM
 */
public class truck {
    public int candence;
    public int gear;
    public int speed;
    
    public truck (int startcandence, int startspeed, int startgear){
        gear = startgear;
        candence = startcandence;
        speed = startspeed;
    }
    public void setcandence(int newvalue){
        candence = newvalue;
    }
    public void setgear(int newvalue){
        gear = newvalue;
    }
    public void applybrake(int decrement){
        speed = decrement;
    }
    public void speedup(int increment){
        speed = increment;
    }
}
