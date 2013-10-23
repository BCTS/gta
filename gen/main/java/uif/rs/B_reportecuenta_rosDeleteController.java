package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_reportecuenta_rosDeleteInput;


@Controller(value = "uif.rs.B_reportecuenta_rosDeleteController")
@RequestMapping(value = "/application/uif_b_reportecuenta_ross/{id}", method = RequestMethod.DELETE)
public class B_reportecuenta_rosDeleteController extends AbstractObjectDeleteController<B_reportecuenta_rosDeleteInput> {
    public B_reportecuenta_rosDeleteController() {
        super(B_reportecuenta_rosDeleteInput.class);
    }
}