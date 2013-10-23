package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_identificacion;


@Controller(value = "uif.rs.B_identificacionTemplateController")
@RequestMapping(value = "/application/uif_b_identificacions/template")
public class B_identificacionTemplateController extends AbstractObjectTemplateController<B_identificacion> {
    public B_identificacionTemplateController() {
        super(B_identificacion.class);
    }
}