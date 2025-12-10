package com.visiontech.pedidos.model;

public class PedidoNormal extends Pedido {
    public PedidoNormal(String codigo, double valor) { super(codigo, valor); }
    @Override
    public void processarPedido() {
        System.out.println("Processando pedido NORMAL: " + codigo);
        setStatus("PROCESSADO");
    }
}