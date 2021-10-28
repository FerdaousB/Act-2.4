import java.util.Arrays;

public class User {
	
	private static final int NB_R_book = 0;
	private int id; 
	private String prenom; 
	private String nom; 
	private String addresse; 
	private String numTel;
	private String mail; 
	public Rent[] Rent= new Rent[NB_R_book];
	
	
	
	public User() {
	}

	public User(int id, String prenom, String nom, String addresse, String numTel, String mail, Rent[] rent) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.addresse = addresse;
		this.numTel = numTel;
		this.mail = mail;
		Rent = rent;
	}

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Rent[] getRent() {
		return Rent;
	}

	public void setRent(Rent[] rent) {
		Rent = rent;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", addresse=" + addresse + ", numTel="
				+ numTel + ", mail=" + mail + ", Rent=" + Arrays.toString(Rent) + "]";
	}
	
	
	 public boolean equals(Object obj) {
	     if((obj instanceof User) && ((User)obj).getNom().equals(nom) &&  ((User)obj).getPrenom().equals(prenom))
	     
	    	 return true; 
	    			 
	     else
	    
	    	 return false;
	     
	    }

	
	
	

}
