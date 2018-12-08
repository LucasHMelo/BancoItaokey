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
public class ContaPoupança {
    private int idPoupanca;
    private Double saldo; //soma de todos os depositos
    private Cliente cliente;

    public ContaPoupança() {
        
    }

    public int getIdPoupanca() {
        return idPoupanca;
    }

    public void setIdPoupanca(int idPoupanca) {
        this.idPoupanca = idPoupanca;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ContaPoupan\u00e7a{" + "idPoupanca=" + idPoupanca + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.idPoupanca;
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
        final ContaPoupança other = (ContaPoupança) obj;
        return true;
    }

   
     
}
