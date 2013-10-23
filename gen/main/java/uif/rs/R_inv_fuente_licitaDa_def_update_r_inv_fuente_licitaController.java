package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_fuente_licitaDa_def_update_r_inv_fuente_licitaInput;


@Controller(value = "uif.rs.R_inv_fuente_licitaDa_def_update_r_inv_fuente_licitaController")
@RequestMapping(value = "/application/relationships/uif_r_inv_fuente_licitas/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_fuente_licita")
public class R_inv_fuente_licitaDa_def_update_r_inv_fuente_licitaController extends AbstractObjectUpdateController<R_inv_fuente_licitaDa_def_update_r_inv_fuente_licitaInput> {
    public R_inv_fuente_licitaDa_def_update_r_inv_fuente_licitaController() {
        super(R_inv_fuente_licitaDa_def_update_r_inv_fuente_licitaInput.class);
    }
}