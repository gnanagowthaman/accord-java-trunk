class Amstrong{
	public static void main(String ar[]){
		int b = 0;
		int t=152;
		int s = 152;
		int value = 0; 
		int result = 0;
		while (b < s)
		{
			value = s % 10;
			result = result+(value * value * value);
			s = s / 10;
		}
		System.out.println(result);
		if (result==t)
		{
			System.out.println("Amstrong no");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
		//Console.ReadLine();
	}
}