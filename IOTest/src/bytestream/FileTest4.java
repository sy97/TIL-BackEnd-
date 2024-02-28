package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileTest4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(1, "홍길동", "영업", 110, 1000000);
		emp[1] = new Employee(2, "임꺽정", "기술", 111, 1200000);
		emp[2] = new Employee(3, "신돌석", "개발", 112, 1500000);
		//이거자체를 파일로 저장할 수는 없음. 바이트가 아니기 때문에.
		//파일로 다루려면 fileinput이나 fileouput사용해야함.
		//그리고 emp객체이기 때문에 객체를 파일에 쓰기 위한 스트림인 objectoutput쓰는것.
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\emp.txt")); 
		//확장자는 뭘로해도상관은 없지만 명확하게 해야함. 
		
		oos.writeObject(emp[0]);
		oos.writeObject(emp[1]);
		oos.writeObject(emp[2]);
		
		oos.close();
		
		//emp가 1byte면 그냥 흘려보내면 되지만, emp객체 자체가 1byte는 아님. 
		//원래 우리가 1byte씩 쪼개서 흘려보내줘야하는데, 그걸 대신해주는애가 objectouputstream.
		//우리가 objectoutput에게 이걸 1byte로 쪼개서 보내달라고 말해줘야하는데 안말해줘서 그냥 데이터를 바이트로 갖고만있음.
		//그렇게 얘기해주는걸 serializable. = 직렬화. 아무리 복잡한 데이터라도 바이트로 쪼개서 내보내줄수있게하는거.
		//그걸 해주려면 employee 클래스에 implements Serializable 해줘야함.
		//그러고나서 저장해주면 파일이 생성되어있음. 
		
		System.out.println("******사원 정보*******");
		System.out.println("사번\t이름\t업무\t부서번호\t급여");
		System.out.println("------------------------------------");
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\emp.txt"));
	
		for(int i = 0; i < emp.length; i++) {
			Employee e = (Employee)ois.readObject();
			//자식이니까 캐스팅이됨.   ??? 무엇이 무엇을 상속받은거지..?.. object가 모든 클래스의 부모라서? 
			System.out.println(e);
			//원래는 e.tostring()
		}
		
		
		
		
		
		ois.close();
	}
}
