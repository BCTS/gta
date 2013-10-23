package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_telefonoDa_def_delete_b_telefonoInput;


@Controller(value = "uif.rs.B_telefonoDa_def_delete_b_telefonoController")
@RequestMapping(value = "/application/uif_b_telefonos/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_telefono")
public class B_telefonoDa_def_delete_b_telefonoController extends AbstractObjectDeleteController<B_telefonoDa_def_delete_b_telefonoInput> {
    public B_telefonoDa_def_delete_b_telefonoController() {
        super(B_telefonoDa_def_delete_b_telefonoInput.class);
    }
}