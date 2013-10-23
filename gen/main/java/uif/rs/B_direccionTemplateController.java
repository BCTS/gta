package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_direccion;


@Controller(value = "uif.rs.B_direccionTemplateController")
@RequestMapping(value = "/application/uif_b_direccions/template")
public class B_direccionTemplateController extends AbstractObjectTemplateController<B_direccion> {
    public B_direccionTemplateController() {
        super(B_direccion.class);
    }
}