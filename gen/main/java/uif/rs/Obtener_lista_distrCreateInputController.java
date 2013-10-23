package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_create_obtener_lista_distr_initiateDomain;


@Controller(value = "uif.rs.Obtener_lista_distrCreateInputController")
@RequestMapping(value = "/application/processes/uif_obtener_lista_distr", method = RequestMethod.POST)
public class Obtener_lista_distrCreateInputController extends AbstractProcessCreateController<Da_def_create_obtener_lista_distr_initiateDomain> {
    public Obtener_lista_distrCreateInputController() {
        super("uif_obtener_lista_distr", Da_def_create_obtener_lista_distr_initiateDomain.class);
    }
}