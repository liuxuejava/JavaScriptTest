/**
 * Created by liuxu on 2018/5/19.
 */
public class MyFilterEmpImpl implements MyFilterEmp<emp> {
    @Override
    public boolean myFilter(emp emp) {
        return emp.getAge()>=30;
    }
}
