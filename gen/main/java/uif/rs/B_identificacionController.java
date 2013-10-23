package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_identificacion;


@Controller(value = "uif.rs.B_identificacionController")
@RequestMapping(value = "/application/uif_b_identificacions/{id}")
public class B_identificacionController extends AbstractObjectController<B_identificacion> {
    public B_identificacionController() {
        super(B_identificacion.class);
    }
}