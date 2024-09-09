public class ExemploFor {
    public static void main(String[] args) {
        //for
        for( int i = 1; i <= 5; i++ ){
            System.out.println(i);
        }
        
        //for em Arrays
        String nomes[] = {"Nathan", "Enrico", "Marco", "Guilherme", "Rafa", "Lyniker"};
        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
