using System;

namespace Unchecked
{
    class Program
    {
        static void Main(string[] args)
        {
            const int ConstantMax = int.MaxValue;
            int int1;
            int int2;
            int variableMax = 2147483647;

            unchecked
            {
                int1 = 2147483647 + 10;
            }
            int1 = unchecked(ConstantMax + 10);
            Console.WriteLine(int1);
            

            
            

            checked
            {
                int2 = variableMax + 10;
            }
            int2 = checked(variableMax + 10);
            Console.WriteLine(int2);
            Console.ReadLine();
        }
    }
}