/* 
* File    : DAOManager.java 31/05/2023
* Penulis : Ririn Indah Cahyani - 24060121130069
* Lab     : PBO B1
* Deskripsi : Pengelola DAO dalam program
*/

public class DAOManager {
    private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}
