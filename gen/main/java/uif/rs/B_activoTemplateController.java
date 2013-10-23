package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_activo;


@Controller(value = "uif.rs.B_activoTemplateController")
@RequestMapping(value = "/application/uif_b_activos/template")
public class B_activoTemplateController extends AbstractObjectTemplateController<B_activo> {
    public B_activoTemplateController() {
        super(B_activo.class);
    }
}