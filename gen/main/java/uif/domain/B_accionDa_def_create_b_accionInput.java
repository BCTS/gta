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


@PersistentObject(type = "uif_b_accion")
@Linked(template = "/application/uif_b_accions")
@JsonPropertyOrder(alphabetic = true)
public class B_accionDa_def_create_b_accionInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "capital")
    private Double capital;

    @PersistentAttribute(name = "capital_origen_conocido")
    private Boolean capital_origen_conocido;

    @PersistentAttribute(name = "empresa")
    private String empresa;

    @PersistentAttribute(name = "moneda")
    private String moneda;

    @PersistentAttribute(name = "participacion_porcentaje")
    private Double participacion_porcentaje;

    @PersistentAttribute(name = "participacion_soles")
    private Double participacion_soles;

    @PersistentAttribute(name = "partida_registral")
    private String partida_registral;

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

    public Double getCapital(){
        return capital;
    }

    public void setCapital(Double capital){
        this.capital = capital;
    }

    public Boolean getCapital_origen_conocido(){
        return capital_origen_conocido;
    }

    public void setCapital_origen_conocido(Boolean capital_origen_conocido){
        this.capital_origen_conocido = capital_origen_conocido;
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

    public String getPartida_registral(){
        return partida_registral;
    }

    public void setPartida_registral(String partida_registral){
        this.partida_registral = partida_registral;
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