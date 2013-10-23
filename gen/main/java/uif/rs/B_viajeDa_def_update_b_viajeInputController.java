package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_viajeDa_def_update_b_viajeInput;


@Controller(value = "uif.rs.B_viajeDa_def_update_b_viajeInputController")
@RequestMapping(value = "/application/uif_b_viajes/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_viaje")
public class B_viajeDa_def_update_b_viajeInputController extends AbstractObjectController<B_viajeDa_def_update_b_viajeInput> {
    public B_viajeDa_def_update_b_viajeInputController() {
        super(B_viajeDa_def_update_b_viajeInput.class);
    }
}