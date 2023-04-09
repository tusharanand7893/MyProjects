package DSA;

import java.util.Stack;

public class StackBalanceString {
    public static void main(String[] args) {

       // String str="([{()}])"; //- true
       // String str="[({(})]"; //-false
//String str="{[}"; //- false
//String str="({}{}([{}]))"; //- true
//String str="({"; //- false
//String str="{{}{}{}{}{a}(a)(a)()()[][][][]}"; //-true
      System.out.println(StackBalanceString.checkIfStringIsBalance(""));
    }


    public static boolean checkIfStringIsBalance(String str){
        Stack<Character> stringStack= new Stack<>();
        boolean balanceStringFlag= true;
        for(char c:str.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stringStack.push(c);
            }
            else if (c!='}'&& c!=']'&& c!=')') {
                System.out.println("ignoring alphabets");
            }
            else{
                if(stringStack.empty()){
                    balanceStringFlag= false;
                    break;
                }
                char lastCharInStack=stringStack.pop();
                 if (lastCharInStack=='{' && c!='}') {
                     balanceStringFlag= false;
                }
                if (lastCharInStack=='(' && c!=')') {
                    balanceStringFlag= false;
                }
                if (lastCharInStack=='[' && c!=']') {
                    balanceStringFlag= false;
                }
            }
        }
        if(stringStack.size()!=0){balanceStringFlag=false;}
        return balanceStringFlag;
    }



}
