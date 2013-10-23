package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_telefono;


@Controller(value = "uif.rs.B_telefonoController")
@RequestMapping(value = "/application/uif_b_telefonos/{id}")
public class B_telefonoController extends AbstractObjectController<B_telefono> {
    public B_telefonoController() {
        super(B_telefono.class);
    }
}