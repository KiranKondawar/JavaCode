package johns;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_Reader {

	public static void main(String[] args) {
		String str[]= {"KIran","Suraj","Konadawr"};
		try {
			
			BufferedWriter Writer=new BufferedWriter(new FileWriter("C:\\Users\\Kiran Kondawar\\Desktop\\Practice\\J2EE\\java basic program\\src\\johns\\output.txt"));
			Writer.write("First");
			for(String st: str) {
				Writer.write("\n" + st);
			}
			Writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		BufferedReader Reader=new BufferedReader(new FileReader("C:\\Users\\Kiran Kondawar\\Desktop\\Practice\\J2EE\\java basic program\\src\\johns\\output.txt"));
		String line="";
		while((line = Reader.readLine()) != null)
				{
			System.out.println(line);
				}
		Reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
