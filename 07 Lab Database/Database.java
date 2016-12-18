	
	/* Include Name Here as well.
	 * 
	 * This class will be used to create a database object 
	 * from the main class.
	 * 
	 * */

public class Database {

	/*create a private instance variable (OR FIELD) here named records.
	 *This will be initialized to the arguments passed into your class constructor */
  private int[] records;
  
	public Database(int[] data){
		
		/*initialize your field to data here*/
		this.records = data;
		
	}
	
	
	public boolean isValid(int num){
		boolean valid = false;
		/*Implement this method so that it will return true if num is a valid account number 
		 *in this instance's records. Otherwise it will return false */
		for (int x : records) {
			if (x == num) {
				valid = true;
			}
		}
		
		return valid;
	}
	
	
}
