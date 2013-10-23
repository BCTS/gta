package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_accion.B_accionTargetRelation;
import uif.domain.r_inv_accion.F_involucradoSourceRelation;
import uif.domain.r_inv_accion.F_involucradoToB_accionAssociation;
import uif.domain.r_inv_accion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_accionWith_r_inv_accion_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_accions", method = RequestMethod.POST, params = "type=r_inv_accion")
public class RelateF_involucradoToB_accionWith_r_inv_accion_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_accionTargetRelation,F_involucradoToB_accionAssociation,RelationshipInput> {
    public RelateF_involucradoToB_accionWith_r_inv_accion_Controller() {
        super(F_involucradoSourceRelation.class,B_accionTargetRelation.class,F_involucradoToB_accionAssociation.class);
    }
}