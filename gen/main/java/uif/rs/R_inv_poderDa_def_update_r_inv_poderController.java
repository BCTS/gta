package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_poderDa_def_update_r_inv_poderInput;


@Controller(value = "uif.rs.R_inv_poderDa_def_update_r_inv_poderController")
@RequestMapping(value = "/application/relationships/uif_r_inv_poders/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_poder")
public class R_inv_poderDa_def_update_r_inv_poderController extends AbstractObjectUpdateController<R_inv_poderDa_def_update_r_inv_poderInput> {
    public R_inv_poderDa_def_update_r_inv_poderController() {
        super(R_inv_poderDa_def_update_r_inv_poderInput.class);
    }
}