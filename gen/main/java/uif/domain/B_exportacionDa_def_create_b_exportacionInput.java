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


@PersistentObject(type = "uif_b_exportacion")
@Linked(template = "/application/uif_b_exportacions")
@JsonPropertyOrder(alphabetic = true)
public class B_exportacionDa_def_create_b_exportacionInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "anho")
    private Integer anho;

    @PersistentAttribute(name = "fob")
    private Double fob;

    @PersistentAttribute(name = "pais_destino")
    private String pais_destino;

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

    public Double getFob(){
        return fob;
    }

    public void setFob(Double fob){
        this.fob = fob;
    }

    public String getPais_destino(){
        return pais_destino;
    }

    public void setPais_destino(String pais_destino){
        this.pais_destino = pais_destino;
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