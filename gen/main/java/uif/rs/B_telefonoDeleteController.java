package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_telefonoDeleteInput;


@Controller(value = "uif.rs.B_telefonoDeleteController")
@RequestMapping(value = "/application/uif_b_telefonos/{id}", method = RequestMethod.DELETE)
public class B_telefonoDeleteController extends AbstractObjectDeleteController<B_telefonoDeleteInput> {
    public B_telefonoDeleteController() {
        super(B_telefonoDeleteInput.class);
    }
}