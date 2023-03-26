import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {
    @Override
//    public int compare(Student s1, Student s2){
//        if(s1.getScore()<s2.getScore()){
//            return -1;
//        } else if (s1.getScore()>s2.getScore()) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
    public int compare(Student s1, Student s2){
        double d1 = s1.getScore();
        double d2 = s2.getScore();
        return Double.compare(d1,d2);
    }
}
