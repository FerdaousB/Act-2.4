import java.sql.Date;
import java.time.LocalDate;

public class Rent {
	
	private int id; 
	private User UserRent; 
	private Book BookRent;
	private LocalDate  date_pret;
	private LocalDate  date_fin; 
	

	public Rent() {
	}


	public Rent(int id, User userRent, Book bookRent, LocalDate date_pret, LocalDate date_fin) {
		this.id = id;
		UserRent = userRent;
		BookRent = bookRent;
		this.date_pret = date_pret;
		this.date_fin = date_fin;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUserRent() {
		return UserRent;
	}


	public void setUserRent(User userRent) {
		UserRent = userRent;
	}


	public Book getBookRent() {
		return BookRent;
	}


	public void setBookRent(Book bookRent) {
		BookRent = bookRent;
	}


	public LocalDate getDate_pret() {
		return date_pret;
	}


	public void setDate_pret(LocalDate date_pret) {
		this.date_pret = date_pret;
	}


	public LocalDate getDate_fin() {
		return date_fin;
	}


	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}


	@Override
	public String toString() {
		return "Rent [id=" + id + ", UserRent=" + UserRent + ", BookRent=" + BookRent + ", date_pret=" + date_pret
				+ ", date_fin=" + date_fin + "]";
	}

	 public boolean equals(Object obj) {
	     if((obj instanceof Rent) && ((Rent)obj).getBookRent().equals(BookRent) &&  ((Rent)obj).getDate_pret().equals(date_pret))
	     
	    	 return true; 
	    			 
	     else
	    
	    	 return false;
	     
	    }
	
	
	
	
	
	
}
