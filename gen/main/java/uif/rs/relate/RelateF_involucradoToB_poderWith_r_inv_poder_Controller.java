package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_poder.B_poderTargetRelation;
import uif.domain.r_inv_poder.F_involucradoSourceRelation;
import uif.domain.r_inv_poder.F_involucradoToB_poderAssociation;
import uif.domain.r_inv_poder.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_poderWith_r_inv_poder_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_poders", method = RequestMethod.POST, params = "type=r_inv_poder")
public class RelateF_involucradoToB_poderWith_r_inv_poder_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_poderTargetRelation,F_involucradoToB_poderAssociation,RelationshipInput> {
    public RelateF_involucradoToB_poderWith_r_inv_poder_Controller() {
        super(F_involucradoSourceRelation.class,B_poderTargetRelation.class,F_involucradoToB_poderAssociation.class);
    }
}