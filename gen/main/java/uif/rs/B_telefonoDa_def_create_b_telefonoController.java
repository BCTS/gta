package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_telefonoDa_def_create_b_telefonoInput;


@Controller(value = "uif.rs.B_telefonoDa_def_create_b_telefonoController")
@RequestMapping(value = "/application/uif_b_telefonos", method = RequestMethod.POST, params = "type=uif_da_def_create_b_telefono")
public class B_telefonoDa_def_create_b_telefonoController extends AbstractObjectCreateController<B_telefonoDa_def_create_b_telefonoInput> {
    public B_telefonoDa_def_create_b_telefonoController() {
        super(B_telefonoDa_def_create_b_telefonoInput.class);
    }
}