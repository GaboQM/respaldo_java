/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gaboqm
 */
@Entity
@Table(name = "PERSONA", catalog = "jpa_db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findById", query = "SELECT p FROM Persona p WHERE p.id = :id")
    , @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Persona.findByApellido", query = "SELECT p FROM Persona p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Persona.findByEdad", query = "SELECT p FROM Persona p WHERE p.edad = :edad")
    , @NamedQuery(name = "Persona.findByProvincia", query = "SELECT p FROM Persona p WHERE p.provincia = :provincia")
    , @NamedQuery(name = "Persona.findBySueldo", query = "SELECT p FROM Persona p WHERE p.sueldo = :sueldo")
    , @NamedQuery(name = "Persona.findByColorpelo", query = "SELECT p FROM Persona p WHERE p.colorpelo = :colorpelo")
    , @NamedQuery(name = "Persona.findByAltura", query = "SELECT p FROM Persona p WHERE p.altura = :altura")
    , @NamedQuery(name = "Persona.findByPeso", query = "SELECT p FROM Persona p WHERE p.peso = :peso")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "apellido", nullable = false, length = 40)
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad", nullable = false)
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "provincia", nullable = false, length = 40)
    private String provincia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sueldo", nullable = false)
    private long sueldo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "colorpelo", nullable = false, length = 10)
    private String colorpelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "altura", nullable = false)
    private long altura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso", nullable = false)
    private float peso;

    public Persona() {
    }

    public Persona(Integer id) {
        this.id = id;
    }

    public Persona(Integer id, String nombre, String apellido, int edad, String provincia, long sueldo, String colorpelo, long altura, float peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.provincia = provincia;
        this.sueldo = sueldo;
        this.colorpelo = colorpelo;
        this.altura = altura;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Persona[ id=" + id + " ]";
    }
    
}
