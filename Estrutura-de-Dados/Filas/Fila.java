package Filas;

public class Fila {
    
    private No refNoentradaFila;

    public Fila(){
        this.refNoentradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoentradaFila);
        refNoentradaFila = novoNo;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoentradaFila;
            while (primeiroNo.getRefNo() != null) {
                primeiroNo = primeiroNo.getRefNo();
            }
            return primeiroNo;
        }
        return null;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoentradaFila;
            No noAuxiliar = refNoentradaFila;
            while (primeiroNo.getRefNo() != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            noAuxiliar.setRefNo(null);
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoentradaFila == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno =
             "--------------------\n"
            +"        Fila\n"
            +"--------------------\n";
        
        if (!this.isEmpty()) {
            No noAuxiliar = refNoentradaFila;
            stringRetorno += noAuxiliar;
            while (true){
                stringRetorno += noAuxiliar;
                stringRetorno += "---->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno += "null";
        }

        return stringRetorno;
    }
}