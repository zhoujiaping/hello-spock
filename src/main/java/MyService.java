import java.util.Arrays;
import java.util.List;

public class MyService {

    public List<String> split(String s, String sep){
        return Arrays.asList(s.split(sep));
    }
}
