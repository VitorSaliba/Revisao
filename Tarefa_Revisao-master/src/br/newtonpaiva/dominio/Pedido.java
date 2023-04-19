package br.newtonpaiva.dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    public List<Ingresso> ingressos = new ArrayList<Ingresso>();

    private Double valorTotal = 0d;

    public Double CalculaPedido(int quantidade, Ingresso ingresso){
        for (int i=0; i<quantidade; i++){
            ingressos.add(ingresso);
        }
        for (Ingresso temp : ingressos) {
            valorTotal += temp.getValor();
        }

        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
