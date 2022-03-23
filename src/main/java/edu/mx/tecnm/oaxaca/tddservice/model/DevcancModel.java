/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.tddservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "devcan")
public class DevcancModel implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_devcanc;
    private String motivo;
    private String folio;
    private String nombreTitular;
    private String primerApellidoTitular;
    private String segundoApellidoTitular;
    private Double costo;

    public Integer getIdDevcanc() {
        return id_devcanc;
    }

    public void setIdDevcanc(Integer idCuenta) {
        this.id_devcanc = idCuenta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotvo(String motivo) {
        this.motivo = motivo;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getPrimerApellidoTitular() {
        return primerApellidoTitular;
    }

    public void setPrimerApellidoTitular(String primerApellidoTitular) {
        this.primerApellidoTitular = primerApellidoTitular;
    }

    public String getSegundoApellidoTitular() {
        return segundoApellidoTitular;
    }

    public void setSegundoApellidoTitular(String segundoApellidoTitular) {
        this.segundoApellidoTitular = segundoApellidoTitular;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
