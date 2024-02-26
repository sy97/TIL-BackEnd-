
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

	}	

}