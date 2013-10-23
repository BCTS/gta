package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.FuentelicitaDa_def_update_fuentelicitaInput;


@Controller(value = "uif.rs.FuentelicitaDa_def_update_fuentelicitaInputController")
@RequestMapping(value = "/application/uif_fuentelicitas/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_fuentelicita")
public class FuentelicitaDa_def_update_fuentelicitaInputController extends AbstractObjectController<FuentelicitaDa_def_update_fuentelicitaInput> {
    public FuentelicitaDa_def_update_fuentelicitaInputController() {
        super(FuentelicitaDa_def_update_fuentelicitaInput.class);
    }
}