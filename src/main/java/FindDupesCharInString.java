public class FindDupesCharInString {


    public static void main(String[] args) {
        String inp = "aaaabbcccdddddaa";
        findDupes(inp);
    }

    public static void findDupes(String s){

        for(int i=0; i<s.length(); i++) {
            int cnt=1;
            while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                i++;
                cnt++;
            }
            System.out.print(cnt + "" + s.charAt(i));

        }
    }
}
