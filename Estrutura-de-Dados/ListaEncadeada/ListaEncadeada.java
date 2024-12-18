package ListaEncadeada;

public class ListaEncadeada<T> {
    
    private No<T> refNoEntrada;

    public ListaEncadeada (){
        refNoEntrada = null;
    }

    public ListaEncadeada (No<T> noEntrada){
        refNoEntrada = noEntrada;
    }

    public int size(){
        No<T> refComplementar = refNoEntrada;
        int tamanhoDaLista = 0;

        if(!this.isEmpty()){
            while (refComplementar.getProximoNo() != null) {
                tamanhoDaLista++;
                refComplementar = refComplementar.getProximoNo();
            }
            tamanhoDaLista++;
            return tamanhoDaLista;
        }
        return 0;
    }

    public boolean isEmpty(){
        return refNoEntrada == null ? true : false;
    }
}
