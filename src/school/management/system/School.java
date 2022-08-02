package school.management.system;

import java.util.List;

/**
 * Many teachers, many studnets.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     *  new school object is created.
     * @param teachers list of teachers in the school.
     * @param student list of students int the school.
     */
    public School(List<Teacher> teachers, List<Student> student) {
        this.teachers = teachers;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers int the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add a teachers to the school
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of the estudent's in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earbed by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned  money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to it's teacher's.
     * @param moneySpent the money
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
