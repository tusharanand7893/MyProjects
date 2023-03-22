package DSA;

public class ReversStringWithRecurscion {
    public static void main(String[] args) {
        System.out.println(ReversStringWithRecurscion.reverseString("987654321"));
    }

    public static String reverseString(String str){

        if(str==null){
            throw new RuntimeException("String cannot be null");
        }

        if(str.length()-1==0){
            return String.valueOf(str.charAt(0));
        }

       return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    }
}
