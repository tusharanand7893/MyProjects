package generalProgram;

public class Sample {
    public static void main(String[] args) {
        String str="aaaabbbbbcdddaa";
        String str1="132434assdsafASSDD@";
       // System.out.println(findOccurence(str));
        System.out.println(regularExp(str1));

    }

    public static String findOccurence(String str){
        String expected="";
        for(int i=1;i<str.length();i++){
            int count=1;
            System.out.println("loop");
            while (i<str.length() && str.charAt(i-1)==str.charAt(i)){
                count++;
                i++;
            }
            expected=expected+count+str.charAt(i-1);
        }
        return expected;
    }

    public static String regularExp(String str){
        return str.replaceAll("[^a-zA-Z0-9]","");

    }
}
