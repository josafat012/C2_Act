package com.upchiapas.queue.models;

public class ItemCompra {
    private byte cantidad;
    private String producto;
    private float subtotal;

    public ItemCompra(byte cantidad, String producto, float subtotal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = subtotal;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "ItemCompra{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                ", subtotal=" + subtotal +
                '}';
    }
}
