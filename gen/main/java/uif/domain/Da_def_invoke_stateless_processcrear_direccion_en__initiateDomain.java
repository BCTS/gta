package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessVariable;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_invoke_stateless_processcrear_direccion_en__initiateDomain {

    @ProcessVariable(variableName = "departamento")
    private String departamento;

    @ProcessVariable(variableName = "distrito")
    private String distrito;

    @ProcessVariable(variableName = "id_involucrado")
    private String id_involucrado;

    @ProcessVariable(variableName = "nombre_via")
    private String nombre_via;

    @ProcessVariable(variableName = "nombre_zona")
    private String nombre_zona;

    @ProcessVariable(variableName = "numero_exteriores")
    private String numero_exteriores;

    @ProcessVariable(variableName = "numero_interiores")
    private String numero_interiores;

    @ProcessVariable(variableName = "pais")
    private String pais;

    @ProcessVariable(variableName = "provincia")
    private String provincia;

    @ProcessVariable(variableName = "tipo_numero")
    private String tipo_numero;

    @ProcessVariable(variableName = "tipo_via")
    private String tipo_via;

    @ProcessVariable(variableName = "tipo_zona")
    private String tipo_zona;

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDistrito(){
        return distrito;
    }

    public void setDistrito(String distrito){
        this.distrito = distrito;
    }

    public String getId_involucrado(){
        return id_involucrado;
    }

    public void setId_involucrado(String id_involucrado){
        this.id_involucrado = id_involucrado;
    }

    public String getNombre_via(){
        return nombre_via;
    }

    public void setNombre_via(String nombre_via){
        this.nombre_via = nombre_via;
    }

    public String getNombre_zona(){
        return nombre_zona;
    }

    public void setNombre_zona(String nombre_zona){
        this.nombre_zona = nombre_zona;
    }

    public String getNumero_exteriores(){
        return numero_exteriores;
    }

    public void setNumero_exteriores(String numero_exteriores){
        this.numero_exteriores = numero_exteriores;
    }

    public String getNumero_interiores(){
        return numero_interiores;
    }

    public void setNumero_interiores(String numero_interiores){
        this.numero_interiores = numero_interiores;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getProvincia(){
        return provincia;
    }

    public void setProvincia(String provincia){
        this.provincia = provincia;
    }

    public String getTipo_numero(){
        return tipo_numero;
    }

    public void setTipo_numero(String tipo_numero){
        this.tipo_numero = tipo_numero;
    }

    public String getTipo_via(){
        return tipo_via;
    }

    public void setTipo_via(String tipo_via){
        this.tipo_via = tipo_via;
    }

    public String getTipo_zona(){
        return tipo_zona;
    }

    public void setTipo_zona(String tipo_zona){
        this.tipo_zona = tipo_zona;
    }

}