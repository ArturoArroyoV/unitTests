/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;

public class ServicioGrupo4 {

    public static boolean validarCliente(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }

        return true;
    }

    public static boolean verificarLimite(double total){
        if(total>5000){
            return false;
        }

        return true;
    }

        
    public static boolean validarDescuento(double descuento){
        if(descuento<0||descuento>50){
            return false;
        }

        return true;
    }

    public static double calcularIGV(double total){
        return total = total * 1.18;
    }

    public static boolean verificarStock(List<Producto> lista){
        for (Producto produc : lista){
            if(produc.getCantidad() = 0){
               return false; 
            }
        }
        return true;
    }
}

