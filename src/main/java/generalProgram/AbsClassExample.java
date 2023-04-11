package generalProgram;

public abstract class AbsClassExample {
int a,b;

    AbsClassExample(int a, int b){
this.a=a;
this.b=b;
    }
    public abstract void function();

    public void testfunctionabs(){
        System.out.println(a*b+" testfunctionabs");
    }
}
