package src.pelicula;

import src.tienda.IngresoDatos;

public class ManejoPelicula {
    private Pelicula[] catalogo = new Pelicula[1];
    private int siguienteCodigo ;

    public ManejoPelicula() {
        siguienteCodigo = 0;
    }

    // agregar pelicula
    public void agreagarPelicula(int id, int fecha, String nombre, String categoria) {
        if (siguienteCodigo == categoria.length()) {
            ampliarEspacio();
        }
        catalogo[siguienteCodigo] = new Pelicula(id, fecha, nombre, categoria);
        siguienteCodigo++;
    }
    public void agreagarPelicula(){
        int id = (siguienteCodigo+1);
        int fecha = IngresoDatos.getEntero("Ingrese la fecha de la pelicula", false);
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        String categoria = IngresoDatos.getTexto("Ingrese la categoria o genero de la pelicula");
        this.agreagarPelicula(id, fecha, nombre, categoria);
    }

    public void ampliarEspacio() {
        Pelicula[] nuevo = new Pelicula[(catalogo.length + 3)];
        for (int i = 0; i < catalogo.length; i++) {
            nuevo[i] = catalogo[i];
        }
        catalogo = null;
        catalogo = nuevo;
    }
    // fin de agregar pelicula
    // mostrar el catalogo
    public void mostrarCatalogo(){
        System.out.println(" Estas son las peliculas que tenemos : ");
        for (int i = 0; i < siguienteCodigo; i++) {
            System.out.println(catalogo[i].mostrar()+disponible(catalogo[i].getDisponible()));
        }
    }
    public String disponible(boolean disponible){
        if (disponible) return IngresoDatos.resaltadorTexto(0, " Disponible ");
        else return IngresoDatos.resaltadorTexto(1, " No disponible ");
    }
    // fin de mostrar catalogo
    // metodo ordenar
    public void ordenarRespectoNombre(boolean ascendente){
        boolean cambio = true;
        for (int i = 1; i < siguienteCodigo; i++) {
            for (int j = 0; j < (siguienteCodigo-i)); j++) {
                if (ascendente) {
                    cambio = (catalogo[j].getNombre().compareTo(catalogo[j+1].getNombre()) < 0);
                } else {
                    cambio = (catalogo[j].getNombre().compareTo(catalogo[j+1].getNombre()) > 0);
                }

                if (cambio) {
                    Pelicula aux = catalogo[j];
                    catalogo[j] = catalogo[j+1];
                    catalogo[j+1] = aux;
                }
            }
        }
    }
    // fin ordenar
}