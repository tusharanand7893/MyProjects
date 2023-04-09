package generalProgram;

public class ReadingEnum {

    public static void main(String[] args) {
       RequestType t= RequestType.REQUEST_1;
        System.out.println(t.getRequest()+t.getType());
    }
}
