package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_importacion;


@Controller(value = "uif.rs.B_importacionController")
@RequestMapping(value = "/application/uif_b_importacions/{id}")
public class B_importacionController extends AbstractObjectController<B_importacion> {
    public B_importacionController() {
        super(B_importacion.class);
    }
}