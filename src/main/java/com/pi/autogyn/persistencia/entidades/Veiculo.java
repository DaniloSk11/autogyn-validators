package com.pi.autogyn.persistencia.entidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.pi.autogyn.persistencia.dao.AcessorioDao;
import com.pi.autogyn.persistencia.dao.ModeloDao;
import com.pi.autogyn.persistencia.dao.PropriedadeDao;

public class Veiculo {
	private String placa;
	private int km;
	private int anoFabricacao;
	private int numPatrimonio;
	private int numChassi;
	private int anoModelo;
	private Modelo modelo;
	private Long modelo_id;
	private List<Acessorio> acessorios;
	private List<Propriedade> propriedades;
	
	public Veiculo(ResultSet rs) throws SQLException {
		this.placa = rs.getString("placa");
		this.anoFabricacao = rs.getInt("ano_fabricacao");
		this.numChassi = rs.getInt("num_chassi");
		this.km = rs.getInt("km");
		this.numPatrimonio = rs.getInt("num_patrimonio");
		this.anoModelo = rs.getInt("ano_modelo");
		this.modelo_id = rs.getLong("id_modelo");
	}
	
	public List<Propriedade> getPropriedades() {
		if (this.propriedades == null) {
			try {
				this.propriedades = PropriedadeDao.getAllByPlaca(this.placa);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return this.propriedades;
	}
	
	public Modelo getModelo() {
		if (modelo == null) {
			try {
				this.modelo = ModeloDao.getById(this.modelo_id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return this.modelo;
	}
	
	public List<Acessorio> getAcessorios() {
		if (acessorios == null) {
			try {
				this.acessorios = AcessorioDao.getAllAcessoriosOfVeiculo(this.placa);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return this.acessorios;
	}

	
	
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", km=" + km + ", anoFabricacao=" + anoFabricacao + ", numPatrimonio="
				+ numPatrimonio + ", numChassi=" + numChassi + ", anoModelo=" + anoModelo + ", modelo=" + modelo
				+ ", modelo_id=" + modelo_id + ", acessorios=" + acessorios + ", propriedades=" + getPropriedades() + "]";
	}

	
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getNumPatrimonio() {
		return numPatrimonio;
	}

	public void setNumPatrimonio(int numPatrimonio) {
		this.numPatrimonio = numPatrimonio;
	}

	public int getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Long getModelo_id() {
		return modelo_id;
	}

	public void setModelo_id(Long modelo_id) {
		this.modelo_id = modelo_id;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	
}