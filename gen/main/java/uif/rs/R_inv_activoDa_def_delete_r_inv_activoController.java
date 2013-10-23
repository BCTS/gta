package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_activo.F_involucradoToB_activoAssociation;


@Controller(value = "uif.rs.R_inv_activoDa_def_delete_r_inv_activoController")
@RequestMapping(value = "/application/relationships/uif_r_inv_activos/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_activo")
public class R_inv_activoDa_def_delete_r_inv_activoController extends AbstractObjectDeleteController<F_involucradoToB_activoAssociation> {
    public R_inv_activoDa_def_delete_r_inv_activoController() {
        super(F_involucradoToB_activoAssociation.class);
    }
}