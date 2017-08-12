class Fib{
	public static void main(String ar[])
	{
		int a=0;
		int b=1;
		int t=0;
		int r=0; 
		System.out.println("0");
		for(;t<12;){
			r=a+b;
			b=a; 
			a=r;
			t++;
			System.out.println(r);
		}
		
	}
}