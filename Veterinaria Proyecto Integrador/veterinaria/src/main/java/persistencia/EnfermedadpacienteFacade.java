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
public class EnfermedadpacienteFacade extends AbstractFacade<EnfermedadPaciente> {

    @PersistenceContext(unitName = "veterinariapu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnfermedadpacienteFacade() {
        super(EnfermedadPaciente.class);
    }
    
}
