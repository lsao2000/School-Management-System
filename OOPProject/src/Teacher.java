public class Teacher {
    private final int id;
    private final String name;
    private final int Salary;

    /**
     * This for set the name of the teacher and the identification in every instance.
     * @param id The identification of the teacher.
     * @param name The name of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id     = id;
        this.name   = name;
        this.Salary = salary;
    }

    /**
     * this function for return the name of the teacher
     * @return get the  name of the teacher.
     */
    public String getName(){
        return name;
    }

    /**
     * this function for return the identification of the teacher.
     * @return get the id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     * This function for return the salary of the teacher
     * @return get the salary of the teacher
     */
    public int getSalary(){
        return Salary;
    }
}
