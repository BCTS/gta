package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_dec_jurada.F_involucradoToB_declaracionjuradaAssociation;


@Controller(value = "uif.rs.R_inv_dec_juradaDa_def_delete_r_inv_dec_juradaController")
@RequestMapping(value = "/application/relationships/uif_r_inv_dec_juradas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_dec_jurada")
public class R_inv_dec_juradaDa_def_delete_r_inv_dec_juradaController extends AbstractObjectDeleteController<F_involucradoToB_declaracionjuradaAssociation> {
    public R_inv_dec_juradaDa_def_delete_r_inv_dec_juradaController() {
        super(F_involucradoToB_declaracionjuradaAssociation.class);
    }
}