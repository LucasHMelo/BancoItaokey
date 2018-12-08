/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class Conta {
    private int idConta;
    private Double saldo;
    private Cliente cliente;
    
    
    
    Conta() {
        
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
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
    
    

    public void deposita(double saldo){
        this.saldo += saldo;
    }
    public void saque(double saldo){
        this.saldo -= saldo;
    }
    public void paga(double saldo){
        this.saldo -= saldo;
    }
    public void transfere(double saldo){
        this.saldo -= saldo;
    }
   /* public void extrato(double saldo){
        this.saldo -= saldo;
    } */

    @Override
    public String toString() {
        return "Conta{" + "idConta=" + idConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.idConta;
        hash = 41 * hash + Objects.hashCode(this.saldo);
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
        final Conta other = (Conta) obj;
        return true;
    }
}
