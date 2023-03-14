public class RomanToInteger {

    // Program to convert Roman
// Numerals to Numbers

        int value(char r)
        {
            if (r == 'I')
                return 1;
            if (r == 'V')
                return 5;
            if (r == 'X')
                return 10;
            if (r == 'L')
                return 50;
            if (r == 'C')
                return 100;
            if (r == 'D')
                return 500;
            if (r == 'M')
                return 1000;
            return -1;
        }

        // Finds decimal value of a
        // given roman numeral
        int romanToDecimal(String str)
        {
            // Initialize result
            int res = 0;

            for (int i = 0; i < str.length(); i++) {
                System.out.println("loop number="+i);
                // Getting value of symbol s[i]
                int s1 = value(str.charAt(i));
                System.out.println("printing s1="+s1);

                // Getting value of symbol s[i+1]
                if (i + 1 < str.length()) {
                    int s2 = value(str.charAt(i + 1));
                    System.out.println("printing s2="+s2);
                    // Comparing both values
                    if (s1 >= s2) {
                        // Value of current symbol
                        // is greater or equalto
                        // the next symbol
                        res = res + s1;
                        System.out.println("printing if res="+res);
                    }
                    else {
                        // Value of current symbol is
                        // less than the next symbol
                        res = res + s2 - s1;
                        System.out.println("printing else res="+res);
                        i++;
                    }
                }
                else {
                    res = res + s1;
                }
            }

            return res;
        }

        // Driver Code
        public static void main(String args[])
        {
            RomanToInteger ob = new RomanToInteger();

            // Considering inputs given are valid
            String str = "Z";
            System.out.println("Integer form of Roman Numeral"
                    + " is "
                    + ob.romanToDecimal(str));
        }


}
