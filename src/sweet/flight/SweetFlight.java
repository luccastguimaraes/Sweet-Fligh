/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sweet.flight;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dicelia
 */
public class SweetFlight {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<AssentoPorAviao> assentos = new ArrayList();
        ArrayList<Reserva> reservas = new ArrayList();
        
        String nome;
        int codigo = -1;
        boolean test = false;
        int posicao = -1;
        int k = 0;
        int opcao = 0;
        
        
        for (int i = 0; i < 4; i++){
          AssentoPorAviao a = new AssentoPorAviao(i);
          assentos.add(a);
        }
        
        
        do {
            System.out.println("Menu");
            System.out.println("Opção 1: Registrar o número de cada avião;");
            System.out.println("Opção 2: Registrar o quantitativo de assentos disponíveis em cada avião;");
            System.out.println("Opção 3: Reservar passagem aérea;");
            System.out.println("Opção 4: Realizar consulta por avião;");
            System.out.println("Opção 5: Realizar consulta por passageiro;");
            System.out.println("Opção 6: Encerrar;");
            System.out.println("Digite uma Opção:");
            opcao = scanner.nextInt();
            
            if (opcao == 1){
                for (int i = 0; i < 4; i++){
                    System.out.println("O numero do " + (i+1) + "Aviao é: " + assentos.get(i).getNumDoAviao());
                }
            } else if (opcao == 2) {
                for (int i = 0; i < 4; i++){
                    System.out.println("A quantidade de assentos disponivel para o Aviao " + assentos.get(i).getNumDoAviao() + " e: " + assentos.get(i).getQuantAssento());
                }
            } else if (opcao == 3){
                System.out.println("Informe o numero do Aviao desejado: ");
                codigo = scanner.nextInt();
                for (int i = 0; i <= assentos.size(); i++){
                    if (assentos.get(i).getNumDoAviao() == codigo){
                        assentos.get(i).setVerifCodigo(true);
                        test = assentos.get(i).isVerifCodigo();
                        posicao = i;
                        break;
                    } else {
                       test = assentos.get(i).isVerifCodigo();
                       posicao = -1;
                    }  
                }
                
                if (test != true){
                    System.out.println("Este aviao nao existe!");
                } else {
                    if(assentos.get(posicao).getQuantAssento() <= 0) {
                    System.out.println("Nao ha assentos disponiveis para este aviao.");
                    } else {
                    System.out.println("Informe o nome do Passageiro: ");
                    nome = scanner.next();
                    Reserva r = new Reserva(codigo, nome);
                    reservas.add(r);
                    assentos.get(posicao).setQuantAssento(assentos.get(posicao).getQuantAssento() - 1);
                    System.out.println("Reserva realizada com Sucesso!");
                    
                    
                    }   
                }
            } else if (opcao == 4) {
                System.out.println("Informe o numero do aviao: ");
                codigo = scanner.nextInt();
                for (int i = 0; i <= assentos.size(); i++){
                    if (assentos.get(i).getNumDoAviao() == codigo){
                        assentos.get(i).setVerifCodigo(true);
                        test = assentos.get(i).isVerifCodigo();
                        posicao = i;
                        break;
                    } else {
                       test = assentos.get(i).isVerifCodigo();
                       posicao = -1;
                    }  
                }
                if (test == false) {
                    System.out.println("Esse aviao nao existe!");
                } else {
                    if (posicao == 5){
                        System.out.println("Nao ha reservas para este aviao");
                    } else {
                        System.out.println("Reservas para o aviao: " + assentos.get(posicao).getNumDoAviao());
                        for (int i = 0; i < reservas.size() ; i++){
                            if(assentos.get(posicao).getNumDoAviao() == reservas.get(i).getNumAviao()){
                                System.out.println("Aviao: " + assentos.get(posicao).getNumDoAviao());
                                System.out.println("Passageiro: " + reservas.get(i).getNomePassageiro());
                            }
                        }
                    }
                }
            } else if (opcao == 5){
                System.out.println("Informe o nome do passageiro: ");
                nome = scanner.next();
                for (int i = 0; i < reservas.size(); i++){
                    if (reservas.get(i).getNomePassageiro().equals(nome)){
                        test = true;
                        break;
                    } else {
                        test = false;
                    }
                }
                
                if (test == false) {
                    System.out.println("Nao ha reservas para este passageiro!");
                } else {
                    System.out.println("Todas as Reservas feitas pelo passageiro: " + nome);
                    for (int i = 0; i < reservas.size(); i++){
                        if (reservas.get(i).getNomePassageiro().equals(nome)){
                            System.out.println("Reserva feita no Aviao: " + reservas.get(i).getNumAviao());
                        }
                    }
                }
                
            } else {
                System.out.println("Opcao Invalida!");
            }
        }
            while (opcao != 6);
        
                
    }
}

