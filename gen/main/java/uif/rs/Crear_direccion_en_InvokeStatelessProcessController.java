package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataActionController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_invoke_stateless_processcrear_direccion_en__initiateDomain;


@Controller(value = "uif.rs.Crear_direccion_en_InvokeStatelessProcessController")
@RequestMapping(value = "/application/processes/uif_crear_direccion_en_", method = RequestMethod.POST, params = "type=stateless")
public class Crear_direccion_en_InvokeStatelessProcessController extends AbstractProcessDataActionController<Da_def_invoke_stateless_processcrear_direccion_en__initiateDomain> {
    public Crear_direccion_en_InvokeStatelessProcessController() {
        super("urn:uif:com.emc.ide.artifact.process:Artifacts/Processes/crear_direccion_en_.process", Da_def_invoke_stateless_processcrear_direccion_en__initiateDomain.class);
    }
}