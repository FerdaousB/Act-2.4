
public class Book {
	
	private int id; 
	private String title; 
	private String author; 
	private String editor; 
	private int page_nb ; 	
	private String summary ; 
	private Library LibraryBook ;
	

	public Book() {
	}
	
	public Book(int id, String title, String author, String editor, int page_nb , String summary, Library LibraryBook) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.page_nb = page_nb ;
		this.summary = summary;
		LibraryBook = LibraryBook;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getPageNb() {
		return page_nb ;
	}

	public void setPageNb(int page_nb ) {
		this.page_nb  = page_nb ;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Library getLibrary() {
		return LibraryBook;
	}

	public void setLibrary(Library LibraryBook) {
		LibraryBook = LibraryBook;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", editor=" + editor + ", page_nb ="
				+ page_nb  + ", summary=" + summary + ", LibraryBook=" + LibraryBook + "]";
	}  
	
	public boolean equals(Object obj) {
	     if((obj instanceof Book) && ((Book)obj).getTitle().equals(title) &&  ((Book)obj).getAuthor().equals(author))
	     
	    	 return true; 
	    			 
	     else
	    
	    	 return false;
	     
	    }
	
	
	
	
}
