package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_importacion.B_importacionTargetRelation;
import uif.domain.r_inv_importacion.F_involucradoSourceRelation;
import uif.domain.r_inv_importacion.F_involucradoToB_importacionAssociation;
import uif.domain.r_inv_importacion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_importacionToF_involucradoWith_r_inv_importacion_Controller")
@RequestMapping(value = "/application/uif_b_importacions/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_importacion")
public class RelateB_importacionToF_involucradoWith_r_inv_importacion_Controller extends AbstractRelationshipCreateController<B_importacionTargetRelation,F_involucradoSourceRelation,F_involucradoToB_importacionAssociation,RelationshipInput> {
    public RelateB_importacionToF_involucradoWith_r_inv_importacion_Controller() {
        super(B_importacionTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_importacionAssociation.class);
    }
}