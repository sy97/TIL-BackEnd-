package exam;

import java.io.Serializable;

public class Exam implements Serializable {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int total;
	private int avg;
	private char grade;

	
	public Exam(int no, String name, int kor, int eng) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = kor+eng;
		this.avg = avg(kor,eng);
		this.grade = grade(avg);
	}
	
	int avg(int kor, int eng) {
		return (kor + eng) / 2;
	}
	
	char grade(int avg) {	
		if(avg >= 90) {
			grade = 'A';
			}
		else if(avg >= 80) {
			grade = 'B';
			}
		else if(avg >= 70) {
			grade = 'C';
			}
		else if(avg>= 60) {
			grade = 'D';
		}
		else {
			grade ='F';
		}
		return grade;
	}

	



	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + 
				"\t" + total +"\t"+ avg + "\t" + grade + "\t";
	
	}
	//게터대신에 Object 클래스에 있는 tostring을 오버라이딩
	
}
