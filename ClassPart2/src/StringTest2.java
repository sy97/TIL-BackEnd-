
public class StringTest2 {

	public static void main(String[] args) {
		// TODO String
		String str1 = "java";
		String str2 = "jsp";
		String str3 = "java";
		
		
		//만약 String str2 = "java"; 했을 때,
		//또 인스턴스를 만들지 않고 str1의 인스턴스 같이 사용함
		//인스턴스= 주소. 메모리낭비 막을 수 있음.
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		//위에는 값이 같은건지 비교하는걱, 아래는 주소비교
		
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
		String str4 = "java1";
		String str5 = "java";
		str4 = str5;
		//참조변수이기 때문에 주소를 넘겨주는것.
		System.out.println(str4 == str5);
		//주소를 넘겨줬기 때문에 주소는 같으니까 true로 나옴.
		
		//강제로 인스턴스를 생성하고자 한다면 new를 이용해서 생성하면 된다.
		String str6 = "java";
		String str7 = new String("java");
		
		System.out.println(str6.equals(str7));
		//true
		System.out.println(str6 == str7);
		//false
		
		
		//절대 수정 불가
		String str8 = "javu";
		//이걸 java로 수정하고싶다. 근데 수정 못함.수정되는게 아니라 새로운 인스턴스 생기는거임.
		//그럼 java담고있던 인스턴스는 garbage 되는거임.
		str8 = "java";
		System.out.println(str8);
		
		String str9 = str8.concat(" is number one");
		//"is number one"을 추가하는것. 근데 이게 java 뒤로 추가되면 수정이 된다는것임.
		//str8과 str9가 같은 주소를 가리켜야되는것 아닌가?
		System.out.println(str9==str8);
		//하지만 주소가 다르다고 나옴.
		//같은 주소에서 수정된것이 아님.
		
		System.out.println(str9);
		//"java is number one"이라는 것이 새로운 인스턴스가 만들어져서 거기 거장된것.
		
		//수정가능
		// StringBuffer sb1 = "java"; 이렇게 생성할 수는 없음.
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = sb1.append("is number one");

		//concat = append 뒤에 추가
		System.out.println(sb2);
		System.out.println(sb1 == sb2);//true 나옴. 둘의 주소가 같다는뜻.
	}

}
