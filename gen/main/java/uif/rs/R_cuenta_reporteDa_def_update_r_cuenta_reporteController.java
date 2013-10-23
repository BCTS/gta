package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_cuenta_reporteDa_def_update_r_cuenta_reporteInput;


@Controller(value = "uif.rs.R_cuenta_reporteDa_def_update_r_cuenta_reporteController")
@RequestMapping(value = "/application/relationships/uif_r_cuenta_reportes/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_cuenta_reporte")
public class R_cuenta_reporteDa_def_update_r_cuenta_reporteController extends AbstractObjectUpdateController<R_cuenta_reporteDa_def_update_r_cuenta_reporteInput> {
    public R_cuenta_reporteDa_def_update_r_cuenta_reporteController() {
        super(R_cuenta_reporteDa_def_update_r_cuenta_reporteInput.class);
    }
}