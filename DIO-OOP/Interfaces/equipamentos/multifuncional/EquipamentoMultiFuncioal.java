package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncioal implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando!");
        
    }
    @Override
    public void digitalizar(){
        System.out.println("Digitalizando!");
    }
    @Override
    public void imprimir(){
        System.out.println("imprimindo!");
    }

}