package prefeitura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String uf;
	private String municipio;
	private String bairro;
	private String cep;
	private String complemento;
	private String numero;
	private String logradouro;

	public Endereco() {
	}

	public Endereco(Integer id, String uf, String municipio, String bairro, String cep, String complemento,
			String numero, String logradouro) {
		super();
		this.id = id;
		this.uf = uf;
		this.municipio = municipio;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.numero = numero;
		this.logradouro = logradouro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", uf=" + uf + ", municipio=" + municipio + ", bairro=" + bairro + ", cep=" + cep
				+ ", complemento=" + complemento + ", numero=" + numero + ", logradouro=" + logradouro + "]";
	}

		
}
