package valtile;

import java.io.*;
public class file {

	public static void main(String[] args) {
		try {
			File obj=new File("filename.txt");
			if(obj.createNewFile()) {
				System.out.println("file creatred"+" "+obj.getName());
			}else {
				System.out.println("file already exists");
			}
		}catch(IOException e){
			System.out.println("error accured");
			e.printStackTrace();
			
		}

	}

}
