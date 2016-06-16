/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.web;

import org.woehlke.javaee7.petclinic.dao.EquipamentoDao;
import org.woehlke.javaee7.petclinic.entities.Equipamento;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Diego
 */
@ManagedBean
@SessionScoped
public class EquipamentoController implements Serializable {

    @EJB
    private EquipamentoDao equipamentoDao;

    private Equipamento equipamento;

    private List<Equipamento> equipamentos;

    private int scrollerPage = 1;

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getNewEquipamentoForm() {
        this.equipamento = new Equipamento();
        return "newEquipamento.jsf";
    }

    public String saveNewEquipamento() {
        equipamentoDao.addNew(this.equipamento);
        this.equipamentos = equipamentoDao.getAll();
        return "equipamentos.jsf";
    }

    public List<Equipamento> getEquipamentos() {
        if (this.equipamentos == null) {
            this.equipamentos = equipamentoDao.getAll();
        }
        return this.equipamentos;
    }

    public String getEditForm(long id) {
        this.equipamento = equipamentoDao.findById(id);
        return "editEquipamento.jsf";
    }

    public String saveEditedEquipamento() {
        equipamentoDao.update(this.equipamento);
        this.equipamentos = equipamentoDao.getAll();
        return "equipamentos.jsf";
    }

    public String deleteEquipamento(long id) {
        this.equipamento = equipamentoDao.findById(id);
        equipamentoDao.update(this.equipamento);
        equipamentoDao.delete(id);
        this.equipamentos = equipamentoDao.getAll();
        return "equipamentos.jsf";
    }

    public int getScrollerPage() {
        return scrollerPage;
    }

    public void setScrollerPage(int scrollerPage) {
        this.scrollerPage = scrollerPage;
    }

}
