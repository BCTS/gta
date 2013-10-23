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


@PersistentObject(type = "uif_b_reportecuenta_ros")
@Linked(template = "/application/uif_b_reportecuenta_ross")
@JsonPropertyOrder(alphabetic = true)
public class B_reportecuenta_rosDa_def_update_b_reportecuenta_rosInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "egresos")
    private Double egresos;

    @PersistentAttribute(name = "fecha_fin")
    private Date fecha_fin;

    @PersistentAttribute(name = "fecha_inicio")
    private Date fecha_inicio;

    @PersistentAttribute(name = "ingresos")
    private Double ingresos;

    @PersistentAttribute(name = "saldo")
    private Double saldo;

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

    public Double getEgresos(){
        return egresos;
    }

    public void setEgresos(Double egresos){
        this.egresos = egresos;
    }

    public Date getFecha_fin(){
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin){
        this.fecha_fin = fecha_fin;
    }

    public Date getFecha_inicio(){
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio){
        this.fecha_inicio = fecha_inicio;
    }

    public Double getIngresos(){
        return ingresos;
    }

    public void setIngresos(Double ingresos){
        this.ingresos = ingresos;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
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