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
    
    public T get(int index){
        return getNo(index).getConteudo();
    }
    
    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if(index == 0)
            refNoEntrada = refNoEntrada.getProximoNo();
        else
            this.getNo(index - 1).setProximoNo(noPivo.getProximoNo());

        return noPivo.getConteudo();
    }
    
    private void validaIndex(int index){
        int tam = this.size() - 1;
        if(index > tam)
        throw new IndexOutOfBoundsException("Não existe conteudo no indece " + "desta lista. O tamanho atual e de " + tam + '.');
    }
    
    private No<T> getNo(int index){
        this.validaIndex(index);
        No<T> refAuxiliar = refNoEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = refAuxiliar;
            refAuxiliar = refAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    @Override
    public String toString() {
        String str = refNoEntrada.toStringEncadeado();
        return str;
    }
}
