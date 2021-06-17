package src.tienda;

import src.clientes.VectorClientes;
import src.pelicula.ManejoPelicula;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private ManejoPelicula listadoPelicula = new ManejoPelicula();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Registrar pelicula");
            System.out.println("6) Mostrar peliculas");
            System.out.println("7) Ordenar peliculas Descendente respecto Nombre");
            System.out.println("8) Ordenar peliculas Ascente respecto Nombre");
            System.out.println("9) Ordenar peliculas Ascente respecto Id");
            System.out.println("10) Ordenar peliculas Descendente respecto Id");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if (menu == 5){
                //agregar al la base de datos
                listadoPelicula.agreagarPelicula();
            }
            if (menu == 6){
                //mostrar listado de peliculas
                listadoPelicula.mostrarCatalogo();
            }
            if (menu == 7){
                //Ordenar peliculas Ascente respecto Nombre
                listadoPelicula.ordenarRespectoNombre(true);
            }
            if (menu == 8){
                //Ordenar peliculas Descendente respecto Nombre
                listadoPelicula.ordenarRespectoNombre(false);
            }
            if (menu == 9){
                //mostrar peliculas Ascente respecto Id
                listadoPelicula.ordenarRespectoId(true);
            }
            if (menu == 10){
                //mostrar peliculas Ascente respecto Id
                listadoPelicula.ordenarRespectoId(false);
            }
        }

    }

    
}
