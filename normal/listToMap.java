package normal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class listToMap {

	public static void main(String[] args) {
		customer c1=new customer(1,"KIran","pune");
		customer c2=new customer(2,"KKIran","Hyd");
		customer c3=new customer(3,"KIranK","Blr");
		
		List<customer> list=Arrays.asList(c1,c2,c3);
		
    Map<String,customer> javaMap=list.stream().collect(Collectors.toMap(customer::getName,Function.identity()));
	javaMap.forEach((k,v)-> System.out.println(k+" "+v));
	}

}
