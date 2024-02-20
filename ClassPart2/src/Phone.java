
public class Phone {

	public static void main(String[] args) {
		// TODO  전화번호부 프로그램
		String [][] phonenumber = {{"Tom", "555-1111", "NewYork"},
		{"hong", "555-2222", "서울시 강남구"},
		{"Kim", "555-3333", "서울시 강동구"},
		{"lee", "555-4444", "서울시 강북구"}};
		//위의 데이터는 3차원인데 String자체가 1차원이니까 [][]만해주면됨.
		
			boolean result = false;
			int i = 0;
			for(i =0; i < phonenumber.length; i++) {
				if(args[0].equals(phonenumber[i][0])) {
					result = true;
					break;
					}
				else {
					result = false;
				}
			
			}
			//cnt해주면 안되는 이유는, cnt는 맞는값을 찾든 틀린 값을 찾든 cnt++되기 때문에 항상 +1이됨
			
			/*
			 * cnt=0으로해주면 안되는 이유가뭘까? kim=2
			 * loop1: i=0/cnt=1/kim/p00=tom/result=false/i=1
			 * loop2: i=1/cnt=2/kim/p01=hong/result=false/i=2
			 * loop3: i=2/cnt=3/kim/p02=kim/result=true/ break니까 for문 빠져나옴.
			 */
			if(result == true) {
			System.out.println("이름 :"+phonenumber[i][0]);
			System.out.println("전화번호 :"+phonenumber[i][1]);
			System.out.println("주소 :"+phonenumber[i][2]);
			}
			
			else {
				System.out.println("찾는 이름이 없습니다.");
			}
	}
	
			
				
		
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
		
		
