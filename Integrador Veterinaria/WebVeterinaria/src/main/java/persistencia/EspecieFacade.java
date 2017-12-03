/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Especie;

/**
 *
 * @author carlo
 */
@Stateless
public class EspecieFacade extends AbstractFacade<Especie> {

    @PersistenceContext(unitName = "puveterinaria")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EspecieFacade() {
        super(Especie.class);
    }

    public Boolean existeEspecieNombre(String pNombre) {
        /*try {
            Especie existe = em.createQuery("SELECT e FROM especie e WHERE e.nombre=" +pNombre, Especie.class).getSingleResult();
            if (existe == null) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }*/
        
        List<Especie> especies = findAll();
        for (Especie especy : especies) {
            if(especy.getNombre().equals(pNombre))
                return true;
        }
        return false;
        
    }

}
