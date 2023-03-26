package DSA;

import java.util.Stack;

public class StackMinimum {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<Integer>();
        s.push(11);s.push(5);s.push(6);s.push(3);s.push(9);s.push(7);
        System.out.println("stack original "+s);
        System.out.println("minumum value= "+findMinimumValueInStack(s));
        System.out.println("stack after finding "+s);

    }

    public static int findMinimumValueInStack(Stack<Integer> s){
        Stack<Integer> tempS= new Stack<Integer>();
        int minimumValue=s.peek();
        while(!s.empty()){
            if(s.peek()<minimumValue){
                minimumValue= s.peek();
            }
            tempS.push(s.pop());
        }
        while(!tempS.empty()){
            s.push(tempS.pop());
        }
        return minimumValue;
    }
}
