/* 
* File    : MainDAO.java 31/05/2023
* Penulis : Ririn Indah Cahyani - 24060121130069
* Lab     : PBO B1
* Deskripsi : Main program untuk akses DAO
*/

public class MainDAO {
    public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
