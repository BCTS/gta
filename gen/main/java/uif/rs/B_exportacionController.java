package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_exportacion;


@Controller(value = "uif.rs.B_exportacionController")
@RequestMapping(value = "/application/uif_b_exportacions/{id}")
public class B_exportacionController extends AbstractObjectController<B_exportacion> {
    public B_exportacionController() {
        super(B_exportacion.class);
    }
}