package homework_14;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Иван", "Иванов", "грипп", 20, Sex.MAN);
        Patient p2 = new Patient(2, "Петр", "Петров", "грипп", 21, Sex.MAN);
        Patient p3 = new Patient(3, "Анна", "Иванова", "ковид", 22, Sex.WOMAN);
        Patient p4 = new Patient(4, "Михаил", "Михайлов", "орви", 83, Sex.MAN);

        Room manRoom = new Room(111, Sex.MAN);
        Room womanRoom = new Room(222, Sex.WOMAN);

        manRoom.addPatient(p1);
        manRoom.addPatient(p2);
        womanRoom.addPatient(p3);
        manRoom.addPatient(p4);

        Department department = new Department("Терапевтическое");
        department.addRoom(manRoom);
        department.addRoom(womanRoom);

        department.count(Sex.MAN);

        System.out.println("------------------------------");

        System.out.println(manRoom.getPatientsInfo());
        System.out.println(womanRoom.getPatientsInfo());



    }


}
