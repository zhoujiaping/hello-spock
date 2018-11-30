import org.junit.Test;
import com.alibaba.fastjson.JSONObject;
public class MyTest{
    @Test
    public void testFirst(){
        System.out.println("a test");
        JSONObject json = new JSONObject();
        json.put("hello","world");
        System.out.println(json);
    }
}