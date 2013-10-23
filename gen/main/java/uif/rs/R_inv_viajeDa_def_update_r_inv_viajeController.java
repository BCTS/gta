package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_viajeDa_def_update_r_inv_viajeInput;


@Controller(value = "uif.rs.R_inv_viajeDa_def_update_r_inv_viajeController")
@RequestMapping(value = "/application/relationships/uif_r_inv_viajes/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_viaje")
public class R_inv_viajeDa_def_update_r_inv_viajeController extends AbstractObjectUpdateController<R_inv_viajeDa_def_update_r_inv_viajeInput> {
    public R_inv_viajeDa_def_update_r_inv_viajeController() {
        super(R_inv_viajeDa_def_update_r_inv_viajeInput.class);
    }
}