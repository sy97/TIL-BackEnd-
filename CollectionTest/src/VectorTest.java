import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		//vector 쓸 때는 addElement 권장
		v.addElement("홍길동");
		v.addElement(true);
		v.addElement(100);
		v.addElement(3.14);
		v.addElement('가');
		
		//값 꺼내기
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
		
		//용량. vector는 10개까지만 저장할 수 있음.
		System.out.println(v.capacity());

	
		for(int i =0; i<7; i++) {
			v.addElement(i);
		}
		
		
		System.out.println(v.size());
		//용량이 20으로 늘어남
		System.out.println(v.capacity());
		
		//용량을 딱 맞춰주는 메서드
		v.trimToSize();
		System.out.println(v.capacity());
	}

}
