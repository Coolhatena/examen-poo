
package examen121760177;

import java.util.ArrayList;


public class Proveedor {
    String tipoProveedor = null;
    String nombreProveedor = null;
    String empresaProveedor = null;
    int diasPago = 0;
    int idProveedor = 0;
    ArrayList<Producto> productos;
    int contadorProductos = 0;
    
    public Proveedor(String tipoProveedor, String nombreProveedor, String empresaProveedor, int diasPago, int idProveedor){
        this.tipoProveedor = tipoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.empresaProveedor = empresaProveedor;
        this.diasPago = diasPago; 
        this.idProveedor = idProveedor;
        this.productos = new ArrayList();
        this.contadorProductos = 0;
    }
    
    public String imprimir(){
        return "\nTipo de proveedor: "+tipoProveedor+"\nNombre: "+nombreProveedor+"\nEmpresa: "+empresaProveedor+"\nDias para pagar: "+diasPago+"\nCantidad de productos: "+contadorProductos+"\nNumero de Proveedor: "+idProveedor;
    }
    
    
    
}
