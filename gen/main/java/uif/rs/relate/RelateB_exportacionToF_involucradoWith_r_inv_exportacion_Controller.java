package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_exportacion.B_exportacionTargetRelation;
import uif.domain.r_inv_exportacion.F_involucradoSourceRelation;
import uif.domain.r_inv_exportacion.F_involucradoToB_exportacionAssociation;
import uif.domain.r_inv_exportacion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_exportacionToF_involucradoWith_r_inv_exportacion_Controller")
@RequestMapping(value = "/application/uif_b_exportacions/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_exportacion")
public class RelateB_exportacionToF_involucradoWith_r_inv_exportacion_Controller extends AbstractRelationshipCreateController<B_exportacionTargetRelation,F_involucradoSourceRelation,F_involucradoToB_exportacionAssociation,RelationshipInput> {
    public RelateB_exportacionToF_involucradoWith_r_inv_exportacion_Controller() {
        super(B_exportacionTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_exportacionAssociation.class);
    }
}