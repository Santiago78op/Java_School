package school.management.system;

/**
 * This class is responsible for keep the
 * track of students fees, name, grade and fees
 * paid.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *  To Create a new Student  by initializing.
     * @param id  id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // * Not going to alert Student's name, student's id.

    /**
     * Usef to update the student's grade.
     * @param grade new grade of student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feedPoaid to Paid.
     *  Add the fess to the fees paid
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * }
     * @return id if the student
     */
    public int getId() {
        return id;
    }

    /**
     * }
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining feees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+" Total fees paid so far "+feesPaid;
    }
}
