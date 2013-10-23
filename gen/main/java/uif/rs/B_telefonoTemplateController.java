package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_telefono;


@Controller(value = "uif.rs.B_telefonoTemplateController")
@RequestMapping(value = "/application/uif_b_telefonos/template")
public class B_telefonoTemplateController extends AbstractObjectTemplateController<B_telefono> {
    public B_telefonoTemplateController() {
        super(B_telefono.class);
    }
}