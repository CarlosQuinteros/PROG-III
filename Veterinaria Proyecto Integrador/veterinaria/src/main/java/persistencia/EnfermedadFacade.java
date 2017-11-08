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
public class EnfermedadFacade extends AbstractFacade<Enfermedad> {

    @PersistenceContext(unitName = "veterinariapu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnfermedadFacade() {
        super(Enfermedad.class);
    }
    
}
