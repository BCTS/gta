package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_invoke_stateless_processcrear_nuevo_involuc_initiateDomain {

    @ProcessVariable(variableName = "apellido_materno")
    private String apellido_materno;

    @ProcessVariable(variableName = "apellido_paterno")
    private String apellido_paterno;

    @ProcessVariable(variableName = "departamento_nacimiento")
    private String departamento_nacimiento;

    @ProcessVariable(variableName = "distrito_nacimiento")
    private String distrito_nacimiento;

    @ProcessVariable(variableName = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @ProcessVariable(variableName = "nombres")
    private String nombres;

    @ProcessVariable(variableName = "pais_nacimiento")
    private String pais_nacimiento;

    @ProcessVariable(variableName = "profesiones")
    private List<String> profesiones;

    @ProcessVariable(variableName = "provincia_nacimiento")
    private String provincia_nacimiento;

    @ProcessVariable(variableName = "razon_social")
    private String razon_social;

    @ProcessVariable(variableName = "tipo_persona")
    private String tipo_persona;

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

    public Date getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
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

    public List<String> getProfesiones(){
        return profesiones;
    }

    public void setProfesiones(List<String> profesiones){
        this.profesiones = profesiones;
    }

    public String getProvincia_nacimiento(){
        return provincia_nacimiento;
    }

    public void setProvincia_nacimiento(String provincia_nacimiento){
        this.provincia_nacimiento = provincia_nacimiento;
    }

    public String getRazon_social(){
        return razon_social;
    }

    public void setRazon_social(String razon_social){
        this.razon_social = razon_social;
    }

    public String getTipo_persona(){
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona){
        this.tipo_persona = tipo_persona;
    }

}