/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public class Revista 
{
     private ObjectId id;
    private String nombre;
    private String tipo;
    private Date FechaInicio;
    private Date FechaFin;
    private String pais;
    private String LugCel;
    private String editorial;

    public Revista() {
    }

    public Revista(String nombre, String tipo, Date FechaInicio, Date FechaFin, String pais, String LugCel, String editorial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.pais = pais;
        this.LugCel = LugCel;
        this.editorial = editorial;
    }

    public Revista(ObjectId id, String nombre, String tipo, Date FechaInicio, Date FechaFin, String pais, String LugCel, String editorial) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.pais = pais;
        this.LugCel = LugCel;
        this.editorial = editorial;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLugCel() {
        return LugCel;
    }

    public void setLugCel(String LugCel) {
        this.LugCel = LugCel;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Revista other = (Revista) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "revista{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", pais=" + pais + ", LugCel=" + LugCel + ", editorial=" + editorial + '}';
    }
}
