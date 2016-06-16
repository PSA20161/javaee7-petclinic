/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.dao;

import org.woehlke.javaee7.petclinic.entities.Equipamento;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Diego
 */
@Stateless
public class EquipamentoDaoImpl implements EquipamentoDao {

    private static Logger log = Logger.getLogger(EquipamentoDaoImpl.class.getName());

    @PersistenceContext(unitName = "javaee7petclinic")
    private EntityManager entityManager;

    @Override
    public List<Equipamento> getAll() {
        TypedQuery<Equipamento> q = entityManager.createQuery("select e from Equipamento e", Equipamento.class);
        List<Equipamento> list = q.getResultList();
        return list;
    }

    @Override
    public void delete(long id) {
        Equipamento equipamento = entityManager.find(Equipamento.class, id);
        entityManager.remove(equipamento);
    }

    @Override
    public void addNew(Equipamento equipamento) {
        log.info("addNewEquipamento: " + equipamento.toString());
        entityManager.persist(equipamento);
    }

    @Override
    public Equipamento findById(long id) {
        Equipamento equipamento = entityManager.find(Equipamento.class, id);
        return equipamento;
    }

    @Override
    public void update(Equipamento equipamento) {
        entityManager.merge(equipamento);
    }

}
