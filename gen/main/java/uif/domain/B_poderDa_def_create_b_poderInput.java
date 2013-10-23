package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_b_poder")
@Linked(template = "/application/uif_b_poders")
@JsonPropertyOrder(alphabetic = true)
public class B_poderDa_def_create_b_poderInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "fecha_poder")
    private Date fecha_poder;

    @PersistentAttribute(name = "motivo")
    private String motivo;

    @PersistentAttribute(name = "otorgado_a")
    private String otorgado_a;

    @PersistentAttribute(name = "partida_registral")
    private String partida_registral;

    @PersistentAttribute(name = "recibido_de")
    private String recibido_de;

    @PersistentAttribute(name = "tipo_poder")
    private String tipo_poder;

    @PersistentAttribute(name = "object_name")
    private String object_name;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public List<String> getEffectivePermissions(){
        return effectivePermissions;
    }

    public void setEffectivePermissions(List<String> effectivePermissions){
        this.effectivePermissions = effectivePermissions;
    }

    public Date getFecha_poder(){
        return fecha_poder;
    }

    public void setFecha_poder(Date fecha_poder){
        this.fecha_poder = fecha_poder;
    }

    public String getMotivo(){
        return motivo;
    }

    public void setMotivo(String motivo){
        this.motivo = motivo;
    }

    public String getOtorgado_a(){
        return otorgado_a;
    }

    public void setOtorgado_a(String otorgado_a){
        this.otorgado_a = otorgado_a;
    }

    public String getPartida_registral(){
        return partida_registral;
    }

    public void setPartida_registral(String partida_registral){
        this.partida_registral = partida_registral;
    }

    public String getRecibido_de(){
        return recibido_de;
    }

    public void setRecibido_de(String recibido_de){
        this.recibido_de = recibido_de;
    }

    public String getTipo_poder(){
        return tipo_poder;
    }

    public void setTipo_poder(String tipo_poder){
        this.tipo_poder = tipo_poder;
    }

    public String getObject_name(){
        return object_name;
    }

    public void setObject_name(String object_name){
        this.object_name = object_name;
    }

    @JsonProperty
    public Map<String, Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String, Object> linkSource){
    }
}