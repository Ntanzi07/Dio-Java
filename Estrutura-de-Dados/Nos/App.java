package Nos;

public class App {
    public static void main(String[] args) {
        No no1 = new No("Conteudo nó 1");
        No no2 = new No("Conteudo nó 2");
        
        no1.setProximNo(no2);

        No no3 = new No("conteudo nó 3");
        
        no2.setProximNo(no3);
        
        No no4 = new No("conteudo nó 4");

        no3.setProximNo(no4);

        //no1 -> no2 -> no3 -> no4

        System.out.println(no1);
        System.out.println(no1.getProximNo());
        System.out.println(no1.getProximNo().getProximNo());
        System.out.println(no1.getProximNo().getProximNo().getProximNo());

    }
}
