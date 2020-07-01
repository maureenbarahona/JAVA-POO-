/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2.objetos;

/**
 *
 * @author maureen
 */
public class Persona {
    private int codPersona;
    private String nomPersona;
    private String direccion;
    private String telefono;

    public Persona() {
    }
    
    

    public Persona(int codPersona, String nomPersona, String direccion, String telefono) {
        this.codPersona = codPersona;
        this.nomPersona = nomPersona;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
