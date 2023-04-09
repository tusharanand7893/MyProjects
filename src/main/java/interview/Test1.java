package interview;

public class Test1 {

    public static void main(String[] args) {
String str="Hello World";
        System.out.println( reverseStringM(str));
        System.out.println("Count of char "+countChar('l',str));
    }

    public static String reverseStringM(String str){
    String s="";
    String[] arr= str.split(" ");
    for(String st:arr){
        s=s+" "+reverse(st);
    }
return s;
    }

    public static String reverse(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        return s;
    }

    public static int countChar(char a, String s){
        int count=0;
        char[] array=s.toCharArray();
        for(int i=0; i<array.length;i++){
            if(array[i]==a){
                count++;
            }
        }
        return count;
    }





}
