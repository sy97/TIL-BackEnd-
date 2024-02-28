package exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class FileTest4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Exam[] exam = new Exam[3];
		Scanner sc = new Scanner(System.in);
		int no = 0;
		String name = null;
		int kor = 0;
		int eng = 0;
		for(int i = 0; i < exam.length; i++) {
			System.out.println((i+1)+"번 학생");
			no = (i+1);
			System.out.print("이름: ");
			name = sc.next();
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
			
			exam[i] = new Exam(no, name, kor, eng);
		}
		
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\exam.txt")); 
		//확장자는 뭘로해도상관은 없지만 명확하게 해야함. 
		
		for(int i = 0; i<exam.length; i++) {
			oos.writeObject(exam[i]);
		}
		
		oos.close();
		
		
		System.out.println("****************성적표****************");
		System.out.println("번호\t이름\t국어점수\t영어점수\t총점\t평균\t등급");
		System.out.println("------------------------------------");
		
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\exam.txt"));
	
		for(int i = 0; i < exam.length; i++) {
			Exam e = (Exam)ois.readObject();
			System.out.println(e);
			//원래는 e.tostring()
		}
		
		
		ois.close();

	}
}
