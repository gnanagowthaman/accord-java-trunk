using System;

namespace AsOperator
{
   
   public class Class1:IFormatProvider
    {
        public object GetFormat(Type t)
        {
            if(t.Equals(this.GetType()))
            {
                return this;

            }
            return null;
        }
    }
    public class Class2 : Class1
    {
        public int Value
        {
            get;
            set;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            var cl1 = new Class1();
            Console.WriteLine(cl1 is IFormatProvider);
            Console.WriteLine(cl1 is object);
            Console.WriteLine(cl1 is Class1);
            Console.WriteLine(cl1 is Class2);
            Console.WriteLine();

            var cl2 = new Class2();
            Console.WriteLine(cl2 is IFormatProvider);
            Console.WriteLine(cl2 is Class1);
            Console.WriteLine(cl2 is Class2);

            Class1 cl = cl2;
            Console.WriteLine(cl is Class1);
            Console.WriteLine(cl is Class2);

            Console.ReadLine();
        }
    }
    
}