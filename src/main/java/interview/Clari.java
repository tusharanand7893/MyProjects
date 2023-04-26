package interview;

public class Clari {

    public static void main(String[] args) {
        String s="apple madam kiwi pop";
        String[] a=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
        System.out.println(words(a[i]));
        }

      /*  palindrome
                iwik
        palindrome
                elppa*/

    }

    public static String words(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }

        if(r.equalsIgnoreCase(s)){
            return "palindrome";
        }
        return r;
    }


}
