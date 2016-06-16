/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Store;

/**
 *
 * @author Diego
 */
@Entity
@Table(name = "equipamentos")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "equipamento")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String equipamento;

    @Column(name = "descricao")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String descricao;

    @Column(name = "quantidade")
    @NotEmpty
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Equipamentos{"
                + "id=" + id
                + ", equipamento='" + equipamento + '\''
		+ ", descricao='" + descricao + '\''
		+ ", quantidade=" + quantidade
                + '}';
    }
}
