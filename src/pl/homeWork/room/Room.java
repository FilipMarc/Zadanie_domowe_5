package pl.homeWork.room;

public class Room {
    private int size;
    private int temperature;
    private boolean airConditioner;
    private double minTemp = 15;

    public Room(int size, int temperature, boolean airConditioner) {
        this(size,temperature);
        this.airConditioner = airConditioner;
    }

    public Room(int size, int temperature) {
        this.size = size;
        this.temperature = temperature;
    }

    public boolean roomTemperature(){
        if (airConditioner && temperature > minTemp){
            temperature--;
            return true;
        } else if (!airConditioner){
                return false;
        }
        return false;
    }

    public int getSize() { return size; }
    public double getTemperature() { return temperature; }
    public boolean isAirConditioner() { return airConditioner; }
}
