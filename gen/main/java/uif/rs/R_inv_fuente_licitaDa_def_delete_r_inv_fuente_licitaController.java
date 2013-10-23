package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_fuente_licita.F_involucradoToFuentelicitaAssociation;


@Controller(value = "uif.rs.R_inv_fuente_licitaDa_def_delete_r_inv_fuente_licitaController")
@RequestMapping(value = "/application/relationships/uif_r_inv_fuente_licitas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_fuente_licita")
public class R_inv_fuente_licitaDa_def_delete_r_inv_fuente_licitaController extends AbstractObjectDeleteController<F_involucradoToFuentelicitaAssociation> {
    public R_inv_fuente_licitaDa_def_delete_r_inv_fuente_licitaController() {
        super(F_involucradoToFuentelicitaAssociation.class);
    }
}