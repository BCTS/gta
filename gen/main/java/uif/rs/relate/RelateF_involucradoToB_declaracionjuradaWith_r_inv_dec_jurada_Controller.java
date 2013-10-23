package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_dec_jurada.B_declaracionjuradaTargetRelation;
import uif.domain.r_inv_dec_jurada.F_involucradoSourceRelation;
import uif.domain.r_inv_dec_jurada.F_involucradoToB_declaracionjuradaAssociation;
import uif.domain.r_inv_dec_jurada.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_declaracionjuradaWith_r_inv_dec_jurada_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_declaracionjuradas", method = RequestMethod.POST, params = "type=r_inv_dec_jurada")
public class RelateF_involucradoToB_declaracionjuradaWith_r_inv_dec_jurada_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_declaracionjuradaTargetRelation,F_involucradoToB_declaracionjuradaAssociation,RelationshipInput> {
    public RelateF_involucradoToB_declaracionjuradaWith_r_inv_dec_jurada_Controller() {
        super(F_involucradoSourceRelation.class,B_declaracionjuradaTargetRelation.class,F_involucradoToB_declaracionjuradaAssociation.class);
    }
}