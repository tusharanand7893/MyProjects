package generalProgram;

public class DoubleTriangle {

    public static void main(String[] args) {
        printDoubleTriangle(5);
    }

    public static void printDoubleTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(' ');
            }
            for(int l=1;l<=i;l++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
