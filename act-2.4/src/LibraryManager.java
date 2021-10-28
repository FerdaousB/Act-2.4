import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class LibraryManager {
	


	Connection con = ConnectionManager.getConnection();
	ResultSet rs = null ;
	
   
	
	public void afficherLivres() throws SQLException {
		
		 String  requete = "select * from book";
		
         try {
        	 
        	 Statement tmt = con.createStatement();
             rs = tmt.executeQuery(requete);             
             System.out.println(" ---------Affichage de Books------ "+ " \n");
             
           while(rs.next())
		   {
	            System.out.println(rs.getString("title")+ " \n"+ rs.getString("author") + " \n" + rs.getString("editor") + "\n" + rs.getString("summary") + "\n" + rs.getInt("page_nb"));
	             System.out.println(" ");

		   }
           rs.close();
           
         
	       } catch (SQLException e) {
	    	   e.printStackTrace();
	       }   
	}
	
	
	public void AjouterLivres() throws SQLException {
		
		 String  requete = "INSERT INTO book (id, title, author, editor, summary, page_nb, library_id )" +  "VALUES  ( '7', 'PhP', 'Dan Brown', 'OReilly', 'If  for the architectures of application', '869','1');";
		
		 try {
			 
			Statement tmt = con.createStatement(); 
        	 
			 

             int resultat = tmt.executeUpdate(requete);             

			 
	           if (resultat>0)
			   {
	        	   System.out.println("Inserted book into the table..."); 
	        	 
			   }
	           con.close();
	           
	         
		       } catch (SQLException e) {
		    	   e.printStackTrace();
		       }   
		
		
		
	
	}

	
	
	public void afficherLibraries() throws SQLException {



		String requete = "SELECT * FROM library";
		

		try {
			Statement tmt = con.createStatement();
	        rs = tmt.executeQuery(requete);
	        System.out.println("---------Affichage de librarys ------ ");

		while(rs.next())
		{
		
		System.out.println(rs.getInt("id")+"\n" + rs.getString("lib_name")+"\n"+ rs.getString("addresse")+ "\n" + rs.getInt("numTel"));

		
		}
		rs.close();
		
		} catch (SQLException e) {
			 e.printStackTrace();
		}
		}
}