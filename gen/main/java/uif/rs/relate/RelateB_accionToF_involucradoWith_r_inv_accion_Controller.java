package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_accion.B_accionTargetRelation;
import uif.domain.r_inv_accion.F_involucradoSourceRelation;
import uif.domain.r_inv_accion.F_involucradoToB_accionAssociation;
import uif.domain.r_inv_accion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_accionToF_involucradoWith_r_inv_accion_Controller")
@RequestMapping(value = "/application/uif_b_accions/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_accion")
public class RelateB_accionToF_involucradoWith_r_inv_accion_Controller extends AbstractRelationshipCreateController<B_accionTargetRelation,F_involucradoSourceRelation,F_involucradoToB_accionAssociation,RelationshipInput> {
    public RelateB_accionToF_involucradoWith_r_inv_accion_Controller() {
        super(B_accionTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_accionAssociation.class);
    }
}