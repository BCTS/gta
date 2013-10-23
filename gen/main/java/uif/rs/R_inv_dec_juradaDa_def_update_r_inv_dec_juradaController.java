package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_dec_juradaDa_def_update_r_inv_dec_juradaInput;


@Controller(value = "uif.rs.R_inv_dec_juradaDa_def_update_r_inv_dec_juradaController")
@RequestMapping(value = "/application/relationships/uif_r_inv_dec_juradas/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_dec_jurada")
public class R_inv_dec_juradaDa_def_update_r_inv_dec_juradaController extends AbstractObjectUpdateController<R_inv_dec_juradaDa_def_update_r_inv_dec_juradaInput> {
    public R_inv_dec_juradaDa_def_update_r_inv_dec_juradaController() {
        super(R_inv_dec_juradaDa_def_update_r_inv_dec_juradaInput.class);
    }
}