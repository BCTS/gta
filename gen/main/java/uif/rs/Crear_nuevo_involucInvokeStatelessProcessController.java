package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataActionController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Da_def_invoke_stateless_processcrear_nuevo_involuc_initiateDomain;


@Controller(value = "uif.rs.Crear_nuevo_involucInvokeStatelessProcessController")
@RequestMapping(value = "/application/processes/uif_crear_nuevo_involuc", method = RequestMethod.POST, params = "type=stateless")
public class Crear_nuevo_involucInvokeStatelessProcessController extends AbstractProcessDataActionController<Da_def_invoke_stateless_processcrear_nuevo_involuc_initiateDomain> {
    public Crear_nuevo_involucInvokeStatelessProcessController() {
        super("urn:uif:com.emc.ide.artifact.process:Artifacts/Processes/crear_nuevo_involuc.process", Da_def_invoke_stateless_processcrear_nuevo_involuc_initiateDomain.class);
    }
}