package generalProgram;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(NumberToWords.convert(1));
    }

    public static String convert(int num){

        if(num<0){

            throw new RuntimeException("Invalid number");
        }
        if(num>9999){

           throw new RuntimeException("Invalid number");
        }
        if(num==0){

           return "zero";
        }

        String[] onesDigit = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine"};

        /* The first string is not used, it is to make
            array indexing simple */
        String[] tensDigit = new String[] {
               "ten","eleven","twelve","thirteen","fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};

        /* The first two string are not used, they are to
         * make array indexing simple*/
        String[] tensMultiple = new String[] {
                "","", "twenty","thirty", "forty",
                "fifty","sixty","seventy","eighty", "ninety"};

        String[] hunderds = new String[] { "hundreds" };
        String[] thousands = new String[] { "thousands" };

        String value="";

        while(num>0){ //4321
            if(num>1000){
               int thousandDigit=num/1000;//4
                num=num%1000;//4321
                value=onesDigit[thousandDigit]+" "+thousands[0];
            } else if (num>100) { //321
                int hundredDigit=num/100;//3
                num=num%100;//21
                value=value+" "+onesDigit[hundredDigit]+" "+hunderds[0];
            }
            else if(num>20){ //21
                int tenDigit=num/10; //2
                num=num%10;//1
                value=value+" "+tensMultiple[tenDigit];
            }
            else if(num>=10&&num<20){ //15
                int tenDigit=num%10; //5
                value=value+" "+tensDigit[tenDigit];
                break;
            }
            else if(num>0&&num<10){
                value=value+" "+onesDigit[num];
                num=num/10;
            }

        }

        return value;
    }
}
