package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_id.B_identificacionTargetRelation;
import uif.domain.r_inv_id.F_involucradoSourceRelation;
import uif.domain.r_inv_id.F_involucradoToB_identificacionAssociation;
import uif.domain.r_inv_id.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_identificacionToF_involucradoWith_r_inv_id_Controller")
@RequestMapping(value = "/application/uif_b_identificacions/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_id")
public class RelateB_identificacionToF_involucradoWith_r_inv_id_Controller extends AbstractRelationshipCreateController<B_identificacionTargetRelation,F_involucradoSourceRelation,F_involucradoToB_identificacionAssociation,RelationshipInput> {
    public RelateB_identificacionToF_involucradoWith_r_inv_id_Controller() {
        super(B_identificacionTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_identificacionAssociation.class);
    }
}