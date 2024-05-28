package br.com.senai.sa3semestre.projeto_efluentes.entites;

import jakarta.persistence.Entity;

import java.util.Objects;
    @Entity
public class Equipamentos {

    private long idEquipamentos;
    private double capacidade;
    private String tipo;
    private String descricaoEquipamento;

    public Equipamentos(long idEquipamentos, double capacidade, String tipo, String descricaoEquipamento) {
        this.idEquipamentos = idEquipamentos;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.descricaoEquipamento = descricaoEquipamento;
    }

    public long getIdEquipamentos() {
        return idEquipamentos;
    }

    public void setIdEquipamentos(long idEquipamentos) {
        this.idEquipamentos = idEquipamentos;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricaoEquipamento() {
        return descricaoEquipamento;
    }

    public void setDescricaoEquipamento(String descricaoEquipamento) {
        this.descricaoEquipamento = descricaoEquipamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipamentos that = (Equipamentos) o;

        if (idEquipamentos != that.idEquipamentos) return false;
        if (Double.compare(that.capacidade, capacidade) != 0) return false;
        if (!Objects.equals(tipo, that.tipo)) return false;
        return Objects.equals(descricaoEquipamento, that.descricaoEquipamento);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (idEquipamentos ^ (idEquipamentos >>> 32));
        temp = Double.doubleToLongBits(capacidade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (descricaoEquipamento != null ? descricaoEquipamento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Equipamentos{" +
                "idEquipamentos=" + idEquipamentos +
                ", capacidade=" + capacidade +
                ", tipo='" + tipo + '\'' +
                ", descricaoEquipamento='" + descricaoEquipamento + '\'' +
                '}';
    }
}
