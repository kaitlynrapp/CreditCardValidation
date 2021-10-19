import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CreditCardValidation
	{

		public static void main(String[] args) throws IOException
			{
				fillArray();
			}
		
		public static void fillArray()
			{
					static Scanner myFile = new Scanner(new File("CardNums.Text"));
					int counter = 0;
					while(myFile.hasNext())
							{
								String card = myFile.nextLine();	
							}
			}

	}
