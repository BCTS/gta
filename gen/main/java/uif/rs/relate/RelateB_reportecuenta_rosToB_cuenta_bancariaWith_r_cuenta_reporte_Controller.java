package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_cuenta_reporte.B_cuenta_bancariaSourceRelation;
import uif.domain.r_cuenta_reporte.B_cuenta_bancariaToB_reportecuenta_rosAssociation;
import uif.domain.r_cuenta_reporte.B_reportecuenta_rosTargetRelation;
import uif.domain.r_cuenta_reporte.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_reportecuenta_rosToB_cuenta_bancariaWith_r_cuenta_reporte_Controller")
@RequestMapping(value = "/application/uif_b_reportecuenta_ross/{id}/b_cuenta_bancarias", method = RequestMethod.POST, params = "type=r_cuenta_reporte")
public class RelateB_reportecuenta_rosToB_cuenta_bancariaWith_r_cuenta_reporte_Controller extends AbstractRelationshipCreateController<B_reportecuenta_rosTargetRelation,B_cuenta_bancariaSourceRelation,B_cuenta_bancariaToB_reportecuenta_rosAssociation,RelationshipInput> {
    public RelateB_reportecuenta_rosToB_cuenta_bancariaWith_r_cuenta_reporte_Controller() {
        super(B_reportecuenta_rosTargetRelation.class,B_cuenta_bancariaSourceRelation.class,B_cuenta_bancariaToB_reportecuenta_rosAssociation.class);
    }
}