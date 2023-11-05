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
    
    private String tlf;
  
    private String dir;
    
    private Email email;
    
    private List<Contacto> numerosTlf; 
    
    private List<Fecha> fechas;
    
    private List<Foto> listaFotos;
    
    private List<Contacto> contactosRelacionados;
    
    public void anadirContactoRel(Contacto c){
        this.contactosRelacionados.add(c);
        c.contactosRelacionados.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Contacto> getNumerosTlf() {
        return numerosTlf;
    }

    public void setNumerosTlf(List<Contacto> numerosTlf) {
        this.numerosTlf = numerosTlf;
    }

    public List<Fecha> getFechas() {
        return fechas;
    }

    public void setFechas(List<Fecha> fechas) {
        this.fechas = fechas;
    }

    public List<Foto> getListaFotos() {
        return listaFotos;
    }

    public void setListaFotos(List<Foto> listaFotos) {
        this.listaFotos = listaFotos;
    }

    public List<Contacto> getContactosRelacionados() {
        return contactosRelacionados;
    }

    public void setContactosRelacionados(List<Contacto> contactosRelacionados) {
        this.contactosRelacionados = contactosRelacionados;
    }

    //constructor
    public Contacto(String nombre, String tlf, String dir, Email email, List<Contacto> numerosTlf, List<Fecha> fechas, List<Foto> listaFotos, List<Contacto> contactosRelacionados) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.dir = dir;
        this.email = email;
        this.numerosTlf = numerosTlf;
        this.fechas = fechas;
        this.listaFotos = listaFotos;
        this.contactosRelacionados = contactosRelacionados;
    }
    
    public Contacto(String nombre, String tlf, String dir) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.dir = dir;

    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
    
    
}
