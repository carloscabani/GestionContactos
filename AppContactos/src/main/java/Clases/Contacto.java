/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Carlos
 */
public class Contacto {
    
    private String nombre;
    
    private String apellido;
    
    private Telefono tlf;
  
    private Direccion dir;
    
    private Email email;
    
    private PersonaAdiconal per; 

    
    private Fecha fecha;
    
    private String web;
    
    private String empresa;

    public Contacto(String nombre, String apellido, Telefono tlf, Direccion dir, Email email, PersonaAdiconal per, Fecha fecha, String web, String empresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tlf = tlf;
        this.dir = dir;
        this.email = email;
        this.per = per;
        this.fecha = fecha;
        this.web = web;
        this.empresa = empresa;
    }
    
    
    
    
    
    public PersonaAdiconal getPer() {
        return per;
    }

    public void setPer(PersonaAdiconal per) {
        this.per = per;
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

    public Telefono getTlf() {
        return tlf;
    }

    public void setTlf(Telefono tlf) {
        this.tlf = tlf;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    


    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
    
    
}
