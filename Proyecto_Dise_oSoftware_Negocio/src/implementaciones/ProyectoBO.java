/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAOs.Persistencia;
import Entities.Proyecto;
import Interfaces.IPersistencia;
import interfaces.IProyectoBO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public class ProyectoBO implements IProyectoBO
{
    IPersistencia persistencia = new Persistencia();
    
    @Override
    public boolean agregar(Proyecto proyecto) 
    {
        return persistencia.agregarProyecto(proyecto);
    }

    @Override
    public List<Proyecto> consultarTodos() 
    {
        return persistencia.consultarTodosProyectos();
    }

    @Override
    public Proyecto consultar(ObjectId idProyecto) 
    {
        return persistencia.consultarProyectos(idProyecto);
    }
    
}
