import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Date[] arr = new Date[2];
        arr[0] = new Date(94,12,1);
        arr[1] = new Date(96,9,2);
        for (Date date: arr){
            System.out.println();
        }

    }
}