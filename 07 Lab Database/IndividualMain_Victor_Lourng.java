import java.util.Scanner;

/*
	Include Name Here
	
	**ALSO MAKE SURE TO CHANGE THE CLASS NAME**
	
	This class will create an instance of the Database class.
	It will also check to see if the account number that you input is valid.
	Do this by replacing comments with your own code. 
*/

public class IndividualMain_Victor_Lourng {

	public static void main (String Args[]){
		
		int[] data = {5658845,4250125,7895122,8777541,
                8451277,1302850,8080152,4562555,
            5552012,5050552,7825877,1250255,
            1005231,6545231,3852085,7576651,
            7881200,4581002};


		/*Create an instance of your Database class here with data passed to its constructor*/
		Database db = new Database(data);
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your account number:");
		
		int account = kb.nextInt(); 
		/*Use your isValid class method on your instance of database created above
		 *in order to print out whether the user has entered a valid account number*/
		boolean valid = db.isValid(account);
		if (valid == true) {
			System.out.println("The account entered is valid.");
		} else {
			System.out.println("The account entered is not valid.");
		}
	}
	
	
}
