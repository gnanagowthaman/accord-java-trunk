class Ci{
	public static void main(String ar[])
	{
		float p=2500f;
		float r=4/100f;
		float amount=0;		
		float c=0;
		int ci=0; 
		amount=p*(1+r)*(1+r);
		c=amount-p;
		ci=(int)c;
		System.out.println(ci);
	}
}