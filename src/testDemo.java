import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by liuxu on 2018/5/3.
 */
public class testDemo {
    public static void main(String[] args) throws ScriptException {
        String ex="45+78*36/20-100";
        ScriptEngineManager manager=new ScriptEngineManager();
        ScriptEngine javascript = manager.getEngineByName("javascript");
        System.out.println(javascript.eval(ex));
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println("testDemo.main");
        System.out.println("objects = " + objects);
    }
    @Test
    public void countNum(){
        String str="abddcaaaa";
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String result=String.valueOf(str.charAt(i));
            if(!map.containsKey(result)){
                map.put(result,1);
            }else {
                int val = map.get(result);
                map.put(result,val+1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
        }
    }
    public String getRandomString(int lenth){
        String base="";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <lenth ; i++) {
            sb.append(base.charAt(random.nextInt(base.length())));
        }
        return sb.toString();
    }
}
