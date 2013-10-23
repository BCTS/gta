package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_activoDa_def_update_b_activoInput;


@Controller(value = "uif.rs.B_activoDa_def_update_b_activoController")
@RequestMapping(value = "/application/uif_b_activos/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_b_activo")
public class B_activoDa_def_update_b_activoController extends AbstractObjectUpdateController<B_activoDa_def_update_b_activoInput> {
    public B_activoDa_def_update_b_activoController() {
        super(B_activoDa_def_update_b_activoInput.class);
    }
}