package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_accion;


@Controller(value = "uif.rs.B_accionController")
@RequestMapping(value = "/application/uif_b_accions/{id}")
public class B_accionController extends AbstractObjectController<B_accion> {
    public B_accionController() {
        super(B_accion.class);
    }
}