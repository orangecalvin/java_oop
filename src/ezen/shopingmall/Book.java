package ezen.shopingmall;

public class Book extends Item {
	
	private String author;
	private String isbn;
	
	public Book() {}

	public Book(int id, String name, int price, String author, String isbn) {
		super(id, name, price);
		this.author = author;
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+author+"\t"+isbn;
	}
	
	
	
	
	
	
}
