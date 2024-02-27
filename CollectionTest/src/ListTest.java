import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("carrie");	
		list.add("kairo");	
		list.add("kabbin");	
		list.add("kairo");	
		list.add("terry");
		
		System.out.println("데이터의 갯수 : " + list.size());
		System.out.println(list.toString());
		
		//데이터 꺼내는법
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//검색기능
		if(list.contains("kairo")) {
			System.out.println("찾았다.");
			//kairo가 몇번째에 있는지.
			System.out.println((list.indexOf("kairo")+1)+"번째에 있다.");
		}
		else {
			System.out.println("못찾았다.");
		}
		
		//값 추가
		//배열은 맨 마지막에만 추가할 수 있음.
		
		//100이라는 값을 2번째에 넣겠다.
		list.add(2, 100);
		System.out.println(list);
		
		//삭제
		list.remove(3);
		System.out.println(list);

	}

}
