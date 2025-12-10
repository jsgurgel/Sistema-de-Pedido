package com.visiontech.pedidos.factory;

import com.visiontech.pedidos.model.Pedido;
import com.visiontech.pedidos.model.PedidoNormal;
import com.visiontech.pedidos.model.PedidoExpress;

public class PedidoFactory {
    public static Pedido criarPedido(String tipo, String codigo, double valor) {
        return switch (tipo.toUpperCase()) {
            case "NORMAL" -> new PedidoNormal(codigo, valor);
            case "EXPRESS" -> new PedidoExpress(codigo, valor);
            default -> throw new IllegalArgumentException("Tipo de pedido inválido");
        };
    }
}