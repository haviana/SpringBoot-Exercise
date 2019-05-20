package com.multicert.app.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    public Car(String matricula, String marca, String modelo, Integer consumos) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.consumos = consumos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getConsumos() {
        return consumos;
    }

    public void setConsumos(Integer consumos) {
        this.consumos = consumos;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer id;

    private String matricula;

    private String marca;
    private String modelo;
    private Integer consumos;



}
