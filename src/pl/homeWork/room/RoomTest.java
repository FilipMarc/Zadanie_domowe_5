package pl.homeWork.room;

public class RoomTest {
    public static void main(String[] args) {
        Room room = new Room(20,16,true);
        boolean roomTemp = room.roomTemperature();
        System.out.println("Temperatura po obniżeniu przez klimatyzator "
                + room.getTemperature() + ", " + roomTemp);

        Room room1 = new Room(25, 13);
        boolean rompTemp1 = room1.roomTemperature();
        System.out.println(rompTemp1);
    }
}
