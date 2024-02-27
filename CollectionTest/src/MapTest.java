import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("k1", "홍길동");
		map.put("k2", "임꺽정");
		map.put("k3", "유비");
		map.put("k4", "관우");
		map.put("k5", "장비");
	
		System.out.println("데이터의 갯수 : "+map.size());
		System.out.println(map.toString());
		
		//키값을 입력해서 값 꺼내오기.
		//단,index가 아니라서 반복문은 못돌림.
		System.out.println(map.get("k1"));
		
		//값을 꺼내오는 방법
		//set처럼 먼저 줄을 세워주면됨.
		//줄 세우려면 iterator가 있어야하는데 없으므로 keyset써야함.
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			
			/*
			원래 서로다른 클래스는 캐스팅을 할 수 없음.
			근데 왜 여기서는 캐스팅이 됐을까?.. 
			하지만 부모는 자식을 참조할 수 있고, 자식에게 다시 돌려줄 수 있음. 
			여기서는 next메서드가 부모임. 
			*/
			String key = (String)it.next();
			System.out.println(map.get(key));
		}
	}

}
