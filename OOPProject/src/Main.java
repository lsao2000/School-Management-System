import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Teacher lezly   = new Teacher(1,"lezly", 1000);
        Teacher ashly   = new Teacher(2, "ashly", 600);
        Teacher tommy   = new Teacher(3, "tommy", 1200);
        Student jifry   = new Student(1,"jefry",14);
        Student wisly   = new Student(2, "wisly", 13);
        Student stephen = new Student(3, "stephen", 9);
        /*
          List of the teachers in the school.
         */
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lezly);
        teachersList.add(ashly);
        teachersList.add(tommy);
        /*
          List of the student in the school.
         */
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(jifry);
        studentsList.add(wisly);
        studentsList.add(stephen);
        School med5 = new School(teachersList,studentsList);
        for(Teacher teacher:teachersList) med5.updateTotalMoneySpent(teacher.getSalary());
        jifry.PayFess(6000);
        wisly.PayFess(5000);
        stephen.PayFess(1500);
        System.out.println("~~~~~~Making School Pay Salary~~~~~~");
        lezly.receiveSalary(lezly.getSalary());
        System.out.println(jifry);
        ashly.receiveSalary(ashly.getSalary());
        System.out.println(ashly);
        System.out.println(lezly);
        med5.AllMoney();
    }
}
