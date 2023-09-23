import java.util.List;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers    = teachers;
        this.students    = students;
        totalMoneyEarned = 0;
        totalMoneySpent  = 0;
    }

    /**
     *
     * @return The list of the teachers in the school.
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }

    /**
     *
     * @param teacher  add new teacher to the list of the teachers.
     */
    public void addTeachers(Teacher teacher){
        teachers.add(teacher);
    }

    /**m
     *
     * @return get the list of the student.
     */
    public List<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    /**
     *
     * @return get the total money earned
     */
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned Update the total money earned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return get the total money spent.
     */
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    public static void setTotalMoneySpent(int totalmoneyspent) {
        totalMoneySpent += totalmoneyspent;
    }

    /**
     *
     * @param MoneySpent update the total money spent
     */
    public static void updateTotalMoneySpent(int MoneySpent){
        totalMoneyEarned -= MoneySpent;
    }
    public void AllMoney(){
        System.out.println("The total money spent is : $"+ totalMoneySpent);
        System.out.println("The total money earned with tax and pays teacher : $"+ totalMoneyEarned);
    }


}
