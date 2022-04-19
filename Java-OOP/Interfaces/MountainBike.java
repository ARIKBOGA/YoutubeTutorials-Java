package Interfaces;

public class MountainBike implements Bicycle {

    private int seatHeight, gear, speed;

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        if (speed >= decrement)
            speed -= decrement;
        else speed = 0;
    }

    @Override
    public void speedUp(int increment) {
        if ((speed + increment) > MAX_SPEED)
            speed = MAX_SPEED;
        else
            speed += increment;
    }

    static void printStuff(){
        System.out.println("Mountain bike stuff");
    }
}
