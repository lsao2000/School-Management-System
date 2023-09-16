import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Teacher lezly = new Teacher(1,"lezly", 1000);
        Teacher ashly = new Teacher(2, "ashly", 600);
        Teacher tommy = new Teacher(3, "tommy", 1200);
        Student jifry   = new Student(1,"jefry",14);
        Student wisly   = new Student(2, "wisly", 13);
        Student stephen = new Student(3, "stephen", 9);
        /*
          List of the teachers in the school.
         */
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lezly);
        teachers.add(ashly);
        teachers.add(tommy);
        /*
          List of the student in the school.
         */
        List<Student> students = new ArrayList<>();
        students.add(jifry);
        students.add(wisly);
        students.add(stephen);
        School med5 = new School(teachers,students);
        for(Teacher teacher:teachers) med5.updateTotalMoneySpent(teacher.getSalary());
        med5.AllMoney();
    }

}
