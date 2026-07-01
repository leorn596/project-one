import java.util.ArrayList;
import com.leorn.day3.Student;
import com.leorn.day4.CollegeStudent;
public class Main {
    static Student s1 = new CollegeStudent( 1, "zhangsan", 20, "man", 80, "Base math");
    static Student s2 = new Student( 2, "lisi", 20, "man", 70);
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(new Student(3,"wangwu",20,"man",70));
        studentList.add(new Student(4,"zhaoliu",21,"man",80));
        studentList.add(new Student(5,"qianqi",20,"man",80));

        System.out.println("");
        System.out.println("------------");
        System.out.println("StudentNum:" + studentList.size());
        System.out.println("------------");
        System.out.println("");

        // System.out.println("before remove:");
        // System.out.println(studentList.get(0).introduce());
        // studentList.remove(0);
        // System.out.println("");
        // System.out.println("after remove:");
        // System.out.println(studentList.get(0).introduce());
        System.out.println("------------");
        for(Student s : studentList){
            System.out.println(s.introduce());
            System.out.println("------------");
        }

        
    }
}