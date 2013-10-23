package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_reportecuenta_rosDa_def_delete_b_reportecuenta_rosInput;


@Controller(value = "uif.rs.B_reportecuenta_rosDa_def_delete_b_reportecuenta_rosController")
@RequestMapping(value = "/application/uif_b_reportecuenta_ross/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_reportecuenta_ros")
public class B_reportecuenta_rosDa_def_delete_b_reportecuenta_rosController extends AbstractObjectDeleteController<B_reportecuenta_rosDa_def_delete_b_reportecuenta_rosInput> {
    public B_reportecuenta_rosDa_def_delete_b_reportecuenta_rosController() {
        super(B_reportecuenta_rosDa_def_delete_b_reportecuenta_rosInput.class);
    }
}