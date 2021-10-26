import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CreditCardValidation
	{
		static int counter = 0;
		static int counter2 = 0;
		static boolean alternate = false;
		public static void main(String[] args) throws IOException
			{
				checkValid();
			}
		
		public static void checkValid() throws IOException
			{
					Scanner myFile = new Scanner(new File("RealCardNums.txt"));
					
					
					while(myFile.hasNext())
							{
								String card = myFile.nextLine();
								//create array
								int[] nums = new int[card.length()];
								
							//fill array	
							for (int i = 0; i < card.length(); i++)
							    	{
							    		nums[i] = Integer.parseInt(card.substring(i, i + 1));//go through each individual int
							    	}
							    
							    for (int i = nums.length - 2; i >= 0; i = i -2)
							    	{
							    		//start at 2nd from farthest right, then move by two back through
							    			int newNum = nums[i];
							    			//value times next value
							    			newNum = newNum * 2;
							        
							        	//check if double digits when added together
							    			if (newNum > 9) 
							        		{
							        			newNum = newNum % 10 + 1;
							        		}
							        	//replace old int with new int
							        nums[i] = newNum;
							    	}
							    
							  int totalSum = 0;
							    //add all the values up
							    for (int i = 0; i < nums.length; i++) 
							    	{
							    		totalSum += nums[i];
							    	}
							    
							    if (totalSum % 10 == 0)
							    	{
							    		counter++;	
							        System.out.println(card + " is valid");
							    	} 
							   else
							    	{
							    		System.out.println(card + " is invalid");
							    	}
							
							}
				System.out.println("\n" + counter + " cards given are valid.");
					
					
					
			}

	}
