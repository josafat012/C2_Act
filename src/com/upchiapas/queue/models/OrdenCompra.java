package com.upchiapas.queue.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OrdenCompra{
    private byte id;
    private int a = 0;
    private float total;
    private ArrayList preciosASumar = new ArrayList();
    private float precioFinal = 0;
    private ArrayList ticket = new ArrayList<>();
    private LinkedList productos = new LinkedList<ItemCompra>();
    private CatalogoPizza pizzas = new CatalogoPizza();
    private Scanner sc = new Scanner(System.in);
    private String[] tipos = pizzas.getEspecialidad();
    private float[] precio = pizzas.getPrecios();


    public void generarCompra(){
        int opcion;

            do {
                System.out.println("Ingrese la especialidad de la pizza:\n1.Hawaiana, 2.Peperonni, 3. 4 Quesos");
                int espc = sc.nextInt();
                System.out.println("¿Cuantas pizzas desea pedir?");
                byte numPizzas = sc.nextByte();
                float totalPrecio = numPizzas * precio[espc];
                productos.add(new ItemCompra(numPizzas, tipos[espc], totalPrecio));
                System.out.println("¿Desea pedir mas pizzas?\n1.Si, 2.NO");
                opcion = sc.nextInt();
                preciosASumar.add(totalPrecio);
            } while (opcion == 1);
                /*cola.add(productos);
                while (!cola.isEmpty())
                    System.out.println(cola.poll());
                */
        for (int i=0;i< productos.size();i++) {
            precioFinal += (float) preciosASumar.get(i);
        }
        ticket.add(a, precioFinal);
        a++; //Contador para saber los pedidos generados

    }


    public void generarReporte(){

        for (int i=0; i<=ticket.size();i++){
            System.out.println("Del pedido "+ (i+1) +" son "+ ticket.get(i) + " pesos en total ");
        }
    }

}
