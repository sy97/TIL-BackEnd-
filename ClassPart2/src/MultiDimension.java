
public class MultiDimension {

	public static void main(String[] args) {
		// TODO 다차원
		/*
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] arr3 = {11, 12, 13, 14, 15};
		*/
		
		/*
		int[][] arr = new int[3][5];
		//위의 선형배열을 다차원 배열로 합치기
		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		arr[0][3] =4;
		arr[0][4] =5;
		
		arr[1][0] =6;
		arr[1][1] =7;
		arr[1][2] =8;
		arr[1][3] =9;
		arr[1][4] =10;
		
		arr[2][0] =11;
		arr[2][1] =12;
		arr[2][2] =13;
		arr[2][3] =14;
		arr[2][4] =15;
		*/
		
		/*
		//이렇게 초기화도 가능
		int[][] arr = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
				};
		
		for(int i = 0 ; i < 3 ; i ++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(arr[i][j]+"\t");
			}
		}
		*/
		
		int[][] arr1 = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
				};
		
		int[][] arr2 = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
				};
		
		int[][][] arr3 = {{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15}
			},
			{{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15}}				
		};
		
		for(int i = 0 ; i < 2 ; i ++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 5; k++)
				System.out.println(arr3[i][j][k]+"\t");
			}
			System.out.println();
		}
		
	}

}
