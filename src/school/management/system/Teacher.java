package school.management.system;

/**
 *  This class is responsible for keeping the track
 *  of teacher's name, id, salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     *  Creates a new Teacher object
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id of the Teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the Teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Update the salary Teaacher
     * @param salary Change the salary of the Teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Add to salary.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
