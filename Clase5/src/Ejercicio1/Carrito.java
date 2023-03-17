package Ejercicio1;

public class Carrito {
    private Producto prod1;
    private Producto prod2;
    private Producto prod3;
    private Persona duenio;

   Carrito(Persona duenio){
       this.duenio = duenio;
   }

   Carrito(Producto prod1, Persona duenio){
       this.prod1 = prod1;
       this.duenio = duenio;
   }

    public Carrito(Producto prod1, Producto prod2, Producto prod3, Persona duenio) {
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
        this.duenio = duenio;
    }

    public void agregoProducto(Producto prod){
       if (this.prod1 == null){
           this.prod1 = prod;
       } else if (this.prod2 == null){
           this.prod2 = prod;
       } else {
           this.prod3 = prod;
       }
   }

   public double costoFinal(){
       double costoFinal = 0;
       if (this.prod1 != null){
           costoFinal += this.prod1.getPrecio();
       } if (this.prod2 != null){
           costoFinal += this.prod2.getPrecio();
       } if (this.prod3 != null){
           costoFinal += this.prod3.getPrecio();
       }
       return costoFinal;
   }
}
