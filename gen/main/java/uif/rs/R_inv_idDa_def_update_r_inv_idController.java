package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_idDa_def_update_r_inv_idInput;


@Controller(value = "uif.rs.R_inv_idDa_def_update_r_inv_idController")
@RequestMapping(value = "/application/relationships/uif_r_inv_ids/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_id")
public class R_inv_idDa_def_update_r_inv_idController extends AbstractObjectUpdateController<R_inv_idDa_def_update_r_inv_idInput> {
    public R_inv_idDa_def_update_r_inv_idController() {
        super(R_inv_idDa_def_update_r_inv_idInput.class);
    }
}