package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_b_viaje")
@Linked(template = "/application/uif_b_viajes")
@JsonPropertyOrder(alphabetic = true)
public class B_viajeDa_def_update_b_viajeInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "anho")
    private Integer anho;

    @PersistentAttribute(name = "cantidad")
    private Integer cantidad;

    @PersistentAttribute(name = "pais_destino")
    private String pais_destino;

    @PersistentAttribute(name = "tipo_movimiento")
    private String tipo_movimiento;

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

    public Integer getAnho(){
        return anho;
    }

    public void setAnho(Integer anho){
        this.anho = anho;
    }

    public Integer getCantidad(){
        return cantidad;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    public String getPais_destino(){
        return pais_destino;
    }

    public void setPais_destino(String pais_destino){
        this.pais_destino = pais_destino;
    }

    public String getTipo_movimiento(){
        return tipo_movimiento;
    }

    public void setTipo_movimiento(String tipo_movimiento){
        this.tipo_movimiento = tipo_movimiento;
    }

    public String getObject_name(){
        return object_name;
    }

    public void setObject_name(String object_name){
        this.object_name = object_name;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}