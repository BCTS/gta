package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_viaje;


@Controller(value = "uif.rs.B_viajeTemplateController")
@RequestMapping(value = "/application/uif_b_viajes/template")
public class B_viajeTemplateController extends AbstractObjectTemplateController<B_viaje> {
    public B_viajeTemplateController() {
        super(B_viaje.class);
    }
}