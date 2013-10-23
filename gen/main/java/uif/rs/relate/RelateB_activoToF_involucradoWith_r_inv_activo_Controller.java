package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_activo.B_activoTargetRelation;
import uif.domain.r_inv_activo.F_involucradoSourceRelation;
import uif.domain.r_inv_activo.F_involucradoToB_activoAssociation;
import uif.domain.r_inv_activo.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_activoToF_involucradoWith_r_inv_activo_Controller")
@RequestMapping(value = "/application/uif_b_activos/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_activo")
public class RelateB_activoToF_involucradoWith_r_inv_activo_Controller extends AbstractRelationshipCreateController<B_activoTargetRelation,F_involucradoSourceRelation,F_involucradoToB_activoAssociation,RelationshipInput> {
    public RelateB_activoToF_involucradoWith_r_inv_activo_Controller() {
        super(B_activoTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_activoAssociation.class);
    }
}