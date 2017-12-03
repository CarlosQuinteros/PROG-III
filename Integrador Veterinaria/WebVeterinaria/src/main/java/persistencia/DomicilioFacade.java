/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Domicilio;

/**
 *
 * @author carlo
 */
@Stateless
public class DomicilioFacade extends AbstractFacade<Domicilio> {

    @PersistenceContext(unitName = "puveterinaria")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DomicilioFacade() {
        super(Domicilio.class);
    }
    
}
