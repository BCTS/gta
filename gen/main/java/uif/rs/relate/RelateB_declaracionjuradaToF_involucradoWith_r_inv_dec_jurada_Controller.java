package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_dec_jurada.B_declaracionjuradaTargetRelation;
import uif.domain.r_inv_dec_jurada.F_involucradoSourceRelation;
import uif.domain.r_inv_dec_jurada.F_involucradoToB_declaracionjuradaAssociation;
import uif.domain.r_inv_dec_jurada.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_declaracionjuradaToF_involucradoWith_r_inv_dec_jurada_Controller")
@RequestMapping(value = "/application/uif_b_declaracionjuradas/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_dec_jurada")
public class RelateB_declaracionjuradaToF_involucradoWith_r_inv_dec_jurada_Controller extends AbstractRelationshipCreateController<B_declaracionjuradaTargetRelation,F_involucradoSourceRelation,F_involucradoToB_declaracionjuradaAssociation,RelationshipInput> {
    public RelateB_declaracionjuradaToF_involucradoWith_r_inv_dec_jurada_Controller() {
        super(B_declaracionjuradaTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_declaracionjuradaAssociation.class);
    }
}