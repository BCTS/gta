package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_activo;


@Controller(value = "uif.rs.B_activoController")
@RequestMapping(value = "/application/uif_b_activos/{id}")
public class B_activoController extends AbstractObjectController<B_activo> {
    public B_activoController() {
        super(B_activo.class);
    }
}