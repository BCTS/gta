package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_create_obtener_lista_provi_initiateDomain;


@Controller(value = "uif.rs.Obtener_lista_proviCreateInputController")
@RequestMapping(value = "/application/processes/uif_obtener_lista_provi", method = RequestMethod.POST)
public class Obtener_lista_proviCreateInputController extends AbstractProcessCreateController<Da_def_create_obtener_lista_provi_initiateDomain> {
    public Obtener_lista_proviCreateInputController() {
        super("uif_obtener_lista_provi", Da_def_create_obtener_lista_provi_initiateDomain.class);
    }
}