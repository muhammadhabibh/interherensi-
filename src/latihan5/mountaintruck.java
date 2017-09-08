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
public class mountaintruck extends truck {
    public int seatheght;
    
    public mountaintruck(int seatheight, int startcandence, int startspeed, int startgear) {
        super(startcandence, startspeed, startgear);
        int startheight = 0;
        seatheight = startheight;
    }

    /**
     *
     * @param newvalue
     */
    public seatheight(int newvalue){
        int seatheight = newvalue;
    }
    public static void main (String [] aku){
        System.out.println("Mulai berjalan");
        mountaintruck mb = new mountaintruck(0,0,0,0);
        System.out.println("gear = "+mb.gear);
        System.out.println("speed = "+mb.speed);
        mb.setgear(2);
        mb.speedup(2);
        System.out.println("geat= "+mb.gear);
        System.out.println("speed= "+mb.speed);
        mb.speedup(2);
        System.out.println("gear="+ mb.gear);
        System.out.println("speed="+mb.speed);    }
}
