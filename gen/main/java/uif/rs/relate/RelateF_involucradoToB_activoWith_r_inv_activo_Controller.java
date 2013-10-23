package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_activo.B_activoTargetRelation;
import uif.domain.r_inv_activo.F_involucradoSourceRelation;
import uif.domain.r_inv_activo.F_involucradoToB_activoAssociation;
import uif.domain.r_inv_activo.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_activoWith_r_inv_activo_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_activos", method = RequestMethod.POST, params = "type=r_inv_activo")
public class RelateF_involucradoToB_activoWith_r_inv_activo_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_activoTargetRelation,F_involucradoToB_activoAssociation,RelationshipInput> {
    public RelateF_involucradoToB_activoWith_r_inv_activo_Controller() {
        super(F_involucradoSourceRelation.class,B_activoTargetRelation.class,F_involucradoToB_activoAssociation.class);
    }
}