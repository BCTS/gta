package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.FuentelicitaDeleteInput;


@Controller(value = "uif.rs.FuentelicitaDeleteController")
@RequestMapping(value = "/application/uif_fuentelicitas/{id}", method = RequestMethod.DELETE)
public class FuentelicitaDeleteController extends AbstractObjectDeleteController<FuentelicitaDeleteInput> {
    public FuentelicitaDeleteController() {
        super(FuentelicitaDeleteInput.class);
    }
}