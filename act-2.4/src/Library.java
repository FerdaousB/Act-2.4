import java.util.Arrays;

public class Library {
	
	private static final int NB_Book = 100;
	private static final int NB_R_book = 50;
	private int id; 
	private String lib_name ; 
	private String adresse; 
	private String numTel; 
	public Book[] Book= new Book[NB_Book];
	public Rent[] Rent= new Rent[NB_R_book];
	
	
	public Library() {
	}


	public Library(int id, String lib_name , String adresse, String numTel, Book[] Book, Rent[] Rent) {
		this.id = id;
		this.lib_name  = lib_name ;
		this.adresse = adresse;
		this.numTel = numTel;
		this.Book = Book;
		this.Rent = Rent;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLib_name() {
		return lib_name ;
	}


	public void setName(String lib_name ) {
		this.lib_name  = lib_name ;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


	public Book[] getBook() {
		return Book;
	}


	public void setBook(Book[] book) {
		Book = book;
	}


	public Rent[] getRent() {
		return Rent;
	}


	public void setRent(Rent[] rent) {
		Rent = rent;
	}


	@Override
	public String toString() {
		return "Library [id=" + id + ", lib_name =" + lib_name  + ", adresse=" + adresse + ", numTel=" + numTel + ", Book="
				+ Arrays.toString(Book) + ", Rent=" + Arrays.toString(Rent) + "]";
	}


	
	

	

	
	

}
