package comeco;

public class App {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        
        System.out.println("int A = " + intA + "; int B = " + intB);
        
        intA = 2; 
        System.out.println("int A = " + intA + "; int B = " + intB);
        
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        
        System.out.println("obj A = " + objA + "; obj B = " + objB);

        objA.setNum(2);
        System.out.println("obj A = " + objA + "; obj B = " + objB);
    }
}
