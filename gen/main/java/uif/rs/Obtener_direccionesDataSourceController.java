package uif.rs;

import com.emc.xcp.services.datasource.domain.Query;
import com.emc.xcp.services.datasource.realtime.rs.RealtimeController;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Obtener_direccionesDataSourceOutput;


@Controller(value = "uif.rs.Obtener_direccionesDataSourceController")
@RequestMapping(value = "/application/uif_b_direccions", params = "type=uif_obtener_direcciones")
public class Obtener_direccionesDataSourceController extends RealtimeController<Obtener_direccionesDataSourceOutput> {
    public Obtener_direccionesDataSourceController() {
        super(Obtener_direccionesDataSourceOutput.class);
    }

    public Query getQuery(){
        return query;
    }


    @Inject
    @Named(value = "uif_obtener_direcciones")
    private Query query;


}