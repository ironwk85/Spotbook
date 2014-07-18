package co.think.pojo;

import android.graphics.Bitmap;

public class Book {
	private long id;
	private String title = null;
	private String author = null;
	private String resume = null;
	private String imageUrl = null;
	private Bitmap cover = null;
	
	public Book(){}
	
	public Book(long id, String title, String author, String resume, String imageUrl, Bitmap cover){
		this.title = title;
		this.author = author;
		this.resume = resume;
		this.cover = cover;
		this.imageUrl = imageUrl;
		this.id = id;
	}
	
	public String getImageUrl(){
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Bitmap getCover() {
		return cover;
	}

	public void setCover(Bitmap cover) {
		this.cover = cover;
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
}

