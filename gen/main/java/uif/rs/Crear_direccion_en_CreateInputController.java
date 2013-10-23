package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_create_crear_direccion_en__initiateDomain;


@Controller(value = "uif.rs.Crear_direccion_en_CreateInputController")
@RequestMapping(value = "/application/processes/uif_crear_direccion_en_", method = RequestMethod.POST)
public class Crear_direccion_en_CreateInputController extends AbstractProcessCreateController<Da_def_create_crear_direccion_en__initiateDomain> {
    public Crear_direccion_en_CreateInputController() {
        super("uif_crear_direccion_en_", Da_def_create_crear_direccion_en__initiateDomain.class);
    }
}