import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmailTest {
    public static void main(String[] args){
        String str = "zhangsan@sohu.com,lisi@163.com,wangwu@sina.com";
        String[] str1 = str.split(",");
        Map<String,String> m = new HashMap<>();
        for(String s:str1){
            String[] temp = s.split("@");
            m.put(temp[0],temp[1]);
        }
        Set<Map.Entry<String,String>> set = m.entrySet();
        Iterator<Map.Entry<String,String>> i = set.iterator();
        while(i.hasNext()){
            Map.Entry<String,String> ma = i.next();
            System.out.println("用户名称："+ma.getKey());
            System.out.println("用户地址："+ma.getValue());
            System.out.println();
        }
    }
}
