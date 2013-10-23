package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_accionDa_def_update_b_accionInput;


@Controller(value = "uif.rs.B_accionDa_def_update_b_accionInputController")
@RequestMapping(value = "/application/uif_b_accions/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_accion")
public class B_accionDa_def_update_b_accionInputController extends AbstractObjectController<B_accionDa_def_update_b_accionInput> {
    public B_accionDa_def_update_b_accionInputController() {
        super(B_accionDa_def_update_b_accionInput.class);
    }
}