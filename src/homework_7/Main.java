package homework_7;

import static homework_7.Student.getStudentByValue;

public class Main {

    public static void main(String[] args) {

        //6. В классе main создать массив из пяти студентов.
        Student st1 = new Student(1554, "Nastya", "Kazachenok", "QA", 3, "SBBOL", 9);
        Student st2 = new Student(1555, "Anna", "Voynilko", "SA", 3, "SBBOL", 10);
        Student st3 = new Student(1556, "Olga", "Petrova", "DEV", 3, "SBBOL", 7);
        Student st4 = new Student(1557, "Alex", "Anatsko", "SA", 3, "SBBOL", 9);
        Student st5 = new Student(1558, "Denis", "Kastukevich", "PM", 3, "SBBOL", 4);
        Student[] group = {st1, st2, st3, st4, st5};

        System.out.println(st1.info());

        //8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2
        for (Student student: getStudentByValue(group, 9)) {
            if(student == null){
                continue;
            }
            System.out.println(student.info());
        }

    }



}
