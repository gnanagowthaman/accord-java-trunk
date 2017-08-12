class Av{
	public static void main(String ar[]){
		int a=12;
		int r=0;
		int t=0;
		int d=5;
		int b=1;
		int cor=0;
		while(b<=d)
		{
			r=a*b;
			t=t+r;
			b++;
		}	 
		cor=(t/d);
		System.out.println(cor);
	}
}