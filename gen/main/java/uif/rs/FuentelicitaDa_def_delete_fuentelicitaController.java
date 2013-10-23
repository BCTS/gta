package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.FuentelicitaDa_def_delete_fuentelicitaInput;


@Controller(value = "uif.rs.FuentelicitaDa_def_delete_fuentelicitaController")
@RequestMapping(value = "/application/uif_fuentelicitas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_fuentelicita")
public class FuentelicitaDa_def_delete_fuentelicitaController extends AbstractObjectDeleteController<FuentelicitaDa_def_delete_fuentelicitaInput> {
    public FuentelicitaDa_def_delete_fuentelicitaController() {
        super(FuentelicitaDa_def_delete_fuentelicitaInput.class);
    }
}