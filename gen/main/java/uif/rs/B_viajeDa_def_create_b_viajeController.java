package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_viajeDa_def_create_b_viajeInput;


@Controller(value = "uif.rs.B_viajeDa_def_create_b_viajeController")
@RequestMapping(value = "/application/uif_b_viajes", method = RequestMethod.POST, params = "type=uif_da_def_create_b_viaje")
public class B_viajeDa_def_create_b_viajeController extends AbstractObjectCreateController<B_viajeDa_def_create_b_viajeInput> {
    public B_viajeDa_def_create_b_viajeController() {
        super(B_viajeDa_def_create_b_viajeInput.class);
    }
}