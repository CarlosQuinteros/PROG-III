package persistencia;
import modelo.*;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlo
 */
@Stateless
public class VacunacolocadaFacade extends AbstractFacade<VacunaColocada> {

    @PersistenceContext(unitName = "veterinariapu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VacunacolocadaFacade() {
        super(VacunaColocada.class);
    }
    
}
