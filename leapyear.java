class Leap{
	public static void main(String ar[]){
		int a=1700;
		if(a%400==0)
		{
			System.out.println("Leap year="+a); 
		}
		else if(a%100==0)
		{
			System.out.println("Not leap year");
		}	
		else if(a%4==0)
		{
			System.out.println("Leap year="+a);
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}