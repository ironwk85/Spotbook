package co.think.pojo;

public class Cell {
	private Book book;
	
	public Cell (Book book){
		this.book = book;
	}
	
	public Book getBook (){
		return book;
	}
	
	public void setBook (Book book){
		this.book = book;
	}
}
