class Sam{
	Sam(){
		System.out.println("Sample Constructor");
	}
	void display(){
		System.out.println("My Test output");
		}
}
class Test{
	public static void main(String ar[])
	{
		Sam s=new Sam();
		s.display();
		}
}