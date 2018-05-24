import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuxu on 2018/5/18.
 */
public class demo {
    public static List<emp> emps = Arrays.asList(new emp("zs", 15, 5666),
            new emp("zs", 13, 3000),
            new emp("zs", 15, 56669),
            new emp("ww", 18, 56667)
    );

    public static void main(String[] args) {
        /**
         * java8引入了新的操作符，箭头操作符号，也叫lambda操作符,箭头操作符将
         * lambda表达式分成了两部分，
         * 左边:参数列表
         * 右边：所需要实现的功能或者逻辑
         */
        Runnable r=()-> System.out.println("hello world");
        r.run();

    }
    public static List<emp> filteremp(List<emp> list){
        List<emp> list1=new ArrayList<>();
        for (emp emp : list) {
            if(emp.getAge()>=10){
                list1.add(emp);
            }
        }
        return list1;
    }
    public List<emp> filterMethod(List<emp> list,MyFilterEmp filter){
        List<emp> list1=new ArrayList<>();
        for (emp emp : list) {
            if(filter.myFilter(emp)){
                list1.add(emp);
            }
        }
        return list1;
    }
}
