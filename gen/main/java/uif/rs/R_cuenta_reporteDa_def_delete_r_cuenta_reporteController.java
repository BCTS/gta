package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_cuenta_reporte.B_cuenta_bancariaToB_reportecuenta_rosAssociation;


@Controller(value = "uif.rs.R_cuenta_reporteDa_def_delete_r_cuenta_reporteController")
@RequestMapping(value = "/application/relationships/uif_r_cuenta_reportes/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_cuenta_reporte")
public class R_cuenta_reporteDa_def_delete_r_cuenta_reporteController extends AbstractObjectDeleteController<B_cuenta_bancariaToB_reportecuenta_rosAssociation> {
    public R_cuenta_reporteDa_def_delete_r_cuenta_reporteController() {
        super(B_cuenta_bancariaToB_reportecuenta_rosAssociation.class);
    }
}