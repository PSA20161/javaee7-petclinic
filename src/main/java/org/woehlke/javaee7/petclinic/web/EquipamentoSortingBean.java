/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.web;

import org.richfaces.component.SortOrder;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Diego
 */
@ManagedBean
@SessionScoped
public class EquipamentoSortingBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private SortOrder sortOrderEquipamento = SortOrder.unsorted;
    private SortOrder sortOrderDescricao = SortOrder.unsorted;
    private SortOrder sortOrderQuantidade = SortOrder.unsorted;

    public void setSortOrderToEquipamento() {
        if (SortOrder.ascending == sortOrderEquipamento) {
            sortOrderEquipamento = SortOrder.descending;
        } else {
            sortOrderEquipamento = SortOrder.ascending;
        }
        sortOrderDescricao = SortOrder.unsorted;
        sortOrderQuantidade = SortOrder.unsorted;
    }

    public void setSortOrderToDescricao() {
        sortOrderEquipamento = SortOrder.unsorted;
        if (SortOrder.ascending == sortOrderDescricao) {
            sortOrderDescricao = SortOrder.descending;
        } else {
            sortOrderDescricao = SortOrder.ascending;
        }
        sortOrderQuantidade = SortOrder.unsorted;
    }

    public void setSortOrderToQuantidade() {
        sortOrderEquipamento = SortOrder.unsorted;
        sortOrderDescricao = SortOrder.unsorted;
        if (SortOrder.ascending == sortOrderQuantidade) {
            sortOrderQuantidade = SortOrder.descending;
        } else {
            sortOrderQuantidade = SortOrder.ascending;
        }
    }

    public SortOrder getSortOrderEquipamento() {
        return sortOrderEquipamento;
    }

    public void setSortOrderEquipamento(SortOrder sortOrderEquipamento) {
        this.sortOrderEquipamento = sortOrderEquipamento;
    }

    public SortOrder getSortOrderDescricao() {
        return sortOrderDescricao;
    }

    public void setSortOrderDescricao(SortOrder sortOrderDescricao) {
        this.sortOrderDescricao = sortOrderDescricao;
    }

    public SortOrder getSortOrderQuantidade() {
        return sortOrderQuantidade;
    }

    public void setSortOrderQuantidade(SortOrder sortOrderQuantidade) {
        this.sortOrderQuantidade = sortOrderQuantidade;
    }

}
