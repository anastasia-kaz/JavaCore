package homework_13;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", "Ivanov", "13/05/2000", "Minsk", 7.5);
        Student st2 = new Student("Mikchel", "Mihailov", "28/03/1999", "Vitebsk", 9.0);
        Student st3 = new Student("Anna", "Antonova", "13/03/2001", "d. Pupkovo", 5.55);
        Student st4 = new Student("Inna", "Antonova", "13/03/2001", "d. Pupkovo", 5.55);


        Group gr1 = new Group(111);
        Group gr2 = new Group(222);

        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr2.addStudent(st3);
        gr1.addStudent(st4);

        Faculty faculty = new Faculty();
        faculty.addGroup(gr1);
        faculty.addGroup(gr2);

        System.out.println(faculty.getFacultyStatus());

        gr1.printAvgPointByGroup();
        faculty.checkStatusOfFaculty();
        System.out.println(faculty.getFacultyStatus());

        gr1.sortStudentsASC();

        gr1.sortStudentsDESC();


        System.out.println(gr1.getStudents().toString());
        gr1.removeStudentsByMark(8.0);
        System.out.println(gr1.getStudents().toString());


    }
}
