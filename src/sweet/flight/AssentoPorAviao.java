/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sweet.flight;

/**
 *
 * @author dicelia
 */
public class AssentoPorAviao {
    int numDoAviao;
    int quantAssento;
    boolean verifCodigo;
    
    public AssentoPorAviao(int numDoAviao) {
        this.numDoAviao = numDoAviao + 100;
        this.quantAssento = 5;
        this.verifCodigo = false;
    }


    public boolean isVerifCodigo() {
        return verifCodigo;
    }

    public void setVerifCodigo(boolean verifCodigo) {
        this.verifCodigo = verifCodigo;
    }

    public int getNumDoAviao() {
        return numDoAviao;
    }

    public void setNumDoAviao(int numDoAviao) {
        this.numDoAviao = numDoAviao;
    }

    public int getQuantAssento() {
        return quantAssento;
    }

    public void setQuantAssento(int quantAssento) {
        this.quantAssento = quantAssento;
    }
    
}
