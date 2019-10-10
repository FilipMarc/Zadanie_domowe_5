package pl.homeWork.room;

public class Room {
    private int size;
    private int temperature;
    private boolean airConditioner;

    public Room(int size, int temperature, boolean airConditioner) {
        this(size,temperature);
        this.airConditioner = airConditioner;
    }

    public Room(int size, int temperature) {
        this.size = size;
        this.temperature = temperature;
    }

    public boolean roomTemperature(){
        if (airConditioner){
            temperature--;
        }else if (temperature <=15){
            return false;
        }else if (!airConditioner){
            return false;
        }
        return true;
    }

    public int getSize() { return size; }
    public double getTemperature() { return temperature; }
    public boolean isAirConditioner() { return airConditioner; }
}
