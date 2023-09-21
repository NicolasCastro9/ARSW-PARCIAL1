package edu.eci.arsw.math;

public class PiThread extends Thread{
    private final int particion;
    private final int total;
    private int parte;

    public PiThread(int particion,  int total){
        this.particion = particion;
        this.total = total;
    }
    public void run(){
        parte = (total / particion);
    }
    public int getParte(){
        return Math.abs(parte);
    }
}