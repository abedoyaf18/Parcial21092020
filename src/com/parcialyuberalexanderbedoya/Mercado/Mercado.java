package com.parcialyuberalexanderbedoya.Mercado;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public byte capacidad = 53;
    private String supermercado;
    private List<Producto> producto;

    boolean producto2 = false;

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        this.producto = new ArrayList<>();
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }



    public boolean agregar(Producto producto1) {

        if (producto.size() <= capacidad) {
            for (int i = 0; i <= producto.size(); i++) {
                if (producto1.getCodigo() == producto.get(i).getCodigo()) {

                    System.out.println("No se puede agragar porque antes agrego este producto ");
                    return false;

                } else {
                    System.out.println("Se agrego el producto: " +producto1.getNombre());
                    producto.add(producto1);
                    return true;
                }
            }
        }
        return producto2;
    }

    public boolean retirar(String nombre)
    {
        boolean producto3  = false;
        for (int i = 0; i < producto.size(); i++)
        {
            if (nombre == producto.get(i).getNombre()) {
                producto.remove(i);
                producto3 = true;
            }
        }
        if(producto3 == true)
        {
            System.out.println("Se ha eliminado el producto: " + nombre + " Se encuentra en el mercado");
        }else {
            System.out.println("No se encontro el producto para eliminar: " + nombre);
        }
        return producto3;
    }

    public Producto buscarnombre(String nombre1)
    {
        Producto producto3  = null;

        for(int i = 0; i < producto.size(); i++)
        {
            if(nombre1 == producto.get(i).getNombre())
            {
                producto3 = producto.get(i);
            }
            else{
                producto3 = null;
            }
        }
        if(producto3 == null)
        {
            System.out.println("El producto: " + nombre1 + " Se encuentra en el mercado");
        }else {
            System.out.println("se encontro el producto: " + nombre1);
        }
        return producto3;
    }

    public Producto buscarcodigo(int codigo)
    {
        Producto producto3 = null;
        for(int i = 0; i < producto.size(); i++)
        {
            if(codigo == producto.get(i).getCodigo())
            {
                producto3 = producto.get(i);
            }

        }
        if(producto3 == null)
        {
            System.out.println("No se encontro el producto");
        }else {
            System.out.println("se encontro el producto: " + producto3.getNombre());
        }
        return producto3;
    }

    public ArrayList<Producto> buscarporTipo(String tip)
    {
        ArrayList<Producto> productos = null;

        for (int i = 0; i < producto.size(); i++){
            if(producto.get(i).getTipo() == tip)
            {
                productos.add(producto.get(i));
                System.out.println("Se agrego el producto" + producto.get(i).getNombre());
            }
        }
        if (productos != null)
        {
            System.out.println("No se ha encontrado ");
        }
        return productos;
    }

    public int calcularTotal(){
        int total = 0;
        for (int i = 0; i < producto.size(); i++){
            total = total + (producto.get(i).getPrecio() * producto.get(i).getCantidad());
        }
        return total;
    }
}
