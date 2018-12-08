/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public class CDB {
    private int idCDB;
    private String nome;
    private Double saldoTotal;

    public CDB(int idCDB, String nome, Double saldoTotal) {
        this.idCDB = idCDB;
        this.nome = nome;
        this.saldoTotal = saldoTotal;
    }

    public int getIdCDB() {
        return idCDB;
    }

    public void setIdCDB(int idCDB) {
        this.idCDB = idCDB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(Double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    @Override
    public String toString() {
        return "CDB{" + "idCDB=" + idCDB + ", nome=" + nome + ", saldoTotal=" + saldoTotal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idCDB;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CDB other = (CDB) obj;
        return true;
    }
}
