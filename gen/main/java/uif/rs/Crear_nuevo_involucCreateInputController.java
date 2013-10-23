package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_create_crear_nuevo_involuc_initiateDomain;


@Controller(value = "uif.rs.Crear_nuevo_involucCreateInputController")
@RequestMapping(value = "/application/processes/uif_crear_nuevo_involuc", method = RequestMethod.POST)
public class Crear_nuevo_involucCreateInputController extends AbstractProcessCreateController<Da_def_create_crear_nuevo_involuc_initiateDomain> {
    public Crear_nuevo_involucCreateInputController() {
        super("uif_crear_nuevo_involuc", Da_def_create_crear_nuevo_involuc_initiateDomain.class);
    }
}