package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_viaje.F_involucradoToB_viajeAssociation;


@Controller(value = "uif.rs.R_inv_viajeDa_def_delete_r_inv_viajeController")
@RequestMapping(value = "/application/relationships/uif_r_inv_viajes/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_viaje")
public class R_inv_viajeDa_def_delete_r_inv_viajeController extends AbstractObjectDeleteController<F_involucradoToB_viajeAssociation> {
    public R_inv_viajeDa_def_delete_r_inv_viajeController() {
        super(F_involucradoToB_viajeAssociation.class);
    }
}