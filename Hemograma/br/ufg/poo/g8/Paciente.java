package br.ufg.poo.g8;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "paciente")
public class Paciente {
    
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nomeCompleto;
    
    @DatabaseField
    private int registro;
    
    @DatabaseField(dataType = DataType.DATE)
    private Date dataNascimento;
    
    @DatabaseField(columnName = "hemoglobina")
    private float hemoglobina; // Medida em g/dL
    
    @DatabaseField(columnName = "hematocrito")
    private float hematocrito; // Medida em %
    
    @DatabaseField(columnName = "globulos_vermelhos")
    private float globulosVermelhos; // Medida em milhões/mm³
    
    @DatabaseField(columnName = "glubulos_brancos")
    private float globulosBrancos; // Medida em mil/mm³
    
    @DatabaseField(columnName = "plaquetas")
    private float plaquetas; // Medida em mil/mm³
    
    public String formatarDataNascimento() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        return formatoData.format(dataNascimento);
    }
    
    public String imprimirHemograma() {
        return String.format(
            "Hemoglobina: %.2f g/dL\n" +
            "Hematócrito: %.2f %%\n" +
            "Glóbulos Vermelhos: %.2f milhões/mm³\n" +
            "Glóbulos Brancos: %.2f mil/mm³\n" +
            "Plaquetas: %.2f mil/mm³",
            hemoglobina, hematocrito, globulosVermelhos, globulosBrancos, plaquetas
        );
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getId() {
        return this.id;
    }

    /**SET Method Propertie id*/
    public void setId(int id) {
        this.id = id;
    }

    /**GET Method Propertie nomeCompleto*/
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    /**SET Method Propertie nomeCompleto*/
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**GET Method Propertie registro*/
    public int getRegistro() {
        return this.registro;
    }

    /**SET Method Propertie registro*/
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    /**GET Method Propertie dataNascimento*/
    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    /**SET Method Propertie dataNascimento*/
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**GET Method Propertie hemoglobina*/
    public float getHemoglobina() {
        return this.hemoglobina;
    }

    /**SET Method Propertie hemoglobina*/
    public void setHemoglobina(float hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    /**GET Method Propertie hematocrito*/
    public float getHematocrito() {
        return this.hematocrito;
    }

    /**SET Method Propertie hematocrito*/
    public void setHematocrito(float hematocrito) {
        this.hematocrito = hematocrito;
    }

    /**GET Method Propertie globulosVermelhos*/
    public float getGlobulosVermelhos() {
        return this.globulosVermelhos;
    }

    /**SET Method Propertie globulosVermelhos*/
    public void setGlobulosVermelhos(float globulosVermelhos) {
        this.globulosVermelhos = globulosVermelhos;
    }

    /**GET Method Propertie globulosBrancos*/
    public float getGlobulosBrancos() {
        return this.globulosBrancos;
    }

    /**SET Method Propertie globulosBrancos*/
    public void setGlobulosBrancos(float globulosBrancos) {
        this.globulosBrancos = globulosBrancos;
    }

    /**GET Method Propertie plaquetas*/
    public float getPlaquetas() {
        return this.plaquetas;
    }

    /**SET Method Propertie plaquetas*/
    public void setPlaquetas(float plaquetas) {
        this.plaquetas = plaquetas;
    }

//End GetterSetterExtension Source Code

}//End class
