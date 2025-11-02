package homework_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {

    private int number;
    private List<Student> students = new ArrayList<>();

    public Group(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudentsByMark(double avgPoint) {
        for (Student s : students) {
            if (s.getAvgPoint() < avgPoint) {
                students.remove(s);
            }
        }
    }

    public void printAvgPointByGroup() {
        Double result = 0.0;
        for (Student s : students) {
            result += s.getAvgPoint();
        }
        System.out.println("Средний балл группы: " + result / students.size());
    }

    public void sortStudentsASC() {

            // Сортировка по возрастанию среднего балла
            Collections.sort(getStudents(), new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Double.compare(s1.getAvgPoint(), s2.getAvgPoint());
                }
            });


            for (Student student : getStudents()) {
                System.out.println(student.getName() + " " + student.getSurname() +
                        " " + student.getAvgPoint());
            }
    }

    public void sortStudentsDESC() {

        // Сортировка по убыванию среднего балла
        Collections.sort(getStudents(), new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAvgPoint(), s1.getAvgPoint());
            }
        });


        for (Student student : getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() +
                    " " + student.getAvgPoint());
        }

    }


}
