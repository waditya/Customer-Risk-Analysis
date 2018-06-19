package insurance_credit_score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserInput {
	String id;

	public String getSearchKey() {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		Boolean flag= false;
		int intId;
		while(!flag) {
			System.out.println("Enter the Id of Customer you want to search : ");
			try {
				s= in.readLine();
				try{
					double d= Double.valueOf(s);
					intId = (int) d;
					if (d==intId && intId !=0){
						this.id = Integer.toString(intId);
						System.out.println("The Input is : "+this.id);
						flag = true;
					}
				}catch(Exception e){
					System.out.println("Please enter a valid Non Zero positive Number : ");
					flag= false;
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// Because some of the IDs are not present in the file and they throw null reference exception

		}
		return this.id;
	}

}
