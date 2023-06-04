/* 
* File    : MySQLPersonDAO.java 31/05/2023
* Penulis : Ririn Indah Cahyani - 24060121130069
* Lab     : PBO B1
* Deskripsi : implementasi PersonDAO untuk MySQL
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
		String name = person.getName();
		//membuat koneksi, nama db, user, password menyesuaikan
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo","root","Piring123@");
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
		//tutup koneksi database
		con.close();
	}
}
