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


@PersistentObject(type = "uif_b_financiamiento")
@Linked(template = "/application/uif_b_financiamientos")
@JsonPropertyOrder(alphabetic = true)
public class B_financiamientoDa_def_update_b_financiamientoInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "calificacion")
    private String calificacion;

    @PersistentAttribute(name = "entidad")
    private String entidad;

    @PersistentAttribute(name = "garantia")
    private Double garantia;

    @PersistentAttribute(name = "importe")
    private Double importe;

    @PersistentAttribute(name = "moneda")
    private String moneda;

    @PersistentAttribute(name = "tipo_credito")
    private String tipo_credito;

    @PersistentAttribute(name = "tipo_garantia")
    private String tipo_garantia;

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

    public String getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(String calificacion){
        this.calificacion = calificacion;
    }

    public String getEntidad(){
        return entidad;
    }

    public void setEntidad(String entidad){
        this.entidad = entidad;
    }

    public Double getGarantia(){
        return garantia;
    }

    public void setGarantia(Double garantia){
        this.garantia = garantia;
    }

    public Double getImporte(){
        return importe;
    }

    public void setImporte(Double importe){
        this.importe = importe;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda = moneda;
    }

    public String getTipo_credito(){
        return tipo_credito;
    }

    public void setTipo_credito(String tipo_credito){
        this.tipo_credito = tipo_credito;
    }

    public String getTipo_garantia(){
        return tipo_garantia;
    }

    public void setTipo_garantia(String tipo_garantia){
        this.tipo_garantia = tipo_garantia;
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