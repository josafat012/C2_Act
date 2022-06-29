package com.upchiapas.queue;

import com.upchiapas.queue.models.CatalogoPizza;
import com.upchiapas.queue.models.ItemCompra;
import com.upchiapas.queue.models.OrdenCompra;
import com.upchiapas.queue.models.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Pizza> catalogo = new CatalogoPizza().catalogoPrecios();
        OrdenCompra ordenes = new OrdenCompra();

        System.out.println("==BIENVENIDO==");
        int opc;
        do {
            System.out.println("Seleccione una opcion:\n1.Mostar catalogo, 2.Crear orden, 3.Mostrar reporte, 4.Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    for (int i=0;i<catalogo.size();i++)
                        System.out.println(catalogo.get(i));
                    break;
                case 2:
                    ordenes.generarCompra();
                    break;
                case 3:
                    ordenes.generarReporte();
                    break;
            }
        }while (opc!=4);

    }
}
