package Advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rayden_Official {

	public static void main(String[] args) {
		List<String> inputByLine=new ArrayList<String>();
		try {
			InputStreamReader isr=new InputStreamReader(System.in,"UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line="abab";
			while((line = br.readLine()) != null) {
				inputByLine.add(line.toString());
			}
			List<String> optList=new ArrayList<String>();
			Collections.sort(inputByLine);;
			for(String l:optList) 
			{
				if(l.equals("A"))
					optList.add("Black");
				if(l.equals("B"))
					optList.add("White");
			}
			for(String line2 :inputByLine)
				System.out.println(line2);
			isr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
