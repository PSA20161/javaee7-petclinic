/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.model;

import org.woehlke.javaee7.petclinic.entities.Equipamento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego
 */
@XmlRootElement
public class Equipamentos {

    private List<Equipamento> equipamentosList;

    @XmlElement
    public List<Equipamento> getEquipamentosList() {
        if (equipamentosList == null) {
            equipamentosList = new ArrayList<Equipamento>();
        }
        return equipamentosList;
    }

    public void setEquipamentosList(List<Equipamento> equipamentosList) {
        this.equipamentosList = equipamentosList;
    }

}
