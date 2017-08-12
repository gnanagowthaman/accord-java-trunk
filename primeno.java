class Prime{
	public static void main(String ar[]){
		//int a=197;
		 int a;
            for (a = 2; a <= 200; a++)  
            {
                if (a > 1)
                {
                    if ((a % 2 != 0) && (a%3!=0) && (a%5!=0) && (a%7!=0) &&(a%11!=0)&& (a % a == 0) || (a==2) || (a == 3) || (a == 5) || (a == 7) || (a == 11))
                    {
                        System.out.println("prime no------------------------------------------------------------"+a);
                    }
                    
                }

                else
                {
                    System.out.println("its not a prime");
                }
            }
           
	}
}