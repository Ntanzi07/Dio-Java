package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();

        lista.add("first");
        lista.add("second");
        lista.add("terceiro");

        System.out.println(lista.size());
        System.out.println(lista);
    }
}
