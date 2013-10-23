package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_activoDa_def_delete_b_activoInput;


@Controller(value = "uif.rs.B_activoDa_def_delete_b_activoController")
@RequestMapping(value = "/application/uif_b_activos/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_activo")
public class B_activoDa_def_delete_b_activoController extends AbstractObjectDeleteController<B_activoDa_def_delete_b_activoInput> {
    public B_activoDa_def_delete_b_activoController() {
        super(B_activoDa_def_delete_b_activoInput.class);
    }
}