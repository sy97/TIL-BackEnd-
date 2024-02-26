import BookPack.Book;
//패키지 불러왔고, 클래스 패스 만들어서 파일위치와상관없이 사용가능.
import BookExtend.Book_v1;

public class BookManager {

	public static void main(String[] args) {
		// TODO 패키지 테스트
		
		Book[] books = new Book[4];
		books[0] = new Book("Java", "Tom", 2005);
		books[1] = new Book("Jsp", "Jane", 2007);
		books[2] = new Book("Spring", "John", 2000);
		books[3] = new Book("React", "Marry", 2010);
		
		for(int i=0; i<books.length; i++){
			books[i].display();
		

		}
		
		Book_v1[] books1 = new Book_v1[4];
		books1[0] = new Book_v1("Java", "Tom", 2005, "A");
		books1[1] = new Book_v1("Jsp", "Jane", 2007, "A");
		books1[2] = new Book_v1("Spring", "John", 2000, "B");
		books1[3] = new Book_v1("React", "Marry", 2010, "C");
		//다른 패키지에 있으니까 사용하려면 Book_v1을 public으로 만들어야함.
		
		for(int i=0; i<books1.length; i++){
			books1[i].display();
		}

	}	

}