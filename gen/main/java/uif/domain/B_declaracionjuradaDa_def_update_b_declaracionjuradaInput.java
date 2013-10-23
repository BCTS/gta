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


@PersistentObject(type = "uif_b_declaracionjurada")
@Linked(template = "/application/uif_b_declaracionjuradas")
@JsonPropertyOrder(alphabetic = true)
public class B_declaracionjuradaDa_def_update_b_declaracionjuradaInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "anho")
    private Integer anho;

    @PersistentAttribute(name = "importe")
    private Double importe;

    @PersistentAttribute(name = "tipo_renta")
    private String tipo_renta;

    @PersistentAttribute(name = "utilidad")
    private Double utilidad;

    @PersistentAttribute(name = "ventas")
    private Double ventas;

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

    public Double getImporte(){
        return importe;
    }

    public void setImporte(Double importe){
        this.importe = importe;
    }

    public String getTipo_renta(){
        return tipo_renta;
    }

    public void setTipo_renta(String tipo_renta){
        this.tipo_renta = tipo_renta;
    }

    public Double getUtilidad(){
        return utilidad;
    }

    public void setUtilidad(Double utilidad){
        this.utilidad = utilidad;
    }

    public Double getVentas(){
        return ventas;
    }

    public void setVentas(Double ventas){
        this.ventas = ventas;
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