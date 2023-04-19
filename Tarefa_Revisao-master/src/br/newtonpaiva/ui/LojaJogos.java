package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Cliente;
import br.newtonpaiva.dominio.Ingresso;
import br.newtonpaiva.dominio.Pedido;
import com.sun.security.ntlm.Client;

import javax.swing.*;

public class LojaJogos {
    public static void main(String[] args) {
        try{
            Cliente cliente = new Cliente();
            cliente.setNome(JOptionPane.showInputDialog(null, "Informe o nome do Cliente", "Nome do cliente", JOptionPane.QUESTION_MESSAGE));

            Ingresso ingresso = new Ingresso();

            int temp;
            temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o nome do jogo: \n1-Atlético x Cruzeiro\n2-Flamengo x Palmeiras", "Jogos", JOptionPane.QUESTION_MESSAGE));
            switch (temp){
                case 1:
                    ingresso.setNomeJogo("Atlético x Cruzeiro");
                    break;
                case 2:
                    ingresso.setNomeJogo("Flamengo x Palmeiras");
                    break;
                default:
                    throw new Exception();
            }

            ingresso.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Ingresso:", "Valor ingresso", JOptionPane.QUESTION_MESSAGE)));

            Pedido pedido = new Pedido();

            Double valorTotal;
            valorTotal = pedido.CalculaPedido(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ingressos desejados para esse jogo: ", "Quantidade", JOptionPane.QUESTION_MESSAGE)), ingresso);

            JOptionPane.showMessageDialog(null, "Pedido feito por " + cliente.getNome() + "\n" + pedido.ingressos.size() + " Ingressos: " + ingresso.getNomeJogo() + "\nValor: " + valorTotal, "Finalização do pedido", JOptionPane.INFORMATION_MESSAGE);

        }catch (Exception erro){
            System.out.println("Deu errado sô!");
        }
    }
}
