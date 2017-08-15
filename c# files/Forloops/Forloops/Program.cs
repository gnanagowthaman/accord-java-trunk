using System;

namespace Forloops
{
    class Program
    {
        static void Main(string[] args)
        {
            int i;
            int j = 10;
            for (i = 0, Console.WriteLine("Start: {0}", i); i < j; i++, j--, Console.WriteLine("i={0},j={1}", i, j))
            {
               

            }
            Console.ReadLine();
        }
    }
}