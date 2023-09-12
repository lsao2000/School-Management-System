public class Student {
    private int id;
    private String name;
    private double grade;
    private double feesPaid = 0;
    private double feesTotal= 30000;
    /**
     * @param id    identification of the student: unique.
     * @param name  name of the student.
     * @param grade grade of the student.
     */

    public Student(int id, String name, double grade){
        this.id    = id;
        this.name  = name;
        this.grade = grade;
    }

    /**
     * @param grade update the grade of the student.
     */
    public void setGrade(double grade){
        this.grade = grade;
    }

    /**
     * update the fees of student.
     * @param fees set new value of fees student.
     */
    public void updateFeesPaid(double fees){
        feesPaid += fees;
//        if (feesTotal - feesPaid >= 0){
//        }else {
//            System.out.println("the fees are already paid");
//        }
    }

}
