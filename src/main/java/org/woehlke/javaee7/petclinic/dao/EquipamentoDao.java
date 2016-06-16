/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.dao;

import org.woehlke.javaee7.petclinic.entities.Equipamento;

import java.util.List;

/**
 *
 * @author Diego
 */
public interface EquipamentoDao {

    List<Equipamento> getAll();

    void delete(long id);

    void addNew(Equipamento equipamento);

    Equipamento findById(long id);

    void update(Equipamento equipamento);

}
