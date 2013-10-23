package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_activoDa_def_update_r_inv_activoInput;


@Controller(value = "uif.rs.R_inv_activoDa_def_update_r_inv_activoController")
@RequestMapping(value = "/application/relationships/uif_r_inv_activos/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_activo")
public class R_inv_activoDa_def_update_r_inv_activoController extends AbstractObjectUpdateController<R_inv_activoDa_def_update_r_inv_activoInput> {
    public R_inv_activoDa_def_update_r_inv_activoController() {
        super(R_inv_activoDa_def_update_r_inv_activoInput.class);
    }
}