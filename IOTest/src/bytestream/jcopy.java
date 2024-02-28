package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class jcopy {
	static void copy() throws IOException {
		FileInputStream fin 
			= new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\A.txt");
		FileOutputStream fout
			= new FileOutputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\B.txt");
		
		while(true) {
			int input = fin.read();
			if(input == -1) {
				break;
			}
			fout.write((char)input);
		}
		
		fin.close();
		fout.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copy();
	}

}
