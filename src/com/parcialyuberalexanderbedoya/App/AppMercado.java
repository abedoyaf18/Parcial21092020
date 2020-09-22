package com.parcialyuberalexanderbedoya.App;

import com.parcialyuberalexanderbedoya.Mercado.Mercado;
import com.parcialyuberalexanderbedoya.Mercado.Producto;

import java.util.Arrays;

import static com.parcialyuberalexanderbedoya.Mercado.TipoProducto.*;


public class AppMercado {
    public static void main(String[] args) {
        Mercado mercado = new Mercado("lA Aldea");

        Producto posta = new Producto(10,"Posta",10000,1,CARNE);
        Producto zanahoria = new Producto(20,"Zanahoria",500,1,VERDURA);
        Producto manzana = new Producto(30,"Manzana",800,1,FRUTA);
        Producto leche = new Producto(40,"Leche",2000,1,LATEOS);
        Producto almojabanas = new Producto(50,"Almojabanas",1000,1,PAN);
        Producto detodito = new Producto(60,"Detodito",1500,1,MECATO);
        Producto jabon = new Producto(70,"Jabon Rosita",2000,1,DETERGENTE);
        Producto ron = new Producto(80,"Ron",30000,1,LICORES);

        mercado.getProducto().addAll(Arrays.asList(posta,zanahoria,manzana,leche,almojabanas,detodito,jabon,ron));

        System.out.println("agregar produto");
        mercado.agregar(leche);

        System.out.println("retirar producto por nombre");
        mercado.retirar(leche.getNombre());

        System.out.println("Buscar producto por nombre");
        mercado.buscarnombre("Leche");

        System.out.println("Buscar producto por codigo");
        mercado.buscarcodigo(20);

        System.out.println("Buscar por tipo");
        mercado.buscarporTipo(leche.getTipo());


        System.out.println(mercado.calcularTotal());
    }

}
