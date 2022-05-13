
package examen121760177;


public class Producto {
    String nombreProducto = null;
    float precio = 0f;
    int idProducto = 0;

    public Producto(String nombreProducto, float precio, int idProducto){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.idProducto = idProducto;
    }
    
    public String imprimir(){
        return "\nNombre del producto: "+nombreProducto+"\nPrecio: "+precio+"\nNumero de producto: "+idProducto;
    }
    
       
}
