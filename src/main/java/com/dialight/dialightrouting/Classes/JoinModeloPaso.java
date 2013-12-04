
package com.dialight.dialightrouting.Classes;

public class JoinModeloPaso {
    private int id;
    private Modelo modelo;
    private Paso paso;
    private int numerodepasos;

    public JoinModeloPaso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Paso getPaso() {
        return paso;
    }

    public void setPaso(Paso paso) {
        this.paso = paso;
    }

    public int getNumerodepasos() {
        return numerodepasos;
    }

    public void setNumerodepasos(int numerodepasos) {
        this.numerodepasos = numerodepasos;
    }
    
}
