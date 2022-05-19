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
public class Proyecto 
{
    private ObjectId id;
    private String LinInv;
    private String nombre;
    private String acronimo;
    private String FechIn;
    private String FechFin;
    private float presupuesto;

    public Proyecto() {
    }

    public Proyecto(String LinInv, String nombre, String acronimo, String FechIn, String FechFin, float presupuesto) {
        this.LinInv = LinInv;
        this.nombre = nombre;
        this.acronimo = acronimo;
        this.FechIn = FechIn;
        this.FechFin = FechFin;
        this.presupuesto = presupuesto;
    }

    public Proyecto(ObjectId id, String LinInv, String nombre, String acronimo, String FechIn, String FechFin, float presupuesto) {
        this.id = id;
        this.LinInv = LinInv;
        this.nombre = nombre;
        this.acronimo = acronimo;
        this.FechIn = FechIn;
        this.FechFin = FechFin;
        this.presupuesto = presupuesto;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getLinInv() {
        return LinInv;
    }

    public void setLinInv(String LinInv) {
        this.LinInv = LinInv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getFechIn() {
        return FechIn;
    }

    public void setFechIn(String FechIn) {
        this.FechIn = FechIn;
    }

    public String getFechFin() {
        return FechFin;
    }

    public void setFechFin(String FechFin) {
        this.FechFin = FechFin;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Proyecto other = (Proyecto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "proyecto{" + "id=" + id + ", LinInv=" + LinInv + ", nombre=" + nombre + ", acronimo=" + acronimo + ", FechIn=" + FechIn + ", FechFin=" + FechFin + ", presupuesto=" + presupuesto + '}';
    }
}
