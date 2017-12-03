/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.EnfermedadPaciente;

/**
 *
 * @author carlo
 */
@Stateless
public class EnfermedadPacienteFacade extends AbstractFacade<EnfermedadPaciente> {

    @PersistenceContext(unitName = "puveterinaria")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnfermedadPacienteFacade() {
        super(EnfermedadPaciente.class);
    }
    
}
