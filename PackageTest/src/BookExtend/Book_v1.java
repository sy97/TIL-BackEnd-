package BookExtend;
import BookPack.Book;
//클래스 패스 걸려있어서 아무데서나 사용가능


public class Book_v1 extends Book {
private String pubName;
	
	public Book_v1(String t, String a, int y, String p){
		//다른 곳에서 이 패키지의 이 클래스를 사용하려면 public으로 바꿔줘야함.

		super.title = t;
		super.author = a;
		super.year = y;

		this.pubName = p;
	}	
	
	
	public void display(){
		System.out.println(title + "," + author + "," + year + "," + pubName);
	}

}
