class Su{
	public static void main(String ar[]){
		int a=0;
		int b=84001;
		int c=0;
		int t=0;
		while(a<b)
		{
		    c=b%10;
			t=(t+c);
			b=b/10; 
		}
		System.out.println(t);
	}
}