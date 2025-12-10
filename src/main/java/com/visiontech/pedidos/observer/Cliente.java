package com.visiontech.pedidos.observer;
import com.visiontech.pedidos.model.Pedido;
public class Cliente implements PedidoStatusObserver {
    private String nome;
    public Cliente(String nome) { this.nome = nome; }
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Notificação para " + nome + ": Pedido " + pedido.getCodigo() + " mudou para " + pedido.getStatus());
    }
}