public class Student {
    private final int id;
    private final String name;
    private double grade;
    private int feesPaid;
    private final int feesTotal;

    /**?
     * this for intialize the param for every instance
     * @param id the identification of the student
     * @param name the name of this student
     * @param grade the grade of every student
     */
    public Student(int id, String name, double grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id    = id;
        this.name  = name;
        this.grade = grade;
    }

    /**
     * User to update the student's grade.
     * @param grade new grade at the student.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * This function is for updating the student fees.
     * @param fees the fees that the student pays.
     */
    public void updateFessPaid(int fees){
        feesPaid += fees;
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Grade of the student.
     */
    public double getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return The total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
