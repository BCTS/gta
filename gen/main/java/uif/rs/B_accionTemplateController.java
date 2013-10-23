package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_accion;


@Controller(value = "uif.rs.B_accionTemplateController")
@RequestMapping(value = "/application/uif_b_accions/template")
public class B_accionTemplateController extends AbstractObjectTemplateController<B_accion> {
    public B_accionTemplateController() {
        super(B_accion.class);
    }
}