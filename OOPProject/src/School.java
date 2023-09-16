import java.util.List;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;
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
     * @param totalMoneyEarned Update the total money earned
     */
    public void updateTotalMoneyEarned(int totalMoneyEarned){
        this.totalMoneyEarned += totalMoneyEarned;
    }

    /**
     *
     * @return get the total money spent.
     */
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    /**
     *
     * @param MoneySpent update the total money spent
     */
    public void updateTotalMoneySpent(int MoneySpent){
        totalMoneySpent += MoneySpent;
    }
    public void AllMoney(){
        System.out.println("The total money spent is : "+ totalMoneySpent);
        System.out.println("The total money earned without tax and pays teacher : "+ totalMoneyEarned);
        System.out.println("The total money earned with tax and pays teacher : "+ (totalMoneyEarned-totalMoneySpent));
    }


}
