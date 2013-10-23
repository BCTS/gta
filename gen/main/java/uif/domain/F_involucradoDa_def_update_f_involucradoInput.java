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


@PersistentObject(type = "uif_f_involucrado")
@Linked(template = "/application/uif_f_involucrados")
@JsonPropertyOrder(alphabetic = true)
public class F_involucradoDa_def_update_f_involucradoInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "alias")
    @ElementCollection(targetClass = String.class)
    private List<String> alias;

    @PersistentAttribute(name = "apellido_materno")
    private String apellido_materno;

    @PersistentAttribute(name = "apellido_paterno")
    private String apellido_paterno;

    @PersistentAttribute(name = "departamento_nacimiento")
    private String departamento_nacimiento;

    @PersistentAttribute(name = "distrito_nacimiento")
    private String distrito_nacimiento;

    @PersistentAttribute(name = "email")
    @ElementCollection(targetClass = String.class)
    private List<String> email;

    @PersistentAttribute(name = "estado")
    private String estado;

    @PersistentAttribute(name = "estado_civil")
    private String estado_civil;

    @PersistentAttribute(name = "falsos_nombres")
    @ElementCollection(targetClass = String.class)
    private List<String> falsos_nombres;

    @PersistentAttribute(name = "fecha_defuncion")
    private Date fecha_defuncion;

    @PersistentAttribute(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @PersistentAttribute(name = "fullname")
    private String fullname;

    @PersistentAttribute(name = "genero")
    private String genero;

    @PersistentAttribute(name = "idiomas")
    @ElementCollection(targetClass = String.class)
    private List<String> idiomas;

    @PersistentAttribute(name = "nombres")
    private String nombres;

    @PersistentAttribute(name = "pais_nacimiento")
    private String pais_nacimiento;

    @PersistentAttribute(name = "profesion")
    @ElementCollection(targetClass = String.class)
    private List<String> profesion;

    @PersistentAttribute(name = "provincia_nacimiento")
    private String provincia_nacimiento;

    @PersistentAttribute(name = "tipo_persona")
    private String tipo_persona;

    @PersistentAttribute(name = "object_name")
    private String object_name;

    @PersistentAttribute(name = "subject")
    private String subject;

    @PersistentAttribute(name = "title")
    private String title;

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

    public List<String> getAlias(){
        return alias;
    }

    public void setAlias(List<String> alias){
        this.alias = alias;
    }

    public String getApellido_materno(){
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno){
        this.apellido_materno = apellido_materno;
    }

    public String getApellido_paterno(){
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno){
        this.apellido_paterno = apellido_paterno;
    }

    public String getDepartamento_nacimiento(){
        return departamento_nacimiento;
    }

    public void setDepartamento_nacimiento(String departamento_nacimiento){
        this.departamento_nacimiento = departamento_nacimiento;
    }

    public String getDistrito_nacimiento(){
        return distrito_nacimiento;
    }

    public void setDistrito_nacimiento(String distrito_nacimiento){
        this.distrito_nacimiento = distrito_nacimiento;
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

    public String getEstado_civil(){
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil){
        this.estado_civil = estado_civil;
    }

    public List<String> getFalsos_nombres(){
        return falsos_nombres;
    }

    public void setFalsos_nombres(List<String> falsos_nombres){
        this.falsos_nombres = falsos_nombres;
    }

    public Date getFecha_defuncion(){
        return fecha_defuncion;
    }

    public void setFecha_defuncion(Date fecha_defuncion){
        this.fecha_defuncion = fecha_defuncion;
    }

    public Date getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFullname(){
        return fullname;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public List<String> getIdiomas(){
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas){
        this.idiomas = idiomas;
    }

    public String getNombres(){
        return nombres;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public String getPais_nacimiento(){
        return pais_nacimiento;
    }

    public void setPais_nacimiento(String pais_nacimiento){
        this.pais_nacimiento = pais_nacimiento;
    }

    public List<String> getProfesion(){
        return profesion;
    }

    public void setProfesion(List<String> profesion){
        this.profesion = profesion;
    }

    public String getProvincia_nacimiento(){
        return provincia_nacimiento;
    }

    public void setProvincia_nacimiento(String provincia_nacimiento){
        this.provincia_nacimiento = provincia_nacimiento;
    }

    public String getTipo_persona(){
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona){
        this.tipo_persona = tipo_persona;
    }

    public String getObject_name(){
        return object_name;
    }

    public void setObject_name(String object_name){
        this.object_name = object_name;
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

    @JsonProperty
    public Map<String, Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String, Object> linkSource){
    }
}