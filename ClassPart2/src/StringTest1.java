
public class StringTest1 {
	public static void main(String[] args) {
	// TODO String클래스 사용법
	
		char name1[] = {'홍','길','동'};
		for(int i = 0 ; i < name1.length; i++) {
			System.out.print(name1[i]);
		}
		System.out.println();
		//원래는 이렇게 써야하는데, 이건 불편함.
	
		
		String name2 = new String();
		//클래스니까 객체 생성
		//String name은 스트링이라는 설계도로 만들어진 공간의 주소
		
		name2 = "홍길동";
		System.out.println(name2);
		
		String name3 = new String("임꺽정");
		System.out.println(name3);
		//원래는 배열로 묶여있는것
		
		String name4 = "신들석";
		System.out.println(name4);
		//더 간단하게는 이렇게
		
		String name5 = "김수한무거북이와두루미";
		System.out.println(name5);
		
		System.out.println();
		
		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "임꺽정";
		names[2] = "김수한무거북이와두루미";
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("김수한무거북이와두루미".length());
	}
}
