/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Hotel Terrasol Cencar
* @author Nicolas Penagos Montoya
* nicolas.penagosm98@gmail.com
* Java SE Development Kit 8 Update 121
**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

package model;

/**
 * This class represents the store as such, it is also in charge of connecting the model with the interface.
 */
public class Store {
	

	//-------------------------------------
	// Atributtes
	//-------------------------------------
	
	/**
	 * Represents the name given to the store.
	 */
	private String nameOfStore;
	
	/**
	 * Represents the username of the software's user.
	 */
	private String username;
	
	/**
	 * Represents the username of the software's user.
	 */
	private String password;
	
	/**
	 * Represents the current local time.
	 */
	private String currentTime;
	
	//-------------------------------------
	// Constructor
	//-------------------------------------
	
	public Store(String nameOfStore) {
		this.nameOfStore = nameOfStore;
	}
	
	//-------------------------------------
	// Getters and setters 
	//-------------------------------------
	
	public String getNameOfStore() {
		return nameOfStore;
	}

	public void setNameOfStore(String nameOfStore) {
		this.nameOfStore = nameOfStore;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	
	//-------------------------------------
	// Methods 
	//-------------------------------------
	
	
	
	

}
