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
public class MotivovisitaFacade extends AbstractFacade<MotivoVisita> {

    @PersistenceContext(unitName = "veterinariapu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MotivovisitaFacade() {
        super(MotivoVisita.class);
    }
    
}
