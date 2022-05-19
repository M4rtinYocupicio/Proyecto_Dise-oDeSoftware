/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public class Profesor 
{
    private ObjectId id;
    private String nombre;
    private String apellido;
    private String despacho;
    private int telefono;
    private int participaciones;
    private String GradEstudios;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String despacho, int telefono, int participaciones, String GradEstudios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.despacho = despacho;
        this.telefono = telefono;
        this.participaciones = participaciones;
        this.GradEstudios = GradEstudios;
    }

    public Profesor(ObjectId id, String nombre, String apellido, String despacho, int telefono, int participaciones, String GradEstudios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.despacho = despacho;
        this.telefono = telefono;
        this.participaciones = participaciones;
        this.GradEstudios = GradEstudios;
    }

    public ObjectId getId() 
    {
        return id;
    }

    public void setId(ObjectId id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getDespacho() 
    {
        return despacho;
    }

    public void setDespacho(String despacho) 
    {
        this.despacho = despacho;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }

    public int getParticipaciones() 
    {
        return participaciones;
    }

    public void setParticipaciones(int participaciones)
    {
        this.participaciones = participaciones;
    }

    public String getGradEstudios() 
    {
        return GradEstudios;
    }

    public void setGradEstudios(String GradEstudios) 
    {
        this.GradEstudios = GradEstudios;
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "profesor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", despacho=" + despacho + ", telefono=" + telefono + ", participaciones=" + participaciones + ", GradEstudios=" + GradEstudios + '}';
    }
}
