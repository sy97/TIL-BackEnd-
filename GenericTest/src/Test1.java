import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO 미리 타입 체크
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		//코드가 점점 길어지다보면 내가 원래 어떤 타입을 저장하고싶었는지 까먹음.
		
		//list.add(100);
		//원래는 문자열만 저장하려고 만든건데 까먹고 숫자를 입력하게됨.
		//위에 제너릭을 달아주고나니 바로 에러남.
		
		String str = null;
		for(int i=0; i<list.size(); i++) {
			
			//원래는array를 문자열로만 담으려고했던거니까, string으로 캐스팅
			str = (String)list.get(i);
			
			//그러다보면 이렇게 에러가발생
			System.out.println(str);
		}
		
	}

}
