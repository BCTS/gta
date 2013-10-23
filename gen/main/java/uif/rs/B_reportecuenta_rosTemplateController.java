package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_reportecuenta_ros;


@Controller(value = "uif.rs.B_reportecuenta_rosTemplateController")
@RequestMapping(value = "/application/uif_b_reportecuenta_ross/template")
public class B_reportecuenta_rosTemplateController extends AbstractObjectTemplateController<B_reportecuenta_ros> {
    public B_reportecuenta_rosTemplateController() {
        super(B_reportecuenta_ros.class);
    }
}