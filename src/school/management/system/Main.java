package school.management.system;


import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // psvm -> public static void main
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher Melisa = new Teacher(2,"Melisa",700);
        Teacher Luis = new Teacher(3,"Luis",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(Melisa);
        teacherList.add(Luis);

        Student tamara = new Student(1,"Tamara",4);
        Student Gustav = new Student(2,"Gustav",12);
        Student Carl = new Student(3,"Carl",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(Gustav);
        studentList.add(Carl);

        School ghs = new School(teacherList,studentList);

        tamara.payFees(500);
        System.out.println("GHS has earned: $"+ghs.getTotalMoneyEarned());

    }
}
