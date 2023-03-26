import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Phuong",7.9);
        students[1] = new Student("Linh",8.0);
        students[2] = new Student("Thao",7.7);

        StudentNameComparator snc1 = new StudentNameComparator();
        Arrays.sort(students, snc1);
        for(Student student: students){
            System.out.println(student);
        }

        Arrays.sort(students, new StudentScoreComparator());
        for(Student student: students){
            System.out.println(student);
        }
    }
}