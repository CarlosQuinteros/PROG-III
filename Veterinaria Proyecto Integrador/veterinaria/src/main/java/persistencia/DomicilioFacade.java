package persistencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.*;

/**
 *
 * @author carlo
 */
@Stateless
public class DomicilioFacade extends AbstractFacade<Domicilio> {

    @PersistenceContext(unitName = "veterinariapu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DomicilioFacade() {
        super(Domicilio.class);
    }
    
}
