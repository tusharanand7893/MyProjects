package DSA;

public class AB extends ClassAB{


    AB(){
        System.out.println("Con");
    }

    AB(String name){
        System.out.println("Con");
    }
    public static void main(String[] args) {
        AB ab= new AB();
        ab.f1();
    }
}
