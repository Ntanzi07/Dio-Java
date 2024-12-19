package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();

        lista.add("numero 1");
        lista.add("numero 2");
        lista.add("numero 3");
        lista.add("numero 4");

        System.out.println("Tamanho da lista" + lista.size());
        System.out.println(lista);
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
        System.out.println("foi removido o " + lista.remove(1));
        System.out.println(lista);
    }
}
