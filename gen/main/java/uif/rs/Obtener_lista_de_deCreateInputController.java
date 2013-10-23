package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_create_obtener_lista_de_de_initiateDomain;


@Controller(value = "uif.rs.Obtener_lista_de_deCreateInputController")
@RequestMapping(value = "/application/processes/uif_obtener_lista_de_de", method = RequestMethod.POST)
public class Obtener_lista_de_deCreateInputController extends AbstractProcessCreateController<Da_def_create_obtener_lista_de_de_initiateDomain> {
    public Obtener_lista_de_deCreateInputController() {
        super("uif_obtener_lista_de_de", Da_def_create_obtener_lista_de_de_initiateDomain.class);
    }
}