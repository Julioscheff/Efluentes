package br.com.senai.sa3semestre.projeto_efluentes.entites;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Amostra {

    private long idAmostra;
    private LocalDate dataColeta;
    private String localColeta;
    private br.com.senai.sa3semestre.projeto_efluentes.entites.tipoEfluente tipoEfluente;
    private String parametroQuimico;
    private String StatusAmostra;
    private String descricaoAmostra;
    private String funcionarioColetou;

    public Amostra(long idAmostra, LocalDate dataColeta, String localColeta, tipoEfluente tipoEfluente, String parametroQuimico, String statusAmostra, String descricaoAmostra, String funcionarioColetou) {
        this.idAmostra = idAmostra;
        this.dataColeta = dataColeta;
        this.localColeta = localColeta;
        this.tipoEfluente = tipoEfluente;
        this.parametroQuimico = parametroQuimico;
        StatusAmostra = statusAmostra;
        this.descricaoAmostra = descricaoAmostra;
        this.funcionarioColetou = funcionarioColetou;
    }

    public long getIdAmostra() {
        return idAmostra;
    }

    public void setIdAmostra(long idAmostra) {
        this.idAmostra = idAmostra;
    }

    public LocalDate getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDate dataColeta) {
        this.dataColeta = dataColeta;
    }

    public String getLocalColeta() {
        return localColeta;
    }

    public void setLocalColeta(String localColeta) {
        this.localColeta = localColeta;
    }

    public tipoEfluente getTipoEfluente() {
        return tipoEfluente;
    }

    public void setTipoEfluente(tipoEfluente tipoEfluente) {
        this.tipoEfluente = tipoEfluente;
    }

    public String getParametroQuimico() {
        return parametroQuimico;
    }

    public void setParametroQuimico(String parametroQuimico) {
        this.parametroQuimico = parametroQuimico;
    }

    public String getStatusAmostra() {
        return StatusAmostra;
    }

    public void setStatusAmostra(String statusAmostra) {
        StatusAmostra = statusAmostra;
    }

    public String getDescricaoAmostra() {
        return descricaoAmostra;
    }

    public void setDescricaoAmostra(String descricaoAmostra) {
        this.descricaoAmostra = descricaoAmostra;
    }

    public String getFuncionarioColetou() {
        return funcionarioColetou;
    }

    public void setFuncionarioColetou(String funcionarioColetou) {
        this.funcionarioColetou = funcionarioColetou;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amostra amostra = (Amostra) o;

        if (idAmostra != amostra.idAmostra) return false;
        if (!Objects.equals(dataColeta, amostra.dataColeta)) return false;
        if (!Objects.equals(localColeta, amostra.localColeta)) return false;
        if (!Objects.equals(tipoEfluente, amostra.tipoEfluente))
            return false;
        if (!Objects.equals(parametroQuimico, amostra.parametroQuimico))
            return false;
        if (!Objects.equals(StatusAmostra, amostra.StatusAmostra))
            return false;
        if (!Objects.equals(descricaoAmostra, amostra.descricaoAmostra))
            return false;
        return Objects.equals(funcionarioColetou, amostra.funcionarioColetou);
    }

    @Override
    public int hashCode() {
        int result = (int) (idAmostra ^ (idAmostra >>> 32));
        result = 31 * result + (dataColeta != null ? dataColeta.hashCode() : 0);
        result = 31 * result + (localColeta != null ? localColeta.hashCode() : 0);
        result = 31 * result + (tipoEfluente != null ? tipoEfluente.hashCode() : 0);
        result = 31 * result + (parametroQuimico != null ? parametroQuimico.hashCode() : 0);
        result = 31 * result + (StatusAmostra != null ? StatusAmostra.hashCode() : 0);
        result = 31 * result + (descricaoAmostra != null ? descricaoAmostra.hashCode() : 0);
        result = 31 * result + (funcionarioColetou != null ? funcionarioColetou.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Amostra{" +
                "idAmostra=" + idAmostra +
                ", dataColeta=" + dataColeta +
                ", localColeta='" + localColeta + '\'' +
                ", tipoEfluente=" + tipoEfluente +
                ", parametroQuimico='" + parametroQuimico + '\'' +
                ", StatusAmostra='" + StatusAmostra + '\'' +
                ", descricaoAmostra='" + descricaoAmostra + '\'' +
                ", funcionarioColetou='" + funcionarioColetou + '\'' +
                '}';
    }
}

