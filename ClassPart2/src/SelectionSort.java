
public class SelectionSort {

	public static void main(String[] args) {
		// TODO 선택정렬
		int[] data = {8, 7, 9, 2, 3, 6};
		long start = System.nanoTime();
		
		for(int row = 0; row < data.length-1; row++) {
			for(int col = row; col < data.length; col++) {
				if(data[row] > data[col]) { //기준을 대상으로 정렬하는거니까 기준점은 바뀌면안됨.
					int temp = data[row];
					data[row] = data[col];
					data[col]= temp;
				}
				
			}
		}
		
		long end = System.nanoTime();
		System.out.println("정렬 후...");
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]+"\t");
		}
		System.out.println("\n\n걸린 시간: " + (end-start) + "ns");

	}

}
