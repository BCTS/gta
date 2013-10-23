package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_declaracionjuradaDa_def_delete_b_declaracionjuradaInput;


@Controller(value = "uif.rs.B_declaracionjuradaDa_def_delete_b_declaracionjuradaController")
@RequestMapping(value = "/application/uif_b_declaracionjuradas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_declaracionjurada")
public class B_declaracionjuradaDa_def_delete_b_declaracionjuradaController extends AbstractObjectDeleteController<B_declaracionjuradaDa_def_delete_b_declaracionjuradaInput> {
    public B_declaracionjuradaDa_def_delete_b_declaracionjuradaController() {
        super(B_declaracionjuradaDa_def_delete_b_declaracionjuradaInput.class);
    }
}