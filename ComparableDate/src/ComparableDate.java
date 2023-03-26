import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class ComparableDate implements Comparator<Date> {
    @Override
    public int compare(Date date1, Date date2){
        return Integer.valueOf(date1.getDate()).compareTo(Integer.valueOf(date2.getDate()));
    }
}
