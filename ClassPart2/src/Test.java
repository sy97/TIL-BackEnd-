class Student1{
	//원래는 따로 저장해야하는데 편의상 같이
	
	//class로 타입이 다른 변수들 묶어주기
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
		Student1(String name, int no, int kor, int eng) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}
	//객체 생성할 때 값을 저장할 생성자 만들기.
	//한사람의 정보를 저장할 수 있는 설계도.
	

}					
class Swap{
	void swap(Student1[] arr, int n1, int n2) {
		Student1 temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}
	

public class Test {

	public static void main(String[] args) {
		// TODO 클래스와 배열 이용한 성적표
		Swap sp = new Swap();
		Student1[] students = new Student1[3];
		//student클래스의 객체를 3개 생성한게아니다.
		//Student 클래스의 객체를 담기 위한 참조변수를 생성하것이다.
		
		//char[] grade = new char[3]; 이건 객체 생성. 
		//char는 비객체인 일반 변수 데이터인데, 이렇게하면 객체가 생성되도록 자바가처리해주는거.
		
		students[0] = new Student1("홍길동", 1, 98, 90);
		students[1] = new Student1("임꺽정", 2, 76, 55);
		students[2] = new Student1("신돌석", 3, 85, 73);
		//객체 생성은 생성자를 적어줘야함.	
		
		for(int i =0; i<students.length;i++ ) {
			students[i].tot = students[i].kor + students[i].eng;
		}
		
		//평균
		for(int i =0; i<students.length;i++ ) {
			students[i].avg = (students[i].kor + students[i].eng)/2;
		}
		//학점
		for(int i = 0; i < students.length; i++) {	
		if(students[i].avg >= 90) {
				students[i].grade = 'A';
			}
		else if(students[i].avg >= 80) {
			students[i].grade = 'B';
			}
		else if(students[i].avg >= 70) {
			students[i].grade = 'C';
			}
		else if(students[i].avg>= 60) {
			students[i].grade = 'D';
		}
		else {
			students[i].grade ='F';
		}
			
			
		}
		//등수
		for(int i = 0; i < students.length; i++) {
			int cnt=1; //cnt는 내부에 써줘야 계속 1등과 비교가능
			students[i].rank = 1;//sungjuk[i][5] = rank
			for(int j =0; j < students.length; j++) {
				//원래 1등인데 내가 비교하려는 애보다 내 점수가 작으면 내 등수가 하나씩 밀리는거니까 rank=sungjuk[i][5]++. ++되는건 안좋은거임. 등수가 밀리는거임.
				if(students[i].avg < students[j].avg) {
					students[i].rank ++;
				}		
			}
			
		}
		
		//출력
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i <students.length; i++) {
				System.out.print(students[i].no+"\t"
						+students[i].name+"\t"
						+students[i].kor+"\t"
						+students[i].eng+"\t"
						+students[i].tot+"\t"
						+students[i].avg+"\t"
						+students[i].grade+"\t"
						+students[i].rank+"\t");
				System.out.println();
		}
		
	
		for(int row = 0 ; row < students.length-1; row++) {
			for(int col = row+1; col < students.length; col++) {
				if(students[row].rank > students[col].rank) {
					//나보다 랭크가 높다는건, 다른값이 나보다 낮다는거.
					sp.swap(students, row, col);
				}
			}
		}
		
		//정렬 후
		//정렬을 하려면,, 기준을 또 평균으로 잡은다음에 students[row]의 값을 students[row+1]이랑 바꾸기?
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i <students.length; i++) {
				System.out.print(students[i].no+"\t"
						+students[i].name+"\t"
						+students[i].kor+"\t"
						+students[i].eng+"\t"
						+students[i].tot+"\t"
						+students[i].avg+"\t"
						+students[i].grade+"\t"
						+students[i].rank+"\t");
				System.out.println();
			}
		
		}
	}
}