package ListaEncadeada;

import java.security.PublicKey;

public class ListaEncadeada<T> {
    
    private No<T> refNoEntrada;

    public ListaEncadeada (){
        refNoEntrada = null;
    }

    public ListaEncadeada (No<T> noEntrada){
        refNoEntrada = noEntrada;
    }

    public void add(T obj){
        No<T> newNo = new No<T>(obj);
        
        if(!this.isEmpty()){
            No<T> noAuxiliar = refNoEntrada;
            while (noAuxiliar.getProximoNo() != null) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(newNo);
        }else{
            refNoEntrada = newNo;
        }
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

    @Override
    public String toString() {
        String str = 
            "--------------------------\n"
            + "     ListaEncadeada\n"
            + "--------------------------\n";
        str += refNoEntrada.toStringEncadeado();
        return str;
    }
}
