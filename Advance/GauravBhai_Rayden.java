package Advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GauravBhai_Rayden {

	public static void main(String[] args) {
		List<String> inputByLine = new ArrayList<>();
		inputByLine.add("B");
		inputByLine.add("A");
		inputByLine.add("A");
		inputByLine.add("B");
		
		List<String> optList= new ArrayList<String>();
		Collections.sort(inputByLine);
		for(String l:inputByLine) {
			if(l.equals("A"))
				optList.add("Black");
			if(l.equals("B"))
				optList.add("White");
		}
		optList.toArray().toString();
		System.out.println(optList);
	}

}
