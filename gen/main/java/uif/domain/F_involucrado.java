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


@PersistentObject(superType = "dm_folder", type = "uif_f_involucrado")
@Linked(template = "/application/uif_f_involucrados")
@JsonPropertyOrder(alphabetic = true)
public class F_involucrado {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "nombres")
    private String nombres;

    @PersistentAttribute(name = "apellido_paterno")
    private String apellido_paterno;

    @PersistentAttribute(name = "apellido_materno")
    private String apellido_materno;

    @PersistentAttribute(name = "genero")
    private String genero;

    @PersistentAttribute(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @PersistentAttribute(name = "fecha_defuncion")
    private Date fecha_defuncion;

    @PersistentAttribute(name = "pais_nacimiento")
    private String pais_nacimiento;

    @PersistentAttribute(name = "departamento_nacimiento")
    private String departamento_nacimiento;

    @PersistentAttribute(name = "provincia_nacimiento")
    private String provincia_nacimiento;

    @PersistentAttribute(name = "distrito_nacimiento")
    private String distrito_nacimiento;

    @PersistentAttribute(name = "estado_civil")
    private String estado_civil;

    @PersistentAttribute(name = "profesion")
    @ElementCollection(targetClass = String.class)
    private List<String> profesion;

    @PersistentAttribute(name = "tipo_persona")
    private String tipo_persona;

    @PersistentAttribute(name = "alias")
    @ElementCollection(targetClass = String.class)
    private List<String> alias;

    @PersistentAttribute(name = "falsos_nombres")
    @ElementCollection(targetClass = String.class)
    private List<String> falsos_nombres;

    @PersistentAttribute(name = "idiomas")
    @ElementCollection(targetClass = String.class)
    private List<String> idiomas;

    @PersistentAttribute(name = "email")
    @ElementCollection(targetClass = String.class)
    private List<String> email;

    @PersistentAttribute(name = "estado")
    private String estado;

    @PersistentAttribute(name = "fullname")
    private String fullname;

    @PersistentAttribute(name = "authors")
    @ElementCollection(targetClass = String.class)
    private List<String> authors;

    @PersistentAttribute(name = "keywords")
    @ElementCollection(targetClass = String.class)
    private List<String> keywords;

    @PersistentAttribute(name = "subject")
    private String subject;

    @PersistentAttribute(name = "title")
    private String title;

    @PersistentAttribute(name = "r_version_label")
    @ElementCollection(targetClass = String.class)
    private List<String> r_version_label;

    @PersistentAttribute(name = "r_lock_owner")
    private String r_lock_owner;

    @PersistentAttribute(name = "r_lock_date")
    private Date r_lock_date;

    @PersistentAttribute(name = "r_folder_path")
    @ElementCollection(targetClass = String.class)
    private List<String> r_folder_path;

    @PersistentAttribute(name = "r_link_cnt")
    private Integer r_link_cnt;

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

    public String getNombres(){
        return nombres;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public String getApellido_paterno(){
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno){
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno(){
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno){
        this.apellido_materno = apellido_materno;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public Date getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_defuncion(){
        return fecha_defuncion;
    }

    public void setFecha_defuncion(Date fecha_defuncion){
        this.fecha_defuncion = fecha_defuncion;
    }

    public String getPais_nacimiento(){
        return pais_nacimiento;
    }

    public void setPais_nacimiento(String pais_nacimiento){
        this.pais_nacimiento = pais_nacimiento;
    }

    public String getDepartamento_nacimiento(){
        return departamento_nacimiento;
    }

    public void setDepartamento_nacimiento(String departamento_nacimiento){
        this.departamento_nacimiento = departamento_nacimiento;
    }

    public String getProvincia_nacimiento(){
        return provincia_nacimiento;
    }

    public void setProvincia_nacimiento(String provincia_nacimiento){
        this.provincia_nacimiento = provincia_nacimiento;
    }

    public String getDistrito_nacimiento(){
        return distrito_nacimiento;
    }

    public void setDistrito_nacimiento(String distrito_nacimiento){
        this.distrito_nacimiento = distrito_nacimiento;
    }

    public String getEstado_civil(){
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil){
        this.estado_civil = estado_civil;
    }

    public List<String> getProfesion(){
        return profesion;
    }

    public void setProfesion(List<String> profesion){
        this.profesion = profesion;
    }

    public String getTipo_persona(){
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona){
        this.tipo_persona = tipo_persona;
    }

    public List<String> getAlias(){
        return alias;
    }

    public void setAlias(List<String> alias){
        this.alias = alias;
    }

    public List<String> getFalsos_nombres(){
        return falsos_nombres;
    }

    public void setFalsos_nombres(List<String> falsos_nombres){
        this.falsos_nombres = falsos_nombres;
    }

    public List<String> getIdiomas(){
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas){
        this.idiomas = idiomas;
    }

    public List<String> getEmail(){
        return email;
    }

    public void setEmail(List<String> email){
        this.email = email;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getFullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public List<String> getAuthors(){
        return authors;
    }

    public void setAuthors(List<String> authors){
        this.authors = authors;
    }

    public List<String> getKeywords(){
        return keywords;
    }

    public void setKeywords(List<String> keywords){
        this.keywords = keywords;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public List<String> getR_version_label(){
        return r_version_label;
    }

    public void setR_version_label(List<String> r_version_label){
        this.r_version_label = r_version_label;
    }

    public String getR_lock_owner(){
        return r_lock_owner;
    }

    public void setR_lock_owner(String r_lock_owner){
        this.r_lock_owner = r_lock_owner;
    }

    public Date getR_lock_date(){
        return r_lock_date;
    }

    public void setR_lock_date(Date r_lock_date){
        this.r_lock_date = r_lock_date;
    }

    public List<String> getR_folder_path(){
        return r_folder_path;
    }

    public void setR_folder_path(List<String> r_folder_path){
        this.r_folder_path = r_folder_path;
    }

    public Integer getR_link_cnt(){
        return r_link_cnt;
    }

    public void setR_link_cnt(Integer r_link_cnt){
        this.r_link_cnt = r_link_cnt;
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