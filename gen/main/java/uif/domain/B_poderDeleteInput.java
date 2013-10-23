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


@PersistentObject(type = "uif_b_poder")
@Linked(template = "/application/uif_b_poders")
@JsonPropertyOrder(alphabetic = true)
public class B_poderDeleteInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "partida_registral")
    private String partida_registral;

    @PersistentAttribute(name = "tipo_poder")
    private String tipo_poder;

    @PersistentAttribute(name = "fecha_poder")
    private Date fecha_poder;

    @PersistentAttribute(name = "otorgado_a")
    private String otorgado_a;

    @PersistentAttribute(name = "recibido_de")
    private String recibido_de;

    @PersistentAttribute(name = "motivo")
    private String motivo;

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

    public String getTipo_poder(){
        return tipo_poder;
    }

    public void setTipo_poder(String tipo_poder){
        this.tipo_poder = tipo_poder;
    }

    public Date getFecha_poder(){
        return fecha_poder;
    }

    public void setFecha_poder(Date fecha_poder){
        this.fecha_poder = fecha_poder;
    }

    public String getOtorgado_a(){
        return otorgado_a;
    }

    public void setOtorgado_a(String otorgado_a){
        this.otorgado_a = otorgado_a;
    }

    public String getRecibido_de(){
        return recibido_de;
    }

    public void setRecibido_de(String recibido_de){
        this.recibido_de = recibido_de;
    }

    public String getMotivo(){
        return motivo;
    }

    public void setMotivo(String motivo){
        this.motivo = motivo;
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