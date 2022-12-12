
package interview;
import java.util.*;
public class valantine {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"i");
        map.put(2,"love");
        map.put(3,"coding");
        map.put(1,"i love coding on hackerearcth");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }
}
}