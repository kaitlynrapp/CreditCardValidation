import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

public class creditCard2	{
		static int counter = 0;
		static int validCounter = 0;
		public static void main(String[] args) throws IOException
			{
				checkValid();
			}
		
		public static void checkValid() throws IOException
			{
					
					
					while (counter < 100)
						{
							int [] cardNums = new int [16];
									//double [] cardNums = new double [16];
									//Random randomNums = new Random();
							for (int i = 0; i < cardNums.length; i++)
								{
									int randomNums = (int)(Math.random() * 9) + 1;
									cardNums[i] = randomNums;
									System.out.println(cardNums);
								}
							Scanner eachCard = new Scanner(System.in);
							String card = eachCard.nextLine();
							counter++;
							
							System.out.println(card);
							
							int[] nums = new int[card.length()];
							
											//int[] nums = new int[16];
								
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
							    	validCounter++;	
							        System.out.println(card + " is valid");
							    	} 
							   else
							    	{
							    		System.out.println(card + " is invalid");
							    	}
							
							}
				System.out.println("\n" + validCounter + " cards are valid.");
				System.out.println("It took " + counter + " tries.");
					
					
					
			}

	}

