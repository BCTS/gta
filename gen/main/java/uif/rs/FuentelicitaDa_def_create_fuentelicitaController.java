package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.FuentelicitaDa_def_create_fuentelicitaInput;


@Controller(value = "uif.rs.FuentelicitaDa_def_create_fuentelicitaController")
@RequestMapping(value = "/application/uif_fuentelicitas", method = RequestMethod.POST, params = "type=uif_da_def_create_fuentelicita")
public class FuentelicitaDa_def_create_fuentelicitaController extends AbstractObjectCreateController<FuentelicitaDa_def_create_fuentelicitaInput> {
    public FuentelicitaDa_def_create_fuentelicitaController() {
        super(FuentelicitaDa_def_create_fuentelicitaInput.class);
    }
}