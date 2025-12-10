package com.visiontech.pedidos.model;

public class PedidoExpress extends Pedido {
    public PedidoExpress(String codigo, double valor) { super(codigo, valor); }
    @Override
    public void processarPedido() {
        System.out.println("Processando pedido EXPRESS: " + codigo);
        setStatus("PROCESSADO EXPRESS");
    }
}