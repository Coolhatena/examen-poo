
package examen121760177;

import java.util.ArrayList;
import java.util.Scanner;


public class Cafeteria {
    static Scanner leer = new Scanner(System.in);
    static int opcion = 0;
    
    static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    static int contadorProveedores = 0;
    
    public static void main(String[] args) {
        do {
            System.out.println("\nBienvenido al Sistema de la Cafeteria");
            System.out.println("1.- Dar de alta un proveedor Proveedor");
            System.out.println("2.- Dar de alta un producto de un proveedor");
            System.out.println("3.- Listar los proveedores");
            System.out.println("4.- Listar los productos");
            System.out.println("5.- Salir");
            System.out.print("\nLa opcion deseada es: ");
            opcion = leer.nextInt();
            
            switch( opcion ){
                case 1: altaProveedor();
                    break;
                    
                case 2: altaProducto();
                    break;
                    
                case 3: listaProveedor();
                    break;
                    
                case 4:listaProducto();
                    break;
                
                case 5: System.out.println("Adios!");
                    break;
                    
                default: System.out.println("Opcion no valida");
            }
            
        } while ( opcion != 5 );
        
    }
    
    static void altaProveedor(){
        String tipoProveedor = null;
        String nombreProveedor = null;
        String empresaProveedor = null;
        int diasPago = 0, idProveedor = 0;
        
        System.out.println("El proveedor es foraneo o local?: ");
        tipoProveedor = leer.next();
        
        leer.nextLine();
        System.out.println("Digite el nombre del proveedor: ");
        nombreProveedor = leer.nextLine();
        
        leer.nextLine();
        System.out.println("Digite el nombre de la empresa del proveedor: ");
        empresaProveedor = leer.nextLine();
        
        System.out.println("Ha cuantos dias se debe realizar el pago? (Solo numero)");
        diasPago = leer.nextInt();
        
        idProveedor = contadorProveedores;
        
        proveedores.add( new Proveedor( tipoProveedor, nombreProveedor, empresaProveedor, diasPago, idProveedor ) );
        contadorProveedores++;
        
        System.out.println("\nProveedor Registrado con exito");
    }
    
    static void altaProducto(){
        int idProveedor = 0;
        boolean idEncontrado = false;
        String nombreProducto = null;
        float precio = 0f;
        int idProducto = 0;
        
        System.out.println("Digite el id del proveedor: ");
        idProveedor = leer.nextInt();
        
        for (int i = 0; i < proveedores.size(); i++) {
            if( proveedores.get(i).idProveedor == idProveedor ){
                idEncontrado=true;
            }
        }
        
        if ( idEncontrado == true ) {
            
            leer.nextLine();
            System.out.println("Digite el nombre del producto: ");
            nombreProducto = leer.nextLine();
            
            System.out.println("Digite el precio del producto: ");
            precio = leer.nextFloat();
            
            idProducto = proveedores.get(idProveedor).contadorProductos;
            
            proveedores.get(idProveedor).productos.add( new Producto( nombreProducto, precio, idProducto) );
            proveedores.get(idProveedor).contadorProductos++;
            
            System.out.println("Producto agregado con exito");
            
        } else{
            System.out.println("Proveedor no encontrado");
        }
    }
    
    static void listaProveedor(){
        System.out.println("Lista de Proveedores: ");
        for (int i = 0; i < proveedores.size(); i++) {
            System.out.println( proveedores.get(i).imprimir() );
        }
        System.out.println("\n--Fin de la lista de proveedores--");
    }
    
    static void listaProducto(){
        System.out.println("Lista de productos: ");
        for (int i = 0; i < proveedores.size(); i++) {
            System.out.println( "\nProductos del proveedor "+proveedores.get(i).nombreProveedor+" de la empresa "+proveedores.get(i).empresaProveedor+":" );
            
            for (int j = 0; j < proveedores.get(i).productos.size(); j++) {
                System.out.println( proveedores.get(i).productos.get(j).imprimir() );
            }
            
        }
        
        System.out.println("\n--Fin de la lista de Productos--");
    }
    
}
