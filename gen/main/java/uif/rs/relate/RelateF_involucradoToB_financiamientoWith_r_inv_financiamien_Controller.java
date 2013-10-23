package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_financiamien.B_financiamientoTargetRelation;
import uif.domain.r_inv_financiamien.F_involucradoSourceRelation;
import uif.domain.r_inv_financiamien.F_involucradoToB_financiamientoAssociation;
import uif.domain.r_inv_financiamien.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_financiamientoWith_r_inv_financiamien_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_financiamientos", method = RequestMethod.POST, params = "type=r_inv_financiamien")
public class RelateF_involucradoToB_financiamientoWith_r_inv_financiamien_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_financiamientoTargetRelation,F_involucradoToB_financiamientoAssociation,RelationshipInput> {
    public RelateF_involucradoToB_financiamientoWith_r_inv_financiamien_Controller() {
        super(F_involucradoSourceRelation.class,B_financiamientoTargetRelation.class,F_involucradoToB_financiamientoAssociation.class);
    }
}