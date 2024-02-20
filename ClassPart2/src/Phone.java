
public class Phone {

	public static void main(String[] args) {
		// TODO  전화번호부 프로그램
		String [][] phonenumber = {{"Tom", "555-1111", "NewYork"},
		{"hong", "555-2222", "서울시 강남구"},
		{"Kim", "555-3333", "서울시 강동구"},
		{"lee", "555-4444", "서울시 강북구"}};
		//위의 데이터는 3차원인데 String자체가 1차원이니까 [][]만해주면됨.
		
	
			for(int i =0; i < args.length; i++) {
				for(int j =0; j < 3; j++) {
					if(args[0].equals(phonenumber[i][0])) {
					System.out.println("이름 :"+phonenumber[i][j]);
					System.out.println("전화번호 :"+phonenumber[i][j]);
					System.out.println("주소 :"+phonenumber[i][j]);
					}
					
					else {
						System.out.println("찾는 이름이 없습니다.");
					}
					
				}
				break;
				
			}

	
		/*
		 * java phone hong
		 * 이름: hong 
		 * 전화번호 : 555-2222 
		 * 주소 : 서울시 강남구
		 * 
		 * java phone choi
		 * 찾는 이름이 없습니다.
		 */
		
		
	}

}
