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
import javax.persistence.ElementCollection;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_b_financiamiento")
@Linked(template = "/application/uif_b_financiamientos")
@JsonPropertyOrder(alphabetic = true)
public class B_financiamientoDeleteInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "entidad")
    private String entidad;

    @PersistentAttribute(name = "tipo_credito")
    private String tipo_credito;

    @PersistentAttribute(name = "moneda")
    private String moneda;

    @PersistentAttribute(name = "importe")
    private Double importe;

    @PersistentAttribute(name = "calificacion")
    private String calificacion;

    @PersistentAttribute(name = "tipo_garantia")
    private String tipo_garantia;

    @PersistentAttribute(name = "garantia")
    private Double garantia;

    @PersistentAttribute(name = "i_folder_id")
    @ElementCollection(targetClass = String.class)
    private List<String> i_folder_id;

    @PersistentAttribute(name = "r_creation_date")
    private Date r_creation_date;

    @PersistentAttribute(name = "r_creator_name")
    private String r_creator_name;

    @PersistentAttribute(name = "r_modify_date")
    private Date r_modify_date;

    @PersistentAttribute(name = "r_modifier")
    private String r_modifier;

    @PersistentAttribute(name = "r_object_type")
    private String r_object_type;

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

    public String getEntidad(){
        return entidad;
    }

    public void setEntidad(String entidad){
        this.entidad = entidad;
    }

    public String getTipo_credito(){
        return tipo_credito;
    }

    public void setTipo_credito(String tipo_credito){
        this.tipo_credito = tipo_credito;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda = moneda;
    }

    public Double getImporte(){
        return importe;
    }

    public void setImporte(Double importe){
        this.importe = importe;
    }

    public String getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(String calificacion){
        this.calificacion = calificacion;
    }

    public String getTipo_garantia(){
        return tipo_garantia;
    }

    public void setTipo_garantia(String tipo_garantia){
        this.tipo_garantia = tipo_garantia;
    }

    public Double getGarantia(){
        return garantia;
    }

    public void setGarantia(Double garantia){
        this.garantia = garantia;
    }

    public List<String> getI_folder_id(){
        return i_folder_id;
    }

    public void setI_folder_id(List<String> i_folder_id){
        this.i_folder_id = i_folder_id;
    }

    public Date getR_creation_date(){
        return r_creation_date;
    }

    public void setR_creation_date(Date r_creation_date){
        this.r_creation_date = r_creation_date;
    }

    public String getR_creator_name(){
        return r_creator_name;
    }

    public void setR_creator_name(String r_creator_name){
        this.r_creator_name = r_creator_name;
    }

    public Date getR_modify_date(){
        return r_modify_date;
    }

    public void setR_modify_date(Date r_modify_date){
        this.r_modify_date = r_modify_date;
    }

    public String getR_modifier(){
        return r_modifier;
    }

    public void setR_modifier(String r_modifier){
        this.r_modifier = r_modifier;
    }

    public String getR_object_type(){
        return r_object_type;
    }

    public void setR_object_type(String r_object_type){
        this.r_object_type = r_object_type;
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