import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO set테스트
		HashSet set = new HashSet();
		
		set.add("carrie");
		set.add("Kabbin");
		set.add("kairo");
		set.add("kairo");
		set.add("kariss");
		
		System.out.println("데이터의 갯수 : " + set.size());
		System.out.println(set.toString());
	
		TreeSet ts = new TreeSet();
		ts.add("juliet");
		ts.add("terry");
		ts.add("kabbin");
		ts.add("terry");
		ts.add("carrie");
		
		System.out.println("데이터의 갯수 : " + ts.size());
		System.out.println(ts.toString());
		
		//set은 이렇게는 불가능.
		/*
		for(int i = 0; i < set.size(); i++) {
			System.out.println(set.get(i));
		}
		*/
		
		//set꺼내오기
		//set이 가리키고 있는 데이터 줄세우기
		Iterator it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
