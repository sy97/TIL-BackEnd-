import java.io.File;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// TODO File 클래스
		File f = new File("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\emp.txt");
		if(f.exists()) {
			System.out.println("파일의 이름 : " + f.getName());
			System.out.println("파일의 경로(상대) : " + f.getPath());
			System.out.println("파일의 경로(절대) : " + f.getAbsolutePath());
			System.out.println("크기 : "+f.length()+"byte");
			System.out.println("마지막 수정일 : "+ new Date(f.lastModified()));
			//수정일이 long값으로 나옴. 날짜를 숫자로 나타낸것. 그래서 new Date로 묶어주기.
		}
		else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		f.delete();
	}

}
