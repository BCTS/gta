package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_poder.B_poderTargetRelation;
import uif.domain.r_inv_poder.F_involucradoSourceRelation;
import uif.domain.r_inv_poder.F_involucradoToB_poderAssociation;
import uif.domain.r_inv_poder.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_poderToF_involucradoWith_r_inv_poder_Controller")
@RequestMapping(value = "/application/uif_b_poders/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_poder")
public class RelateB_poderToF_involucradoWith_r_inv_poder_Controller extends AbstractRelationshipCreateController<B_poderTargetRelation,F_involucradoSourceRelation,F_involucradoToB_poderAssociation,RelationshipInput> {
    public RelateB_poderToF_involucradoWith_r_inv_poder_Controller() {
        super(B_poderTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_poderAssociation.class);
    }
}