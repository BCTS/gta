package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_financiamienDa_def_update_r_inv_financiamienInput;


@Controller(value = "uif.rs.R_inv_financiamienDa_def_update_r_inv_financiamienController")
@RequestMapping(value = "/application/relationships/uif_r_inv_financiamiens/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_financiamien")
public class R_inv_financiamienDa_def_update_r_inv_financiamienController extends AbstractObjectUpdateController<R_inv_financiamienDa_def_update_r_inv_financiamienInput> {
    public R_inv_financiamienDa_def_update_r_inv_financiamienController() {
        super(R_inv_financiamienDa_def_update_r_inv_financiamienInput.class);
    }
}