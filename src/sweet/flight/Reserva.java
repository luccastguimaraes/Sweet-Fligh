/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sweet.flight;

/**
 *
 * @author dicelia
 */
public class Reserva {
    public int numAviao;
    public String nomePassageiro;

    public Reserva(int numAviao, String nomePassageiro) {
        this.numAviao = numAviao;
        this.nomePassageiro = nomePassageiro;
    }

    public int getNumAviao() {
        return numAviao;
    }

    public void setNumAviao(int numAviao) {
        this.numAviao = numAviao;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
    
    public void estadoAtual(){
        System.out.println("----------------");
        System.out.println("Nome do Passageiro: " + this.getNomePassageiro());
        System.out.println("Numero do Aviao: " + this.getNumAviao());
    }

    
}
