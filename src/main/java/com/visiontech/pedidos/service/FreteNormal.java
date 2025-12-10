package com.visiontech.pedidos.service;
import com.visiontech.pedidos.model.Pedido;
public class FreteNormal implements FreteStrategy {
    @Override
    public double calcularFrete(Pedido pedido) { return pedido.getValor() * 0.1; }
}