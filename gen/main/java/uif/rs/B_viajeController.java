package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_viaje;


@Controller(value = "uif.rs.B_viajeController")
@RequestMapping(value = "/application/uif_b_viajes/{id}")
public class B_viajeController extends AbstractObjectController<B_viaje> {
    public B_viajeController() {
        super(B_viaje.class);
    }
}