package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectRelationViewController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.r_inv_financiamien.F_involucradoSourceRelation;


@Controller(value = "uif.rs.R_inv_financiamienF_involucradoFinanciamientoRelationViewController")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/Financiamiento")
public class R_inv_financiamienF_involucradoFinanciamientoRelationViewController extends AbstractObjectRelationViewController<F_involucradoSourceRelation> {
    public R_inv_financiamienF_involucradoFinanciamientoRelationViewController() {
        super(F_involucradoSourceRelation.class, "Financiamiento");
    }
}