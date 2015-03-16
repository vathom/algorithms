namespace Algorithms.SearchStringInFile
{
    using System;
    using System.IO;

    public sealed class Program
    {
        public static void Main(String[] args)
        {
            string searchStr = "hello";
            string f = @"D:\vt\learn\algorithms\code\data\testdata.txt";

            if (Search(searchStr, f))
            {
                Console.WriteLine("found");
            }
			else
			{
				Console.WriteLine("not found");
			}
        }

        public static bool Search(String str, string path)
        {
            if (string.IsNullOrEmpty(str))
            {
                throw new ArgumentNullException("Argument 'str' is null");
            }

            if (str == "")
            {
                return false;
            }
			
			if (!File.Exists(path))
            {
                return false;
            }
			
            int len = str.Length;
            bool first = true;
            Char[] searchChars = str.ToCharArray();
            Char[] charsFromFile = new Char[len];

            using (StreamReader reader = new StreamReader(path))
            {
                while (reader.Peek() > 0)
                {
                    if (!first)
                    {
                        Char[] c = new Char[1];
                        reader.Read(c, 0, 1);
                        charsFromFile = AppendAndRemove(c, charsFromFile);
                    }
                    else
                    {
                        first = false;
                        reader.Read(charsFromFile, 0, len);
                    }

                    if (Equals(searchChars, charsFromFile))
                    {
                        return true;
                    }
                }
            }

            return false;
        }

        public static Char[] AppendAndRemove(Char[] charToAdd, Char[] baseChars)
        {
            Char[] temp = new Char[baseChars.Length];
            for (int i = 1; i < baseChars.Length; i++)
            {
                temp[i - 1] = baseChars[i];
            }

            temp[baseChars.Length - 1] = charToAdd[0];

            return temp;
        }

        public static bool Equals(Char[] first, Char[] second)
        {
            if (first.Length != second.Length)
            {
                return false;
            }

            for (int i = 0; i < first.Length; i++)
            {
                if (first[i] != second[i])
                {
                    return false;
                }
            }

            return true;
        }
    }
}