package com.visiontech.pedidos.builder;
import com.visiontech.pedidos.model.Pedido;
import com.visiontech.pedidos.model.PedidoNormal;

public class PedidoBuilder {
    private String codigo;
    private double valor;
    public PedidoBuilder setCodigo(String codigo) { this.codigo = codigo; return this; }
    public PedidoBuilder setValor(double valor) { this.valor = valor; return this; }
    public Pedido build() { return new PedidoNormal(codigo, valor); }
}