package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_telefonoDa_def_update_b_telefonoInput;


@Controller(value = "uif.rs.B_telefonoDa_def_update_b_telefonoInputController")
@RequestMapping(value = "/application/uif_b_telefonos/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_telefono")
public class B_telefonoDa_def_update_b_telefonoInputController extends AbstractObjectController<B_telefonoDa_def_update_b_telefonoInput> {
    public B_telefonoDa_def_update_b_telefonoInputController() {
        super(B_telefonoDa_def_update_b_telefonoInput.class);
    }
}