
public class Phone_DANAver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] phoneNumber = {{"Tom", "555-1111", "NewYork"},
				{"hong", "555-2222", "서울시 강남구"},
				{"Kim", "555-3333", "서울시 강동구"},
				{"lee", "555-4444", "서울시 강북구"}};
		
		boolean result = true;
		for(int i=0; i<phoneNumber.length; i++) {
			  if(args[0].equals(phoneNumber[i][0])) {
				 System.out.println("이름: " + phoneNumber[i][0]);
			 	 System.out.println("전화번호: " + phoneNumber[i][1]);
			 	 System.out.println("주소: " + phoneNumber[i][2]);
			 	 result=false;
			 	break;
			  }
			     	 
			} 
		
		
		if(result != false) {
			System.out.println("찾는 이름이 없습니다.");
		}

	}

}
