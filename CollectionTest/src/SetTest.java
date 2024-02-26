import java.util.HashSet;

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
	}

}
