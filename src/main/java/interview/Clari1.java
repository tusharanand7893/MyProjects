package interview;

import java.util.Stack;

public class Clari1 {

    public static void main(String[] args) {
        String s2="( a ( b sd ) sd )"; //") asd. ( sd )"
        String s1=") asd. ( sd )";

       String[] testdata={"( a ( b sd ) sd )",") asd. ( sd )","(ab(((cd))","(((((","(a)(b)(c)(d)","A ( b )","aaaa"};
        int testcase=1;
        for(String s:testdata) {
            System.out.println("Test Case No "+testcase+++"--"+checkBalanceString(s));
        }
       // System.out.println(checkBalanceString("(())"));
    }

    public static boolean checkBalanceString(String s){
        Stack<Character> stack= new Stack<>();
        boolean flag= true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    stack.push(s.charAt(i));
                }
                else if (s.charAt(i)!='(' && s.charAt(i)!=')') {
                  //  System.out.println("Do nothing /Ignoring alphabets/spaces/specialChars");
                }
                else{
                    if(stack.empty()){
                        flag=false;
                        break;
                    }
                    if(s.charAt(i)==')' && stack.peek()=='('){
                        flag=true;
                        stack.pop();
                    }
                }
            }

        if(stack.size()!=0){
            flag=false;
        }
        return flag;
    }
}
