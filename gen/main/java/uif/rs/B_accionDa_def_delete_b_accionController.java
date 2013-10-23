package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_accionDa_def_delete_b_accionInput;


@Controller(value = "uif.rs.B_accionDa_def_delete_b_accionController")
@RequestMapping(value = "/application/uif_b_accions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_accion")
public class B_accionDa_def_delete_b_accionController extends AbstractObjectDeleteController<B_accionDa_def_delete_b_accionInput> {
    public B_accionDa_def_delete_b_accionController() {
        super(B_accionDa_def_delete_b_accionInput.class);
    }
}