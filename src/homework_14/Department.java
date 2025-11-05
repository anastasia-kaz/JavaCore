package homework_14;


import java.util.HashSet;
import java.util.Set;

public class Department {

    private String name;
    private Set<Room> rooms = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public void count(Sex sex) {
        int man = 0;
        int woman = 0;
        for (Room r : rooms) {
            for (Patient p : r.getPatients()) {
                if (p.getSex().equals(Sex.MAN)) {
                    man++;
                } else {
                    woman++;
                }
            }
        }
        if (sex.equals(Sex.MAN)) {
            System.out.println("В отделении " + man + " мужчин");
        } else if (sex.equals(Sex.WOMAN)) {
            System.out.println("В отделении " + woman + " женщин");
        }


    }


}
