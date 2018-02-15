/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.EmpleadoDAO;
import com.models.Empleado;
import java.util.List;
import javax.inject.Named;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gaboqm
 */
@Named(value = "empleadoBean")
@RequestScoped
public class EmpleadoBean {
    private Empleado empleado= new Empleado();
    private  EmpleadoDAO empDAO= new EmpleadoDAO();
    private List<Empleado> lisEmpleado;
    
 

    /**
     * Creates a new instance of EmpleadoBean
     */
    public EmpleadoBean() {
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public EmpleadoDAO getEmpDAO() {
        return empDAO;
    }

    public List<Empleado> getLisEmpleado() {
        return lisEmpleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setEmpDAO(EmpleadoDAO empDAO) {
        this.empDAO = empDAO;
    }

    public void setLisEmpleado(List<Empleado> lisEmpleado) {
        this.lisEmpleado = lisEmpleado;
    }
    
    public void registrar() throws Exception{
         
        empDAO.registrar(this.empleado);
    }
    
    public void eliminar(Empleado empleado) throws Exception{
            System.out.println(this.empleado.getSexo()+"{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{");
        empDAO.eliminar(this.empleado);
    }
    public String leer(Empleado emp){
         System.err.println(emp.getNombres()+".....");
        //this.empleado=emp;
        return "editar";
    }
    public String tets(){
        return "editar";
    }
    
    public String modificar(Empleado empleado)throws Exception{
        empDAO.modificar(empleado);
        return "exito";
    }
    public void listar(){
        this.lisEmpleado=empDAO.listar();
    }
}
