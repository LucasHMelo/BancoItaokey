/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class MovimentoConta {
    private int idMovimento;
    private Boolean tipoMovimento;
    private String descricao;
    private Double valor;
    private LocalDate data;
    private Conta conta;
    
    public MovimentoConta() {}

    public int getIdMovimento() {
        return idMovimento;
    }

    public void setIdMovimento(int idMovimento) {
        this.idMovimento = idMovimento;
    }

    public Boolean getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(Boolean tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "MovimentoConta{" + "idMovimento=" + idMovimento + ", tipoMovimento=" + tipoMovimento + ", descricao=" + descricao + ", valor=" + valor + ", data=" + data + ", conta=" + conta + '}';
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.idMovimento;
        hash = 53 * hash + Objects.hashCode(this.tipoMovimento);
        hash = 53 * hash + Objects.hashCode(this.descricao);
        hash = 53 * hash + Objects.hashCode(this.valor);
        hash = 53 * hash + Objects.hashCode(this.data);
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
        final MovimentoConta other = (MovimentoConta) obj;
        return true;
    }
    
}
