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
}

