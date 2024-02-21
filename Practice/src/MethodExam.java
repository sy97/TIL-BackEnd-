class MemberService {
	boolean login(String name, String pw) {
		if(name.equals("hong") && pw.equals("12345")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃되었습니다.");
		}
	}
}

public class MethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
