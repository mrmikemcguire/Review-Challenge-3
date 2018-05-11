
public class NumberReverser
	{
		static int originalNumber;
		public static void main(String[] args)
			{
			fourDigitTester();
			originalNumber = (int)(Math.random() * 9000) + 1000;
			digitReverser(originalNumber);
			}

		public static void fourDigitTester()
			{
			for(int i = 0; i < 10000; i++)
				{
				originalNumber = (int)(Math.random() * 9000) + 1000;
				if (originalNumber < 1000 || originalNumber > 9999)
					System.out.println("Oops!");
				}
			}
		
		public static void digitReverser(int n)
			{
			int [] myArray = new int [4];
			System.out.println("Your original number is " + n);
			for (int i = 0; i < 4; i++)
				{
				int lastDigit = n % 10;
				myArray[i] = lastDigit;
				n = n / 10;
				}
			System.out.print("Your reversed number is ");
			for (int fred : myArray)
				System.out.print(fred);
			}
	}
