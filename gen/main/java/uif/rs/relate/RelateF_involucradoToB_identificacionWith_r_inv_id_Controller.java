package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_id.B_identificacionTargetRelation;
import uif.domain.r_inv_id.F_involucradoSourceRelation;
import uif.domain.r_inv_id.F_involucradoToB_identificacionAssociation;
import uif.domain.r_inv_id.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_identificacionWith_r_inv_id_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_identificacions", method = RequestMethod.POST, params = "type=r_inv_id")
public class RelateF_involucradoToB_identificacionWith_r_inv_id_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_identificacionTargetRelation,F_involucradoToB_identificacionAssociation,RelationshipInput> {
    public RelateF_involucradoToB_identificacionWith_r_inv_id_Controller() {
        super(F_involucradoSourceRelation.class,B_identificacionTargetRelation.class,F_involucradoToB_identificacionAssociation.class);
    }
}