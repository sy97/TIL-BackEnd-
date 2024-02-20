
public class Sungjuk_v2 {

	public static void main(String[] args) {
		// TODO 2차원 배열을 이용한 두번째 버전의 성적표
		/*
		int[] num = {1, 2, 3};
		int[] kor = {98, 76, 85};
		int[] eng = {90, 55, 73};
		int [] tot = new int[3];
		int [] avg = new int[3];
		int [] rank =new int[3];
		*/
		
		String[] names = {"홍길동", "임꺽정", "신돌석"};
		char [] grade = new char[3];
		//배열은 같은 타입끼리만 묶을 수 있어서 따로따로 해야함.

		//위에 주석처리된걸 2차로 묶는다고하면 {학번, 국어, 영어, 총점, 평균, 등수}; 
		//int[][] sungjuk = new int[3][6];
		//근데 이렇게하면 따로따로 묶어줘야해서 불편함. 
		int[][] sungjuk = {
				{1, 98, 90, 0, 0, 0},
				{2, 76, 55, 0, 0, 0},
				{3, 85, 73, 0, 0, 0}
		};
		
		//총점
		for(int i = 0; i < sungjuk.length; i++) {
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		
		//평균
		for(int i = 0; i < sungjuk.length; i++) {
			sungjuk[i][4] = (sungjuk[i][1] + sungjuk[i][2])/2;
		}
		
		//등수
		for(int i = 0; i < sungjuk.length; i++) {
			int cnt=1; //cnt는 내부에 써줘야 계속 1등과 비교가능
			sungjuk[i][5] = 1;//sungjuk[i][5] = rank
			for(int j =0; j < sungjuk.length; j++) {
				//원래 1등인데 내가 비교하려는 애보다 내 점수가 작으면 내 등수가 하나씩 밀리는거니까 rank=sungjuk[i][5]++. ++되는건 안좋은거임. 등수가 밀리는거임.
				if(sungjuk[i][4] < sungjuk[j][4]) {
					sungjuk[i][5] ++;
				}		
			}
			
		}
		
		for(int i = 0; i < sungjuk.length; i++) {	
		if(sungjuk[i][4] >= 90) {
				grade[i] = 'A';
			}
		else if(sungjuk[i][4] >= 80) {
				grade[i] = 'B';
			}
		else if(sungjuk[i][4] >= 70) {
				grade[i] = 'C';
			}
		else if(sungjuk[i][4] >= 60) {
				grade[i] = 'D';
		}
		else {
				grade[i] ='F';
		}
			
			
		}
		
		//출력
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i < sungjuk.length; i++) {
				System.out.print(sungjuk[i][0]+"\t"+names[i]+"\t"+sungjuk[i][1]+"\t"+sungjuk[i][2]+"\t"+sungjuk[i][3]+"\t"+sungjuk[i][4]+"\t"+grade[i]+"\t"+sungjuk[i][5]+"\t");
			System.out.println();
		}
		
		//정렬
		//등수를 기준으로 등수가 더 높은사람, 즉 숫자가 작은사람의 [i]랑 [i+1]이랑 아예 바꿔주기.
		//선택정렬
		for(int row = 0 ; row < sungjuk.length-1; row++) {
			for(int col = row+1; col < sungjuk.length; col++) {
				if(sungjuk[row][4] < sungjuk[col][4]) {
					//일일이 값의 위치를 다 바꿔줄 필요가없고, 번지수만 바꿔주면됨. 주소만 바꿔주면됨.
					//오름차순.
					int[] temp = sungjuk[row]; //행만 바꿔주면되니까 이렇게. int[] temp인거 주의하기. 
					sungjuk[row] = sungjuk[col];
					sungjuk[col] = temp;
					
					//얘네는 배열로 안묶였으니 따로.
					char ch_temp = grade[row];
					grade[row] = grade[col];
					grade[col] = ch_temp;
					
					String st_temp = names[row];
					names[row] = names[col];
					names[col] = st_temp;
					
				}
			}
		}
		//코드가 줄어서좋지만, 가독성이 떨어짐.
		
		System.out.println();
		
		//정렬 후
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0; i < sungjuk.length; i++) {
				System.out.print(sungjuk[i][0]+"\t"+names[i]+"\t"+sungjuk[i][1]+"\t"+sungjuk[i][2]+"\t"+sungjuk[i][3]+"\t"+sungjuk[i][4]+"\t"+grade[i]+"\t"+sungjuk[i][5]+"\t");
			System.out.println();
		}
	}

}
