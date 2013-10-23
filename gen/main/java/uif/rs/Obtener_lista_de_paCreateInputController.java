package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_create_obtener_lista_de_pa_initiateDomain;


@Controller(value = "uif.rs.Obtener_lista_de_paCreateInputController")
@RequestMapping(value = "/application/processes/uif_obtener_lista_de_pa", method = RequestMethod.POST)
public class Obtener_lista_de_paCreateInputController extends AbstractProcessCreateController<Da_def_create_obtener_lista_de_pa_initiateDomain> {
    public Obtener_lista_de_paCreateInputController() {
        super("uif_obtener_lista_de_pa", Da_def_create_obtener_lista_de_pa_initiateDomain.class);
    }
}