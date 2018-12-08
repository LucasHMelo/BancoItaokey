/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class ContaPoupançaDeposito {
     private int idCPD;
    private Double saldo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private LocalDate aniversario;
    private Boolean status;    
    private ContaPoupança contaPoupanca;

    public ContaPoupançaDeposito() {
        
    }

    public int getIdCPD() {
        return idCPD;
    }

    public void setIdCPD(int idCPD) {
        this.idCPD = idCPD;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ContaPoupança getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupança contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    @Override
    public String toString() {
        return "ContaPoupan\u00e7aDep\u00f3sito{" + "idCPD=" + idCPD + ", saldo=" + saldo + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + ", aniversario=" + aniversario + ", status=" + status + ", contaPoupanca=" + contaPoupanca + '}';
    }
    

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idCPD;
  
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
        final ContaPoupançaDeposito other = (ContaPoupançaDeposito) obj;
        return true;
    }
   
}
