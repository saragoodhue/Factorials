import java.util.Scanner;

public class factorial
	{
		static int sum;

		public static void main(String[] args)
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Enter an integer and I will calculate the factorial");
				int userChoice = userIntInput.nextInt();
				sum = userChoice;
				
				for(int i = 0; i <= userChoice; i++)
					{
						int nextNumber = userChoice - 1;
						sum = sum * nextNumber;
						userChoice = nextNumber;
						i++;
						
					}
				
				System.out.println(sum);
				
			}

	}
