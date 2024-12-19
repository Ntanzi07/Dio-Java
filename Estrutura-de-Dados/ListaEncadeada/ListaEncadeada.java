package ListaEncadeada;

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

    public No<T> getNo(int index){
        No<T> refAuxiliar = refNoEntrada;
        No<T> noRetorno = null;

        this.validaIndex(index);
        
        for(int i = 0; i <= this.size() - 1; i++){
            if(i == index){
                noRetorno = refAuxiliar;
                break;
            }
            refAuxiliar = refAuxiliar.getProximoNo();
        }
        return noRetorno;
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
            + "      ListaEncadeada\n"
            + "--------------------------\n";
        str += refNoEntrada.toStringEncadeado();
        return str;
    }

    private void validaIndex(int index){
        int tam = this.size() - 1;
        if(index > tam)
            throw new IndexOutOfBoundsException("Não existe conteuo no indece " + "desta lista. O tamanho atual e de " + tam + '.');
    }
}
