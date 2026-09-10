package tarea4edconjuntos;

import java.util.HashSet;
import java.util.Set;

public class Usuario 
{
    
    private String nombre;
    private Set<String> permisos;

    public Usuario(String nombre) 
    {
        this.nombre = nombre;
        
        // usamos el Set.of "LEER", "ESCRIBIR", "IMPRIMIR" y lo metemos en un hash
        this.permisos = new HashSet<>(Set.of("LEER", "ESCRIBIR", "IMPRIMIR"));
    }

    public void agregarPermiso(String permiso) 
    {
        if (this.permisos.add(permiso.toUpperCase())) 
        {
            System.out.println("permiso agregado: " + permiso.toUpperCase());
        } 
        
        else 
        {
            System.out.println("El usuario ya tiene el permiso: " + permiso.toUpperCase());
        }
    }

    public void quitarPermiso(String permiso) 
    {
        if (this.permisos.remove(permiso.toUpperCase())) 
        {
            System.out.println("Permiso revocado: " + permiso.toUpperCase());
        } 
        
        else 
        {
            System.out.println("ERROR permiso no encontrado.");
        }
    }

    public boolean tienePermiso(String permiso) 
    {
        return this.permisos.contains(permiso.toUpperCase());
    }

    public void mostrarEstado() 
    {
        System.out.println("Permisos actuales de " + this.nombre + ": " + this.permisos);
    }
}