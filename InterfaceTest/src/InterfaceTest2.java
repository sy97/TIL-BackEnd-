import java.util.Scanner;

interface Volume {
	void volumeUP(int vol);
	void volumeDown(int vol);
}

interface Power{
	void powerOn();
	void powerOff();
}



class TV implements Volume, Power{ //오버라이딩을 해야하기때문에 무조건 volumeUP, volumeDown을 써야한다.(표준화)
	private int vol; //볼륨 변수 준비
	private Scanner sc;

	
	TV() {
		sc = new Scanner(System.in);
		System.out.print("TV를 켜시겠습니까?(Y/N):");
		String input = sc.nextLine();
		if(input.equals("Y")) {
			this.powerOn();
		}
		
		else if(input.equals("N")){
			this.powerOff();
		}
		
	}
	
	public void volumeUP(int vol) {
		sc = new Scanner(System.in);
		this.vol += vol;
		if(this.vol  >= 50) {
			System.out.println("소리는 50 미만으로 설정이 가능합니다.다시 입력해주시기 바랍니다.:");
			this.display(sc.nextInt());
		}
		else{
			this.display(this.vol);
		}
	}

	@Override //@붙은거: annotation. 아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		sc = new Scanner(System.in);
		this.vol -= vol;
		if(this.vol <= 0) {
			System.out.println("MUTE");
		}
		else{
			this.display(this.vol);
		};
	}
	
	public void display(int vol) {
		this.vol = vol;
		System.out.println("현재 TV볼륨은 " + vol + "입니다.");
	}

	@Override
	public void powerOn() {
		sc = new Scanner(System.in);
		System.out.println("TV가 켜졌습니다.");
		System.out.println("볼륨을 조절하시겠습니까?");
		System.out.print("1.증가 /2.감소 : ");
		int input = sc.nextInt();
		if(input==1) {
			System.out.print("얼마나 증가시킬까요? :" );
			this.volumeUP(sc.nextInt());
		}
		else if(input==2) {
			System.out.print("얼마나 감소시킬까요? :" );
			this.volumeDown(sc.nextInt());
		}
		
		
	}

	@Override
	public void powerOff() {
		System.out.println("TV가 꺼졌습니다.");
	}


		
	
}

class Radio implements Volume, Power {
	private int vol; //볼륨 변수 준비
	
	Radio() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radio를 켜시겠습니까?(Y/N):");
		String input = sc.nextLine();
		if(input.equals("Y")) {
			this.powerOn();
		}
		
		else if(input.equals("N")){
			this.powerOff();
		}
		
	}
	
	public void volumeUP(int vol) {
		Scanner sc = new Scanner(System.in);
		this.vol += vol;
		if(vol  >= 50) {
			System.out.println("소리는 50 미만으로 설정이 가능합니다.다시 입력해주시기 바랍니다.:");
			this.display(sc.nextInt());
		}
		else{
			this.display(vol);
		}
	}

	@Override //@붙은거: annotation. 아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		Scanner sc = new Scanner(System.in);
		this.vol -= vol;
		if(vol <= 0) {
			System.out.println("MUTE");
		}
		else{
			this.display(vol);
		};
	}
	
	public void display(int vol) {
		this.vol = vol;
		System.out.println("현재 Radio볼륨은 " + vol + "입니다.");
	}

	@Override
	public void powerOn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radio가 켜졌습니다.");
		System.out.println("볼륨을 조절하시겠습니까?");
		System.out.print("1.증가 /2.감소 : ");
		
		int input = sc.nextInt();
		if(input==1) {
			System.out.print("얼마나 증가시킬까요? :" );
			this.volumeUP(sc.nextInt());
		}
		else if(input==2) {
			System.out.print("얼마나 감소시킬까요? :" );
			this.volumeDown(sc.nextInt());
		}
		
		
	}
	@Override
	public void powerOff() {
		System.out.println("Radio가 꺼졌습니다.");
	}

	
	
}

class Speaker implements Volume, Power {
	private int vol; //볼륨 변수 준비
	
	Speaker() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Speaker를 켜시겠습니까?(Y/N):");
		String input = sc.nextLine();
		if(input.equals("Y")) {
			this.powerOn();
		}
		
		else if(input.equals("N")){
			this.powerOff();
		}
	}
	
	public void volumeUP(int vol) {
		Scanner sc = new Scanner(System.in);
		this.vol += vol;
		if(vol  >= 50) {
			System.out.println("소리는 50 미만으로 설정이 가능합니다.다시 입력해주시기 바랍니다.:");
			this.display(sc.nextInt());
		}
		else{
			this.display(vol);
		}
	}

	@Override //@붙은거: annotation. 아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		Scanner sc = new Scanner(System.in);
		this.vol -= vol;
		if(vol <= 0) {
			System.out.println("MUTE");
		}
		else{
			this.display(vol);		
		};
	}
	
	public void display(int vol) {
		this.vol = vol;
		System.out.println("현재Speaker볼륨은 " + vol + "입니다.");
	}

	@Override
	public void powerOn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Speaker가 켜졌습니다.");
		System.out.println("볼륨을 조절하시겠습니까?");
		System.out.print("1.증가 /2.감소 : ");
		int input = sc.nextInt();
		if(input==1) {
			System.out.print("얼마나 증가시킬까요? :" );
			this.volumeUP(sc.nextInt());
		}
		else if(input==2) {
			System.out.print("얼마나 감소시킬까요? :" );
			this.volumeDown(sc.nextInt());
		}
	}
	
	@Override
	public void powerOff() {
		System.out.println("Speaker가 꺼졌습니다.");
	}
}


class Product{
	static void ProductNumber(int number) {
		switch(number) {
		case 1:
			new TV();
			break;
		case 2:
			new Radio();
			break;
		case 3:
			new Speaker();
			break;
		default:
			System.out.println("프로그램 종료");
		}
		
	}
	
}


public class InterfaceTest2 {
	
	public static void main(String[] args) {
		// TODO 인터페이스를 이용한 표준화
		
		Scanner sc = new Scanner(System.in);
		System.out.println("제품 선택");
		System.out.println("1.TV / 2.Radio / 3. Speaker");
		System.out.print("번호를 선택해주세요(선택하지 않을 시, 프로그램 종료): ");
		int product = sc.nextInt();
		// 제품을 선택하면 번호를 인자로 넘겨줘서 , if문으로 각 제품의 클래스의 생성자 호출..
		Product.ProductNumber(product);



	}

}

