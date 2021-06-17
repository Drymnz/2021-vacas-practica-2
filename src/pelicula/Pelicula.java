package src.pelicula;

public class Pelicula {
    private int id;
    private int fecha;
    private String nombre;
    private String categoria;
    private boolean disponible;
    // inicio constructores
    public Pelicula(int id, int fecha, String nombre, String categoria, boolean disponible) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.categoria = categoria;
        this.disponible = disponible;
    }
    public Pelicula(int id, int fecha, String nombre, String categoria){
        this(id, fecha, nombre, categoria, true);
    }
    // fin constructores
    // set
    public void setId(int id){
        this.id = id;
    }
    public void setFecha(int fecha){
        this.fecha = fecha;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    // fin set
    // inicio get
    public int getId(){
        return id;
    }
    public int getFecha(){
        return fecha;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCategoria(){
        return categoria;
    }
    public boolean getDisponible(){
        return disponible;
    }
    // fin get
    // mostrar informacion al usuario
    public String mostrar(){
        return "id < "+ this.id +" > nombre < "+this.nombre+" > fecha < "+this.fecha+" > categoria < "+this.categoria+" > ";
    }
    //fin de mostrar infromacion
}