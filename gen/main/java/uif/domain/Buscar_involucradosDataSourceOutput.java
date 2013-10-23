package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.datasource.domain.MatchingTerms;
import com.emc.xcp.services.datasource.domain.Summary;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(superType = "dm_sysobject", type = "uif_f_involucrado")
@Linked(template = "/application/uif_f_involucrados")
@JsonPropertyOrder(alphabetic = true)
public class Buscar_involucradosDataSourceOutput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "fullname")
    private String fullname;

    @PersistentAttribute(name = "tipo_persona")
    private String tipo_persona;

    @PersistentAttribute(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @PersistentAttribute(name = "r_creation_date")
    private Date r_creation_date;

    @PersistentAttribute(name = "r_object_type")
    private String r_object_type;

    @Summary
    private String summary;

    @MatchingTerms
    private List<String> matchingterms;

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

    public String getFullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getTipo_persona(){
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona){
        this.tipo_persona = tipo_persona;
    }

    public Date getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getR_creation_date(){
        return r_creation_date;
    }

    public void setR_creation_date(Date r_creation_date){
        this.r_creation_date = r_creation_date;
    }

    public String getR_object_type(){
        return r_object_type;
    }

    public void setR_object_type(String r_object_type){
        this.r_object_type = r_object_type;
    }

    public String getSummary(){
        return summary;
    }

    public void setSummary(String summary){
        this.summary = summary;
    }

    public List<String> getMatchingterms(){
        return matchingterms;
    }

    public void setMatchingterms(List<String> matchingterms){
        this.matchingterms = matchingterms;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}