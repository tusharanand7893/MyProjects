package DSA;

public class IntergerToRoman {

    public static void main(String[] args) {
        int num=1211;

    }

    public static String convertIntegerToRoman(int num){
        String str=null;
        if(num>1000){
           int remainder=num%1000;
            int devidend=num/1000;
            for(int i=0;i<devidend;i++){
                str="M";
            }
        }
        if(true){}
        return str;
    }
}
