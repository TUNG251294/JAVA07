import java.util.Arrays;

public class Main implements Cloneable{
    public static void main(String[] args) {
        double[] list1 = new double[2];
        list1[0] = 1.5;
        list1[1] = 2.5;
        list1[2] = 3.5;
        double[] list2 = list1.clone();
        double[] list3 = list1;
        list1 = Arrays.copyOf(list1, 4);
        list1[3] = 4.5;
        System.out.println(Arrays.toString(list1));
    }
}