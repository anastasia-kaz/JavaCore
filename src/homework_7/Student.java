package homework_7;

public class Student {

    //1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int avgValue;

    public Student(int id, String name, String surname, String faculty, int course, String group, int avgValue) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.avgValue = avgValue;
    }

    public Student() {
    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public String info() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", avgValue=" + avgValue +
                '}';
    }

    //3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
    public void editGroup(String group) {
        this.group = group;
    }

    //4. Создать метод, который будет возвращать текущую группу студента.
    public String getGroup() {
        return group;
    }

    //5. Создать метод, который будет изменять оценку студента и группу студента.
    public void editGroupAndValue(int value, String group) {
        this.group = group;
        avgValue = value;
    }

    //7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов, массив студентов у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
    public static Student[] getStudentByValue(Student[] studentsArray, int value) {
        Student[] result = new Student[studentsArray.length];
        for (int i = 0; i < studentsArray.length; i++){
            if (studentsArray[i].avgValue > value){
                result[i] = studentsArray[i];
            }
        }
        return result;
    }

}
