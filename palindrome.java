class Pal{
	public static void main(String ar[]){
		int a = 0;
		int b = 27;
		int dum=27;
		int s = 0;
		int c = 0; 
		while (a < b)
		{
			c = b % 10;
			s = (s*10 + c);
			b = b / 10;
			
		}
		if(dum==s)
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}
}