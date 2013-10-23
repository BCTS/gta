package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.B_direccionTargetRelation;
import uif.domain.r_inv_direccion.F_involucradoSourceRelation;
import uif.domain.r_inv_direccion.F_involucradoToB_direccionAssociation;
import uif.domain.r_inv_direccion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_direccionToF_involucradoWith_r_inv_direccion_Controller")
@RequestMapping(value = "/application/uif_b_direccions/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_direccion")
public class RelateB_direccionToF_involucradoWith_r_inv_direccion_Controller extends AbstractRelationshipCreateController<B_direccionTargetRelation,F_involucradoSourceRelation,F_involucradoToB_direccionAssociation,RelationshipInput> {
    public RelateB_direccionToF_involucradoWith_r_inv_direccion_Controller() {
        super(B_direccionTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_direccionAssociation.class);
    }
}