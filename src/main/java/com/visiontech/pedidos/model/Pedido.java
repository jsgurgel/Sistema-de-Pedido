package com.visiontech.pedidos.model;

import com.visiontech.pedidos.observer.PedidoStatusObserver;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    protected String codigo;
    protected double valor;
    protected String status;
    protected List<PedidoStatusObserver> observers = new ArrayList<>();

    public Pedido(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
        this.status = "CRIADO";
    }

    public String getCodigo() { return codigo; }
    public double getValor() { return valor; }
    public String getStatus() { return status; }

    public void addObserver(PedidoStatusObserver observer) { observers.add(observer); }
    public void setStatus(String status) { this.status = status; notifyObservers(); }

    private void notifyObservers() {
        for (PedidoStatusObserver observer : observers) observer.atualizar(this);
    }

    public abstract void processarPedido();
}