package myutil;
import java.text.DecimalFormat;

public class DecimalFormatTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 = 2.523, d2= 3.123;
		double result = d1+d2;
		System.out.println(result);
		
		DecimalFormat df = new DecimalFormat("#.##");
		String strResult = df.format(result);
		System.out.println(strResult);
		System.out.println(strResult);
		
		//double d3 = (double)strResult;
		
		/*
		 * Wrapper 클래스
		 * 자바에서 객체가 아닌것들을 객체화시켜주는것.
		 * (java.lang)
		 */
		
		//double형으로 바꿔줌.
		double d3 = Double.parseDouble(strResult);
	}

}
