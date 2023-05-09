package interview;

public class SapientAI {

    public static void main(String[] args) {
        String s ="555";
        String s1="555";
        System.out.println(returnSum(s,s1));


    }

    public static String returnSum(String s, String s1){
        String sol="";
        String answer="";
        if(s.length()>=s1.length()) {
            int carryover=0;
            for (int i =s1.length()-1; i>=0;i--){
                int n1=Integer.valueOf(String.valueOf(s.charAt(i)));
                int n2=Integer.valueOf(String.valueOf(s1.charAt(i)));
                int number=n1+n2+carryover;
                if(number>=10){
                     number=number%10;
                    carryover=1;
                }
                else{
                    carryover=0;
                }
              sol=sol+String.valueOf(number);
            }
            if(carryover!=0){
                sol=sol+"1";
            }

            for (int i=sol.length()-1;i>=0;i--){
                answer=answer+sol.charAt(i);
            }




        }
        else if(s1.length()>s.length()) {
            int carryover=0;
            for (int i =s.length()-1; i>=0;i--){
                int n1=Integer.valueOf(s.charAt(i));
                int n2=Integer.valueOf(s1.charAt(i));
                int number=n1+n2+carryover;
                if(number>=10){
                    number=number%10;
                    carryover=1;
                }
                else{
                    carryover=0;
                }

                sol=sol+String.valueOf(number);

            }
        }
        return answer;
    }
}
