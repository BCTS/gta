package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_reportecuenta_ros;


@Controller(value = "uif.rs.B_reportecuenta_rosController")
@RequestMapping(value = "/application/uif_b_reportecuenta_ross/{id}")
public class B_reportecuenta_rosController extends AbstractObjectController<B_reportecuenta_ros> {
    public B_reportecuenta_rosController() {
        super(B_reportecuenta_ros.class);
    }
}