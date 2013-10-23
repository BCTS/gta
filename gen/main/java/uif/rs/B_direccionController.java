package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_direccion;


@Controller(value = "uif.rs.B_direccionController")
@RequestMapping(value = "/application/uif_b_direccions/{id}")
public class B_direccionController extends AbstractObjectController<B_direccion> {
    public B_direccionController() {
        super(B_direccion.class);
    }
}