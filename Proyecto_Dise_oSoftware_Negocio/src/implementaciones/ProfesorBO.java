/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAOs.Persistencia;
import Entities.Profesor;
import Interfaces.IPersistencia;
import interfaces.IProfesorBO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public class ProfesorBO implements IProfesorBO {

    IPersistencia persistencia = new Persistencia();

    @Override
    public boolean agregar(Profesor profesor) {
        return persistencia.agregarProfesores(profesor);
    }

    @Override
    public List<Profesor> consultarTodos() {
        return persistencia.consultarTodosProfesores();
    }

    @Override
    public Profesor consultar(ObjectId idProfesor) 
    {
        return persistencia.consultarProfesores(idProfesor);
    }

}
