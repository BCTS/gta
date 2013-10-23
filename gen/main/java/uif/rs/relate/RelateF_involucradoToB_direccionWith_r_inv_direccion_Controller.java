package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_direccion.B_direccionTargetRelation;
import uif.domain.r_inv_direccion.F_involucradoSourceRelation;
import uif.domain.r_inv_direccion.F_involucradoToB_direccionAssociation;
import uif.domain.r_inv_direccion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_direccionWith_r_inv_direccion_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_direccions", method = RequestMethod.POST, params = "type=r_inv_direccion")
public class RelateF_involucradoToB_direccionWith_r_inv_direccion_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_direccionTargetRelation,F_involucradoToB_direccionAssociation,RelationshipInput> {
    public RelateF_involucradoToB_direccionWith_r_inv_direccion_Controller() {
        super(F_involucradoSourceRelation.class,B_direccionTargetRelation.class,F_involucradoToB_direccionAssociation.class);
    }
}