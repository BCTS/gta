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


@PersistentObject(type = "uif_b_accion")
@Linked(template = "/application/uif_b_accions")
@JsonPropertyOrder(alphabetic = true)
public class B_accionDeleteInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "partida_registral")
    private String partida_registral;

    @PersistentAttribute(name = "empresa")
    private String empresa;

    @PersistentAttribute(name = "moneda")
    private String moneda;

    @PersistentAttribute(name = "capital")
    private Double capital;

    @PersistentAttribute(name = "participacion_porcentaje")
    private Double participacion_porcentaje;

    @PersistentAttribute(name = "participacion_soles")
    private Double participacion_soles;

    @PersistentAttribute(name = "capital_origen_conocido")
    private Boolean capital_origen_conocido;

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

    public String getPartida_registral(){
        return partida_registral;
    }

    public void setPartida_registral(String partida_registral){
        this.partida_registral = partida_registral;
    }

    public String getEmpresa(){
        return empresa;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda = moneda;
    }

    public Double getCapital(){
        return capital;
    }

    public void setCapital(Double capital){
        this.capital = capital;
    }

    public Double getParticipacion_porcentaje(){
        return participacion_porcentaje;
    }

    public void setParticipacion_porcentaje(Double participacion_porcentaje){
        this.participacion_porcentaje = participacion_porcentaje;
    }

    public Double getParticipacion_soles(){
        return participacion_soles;
    }

    public void setParticipacion_soles(Double participacion_soles){
        this.participacion_soles = participacion_soles;
    }

    public Boolean getCapital_origen_conocido(){
        return capital_origen_conocido;
    }

    public void setCapital_origen_conocido(Boolean capital_origen_conocido){
        this.capital_origen_conocido = capital_origen_conocido;
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
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}