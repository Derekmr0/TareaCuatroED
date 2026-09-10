package tarea4edconjuntos;

public class Main 
{
    
    public static void main(String[] args) 
    {
        
        Usuario empleado = new Usuario("Steve");
        empleado.mostrarEstado();

        System.out.println("\n--- PRUEBA 1 ---");
        
        
          if (empleado.tienePermiso("ESCRIBIR")) 
        {
            System.out.println("Puede modificar archivos");
        }

        System.out.println("\n--- PRUEBAS EXTRA ---");
        //Buscamos que el usuario tenga permisos de ejecucion
        System.out.println("Verificando si puede EJECUTAR...");
        
        
          if (!empleado.tienePermiso("EJECUCION")) 
        {
            // pensar en un metodo para agregar o quitar permisos de un usuario
            empleado.agregarPermiso("EJECUCION");
        }

        System.out.println("\nQuitando el permiso de IMPRIMIR...");
        empleado.quitarPermiso("IMPRIMIR");

        System.out.println("\n--- ESTADO FINAL ---");
        empleado.mostrarEstado();
    }
}