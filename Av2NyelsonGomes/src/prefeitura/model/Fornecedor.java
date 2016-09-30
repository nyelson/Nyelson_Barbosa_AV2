package prefeitura.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;		
	private String cnpj;	
	private String razaoSocial;	
	private String inscricaoMunicipal;
	private BigDecimal receitaBruta;
	
	@OneToOne
	private Endereco endereco = new Endereco();
	
	@OneToMany(mappedBy="fornecedor")
	private List<Processo> processos = new ArrayList<Processo>();
	
	public Fornecedor() {
	}

	public Fornecedor(Integer id, String cnpj, String razaoSocial, String inscricaoMunicipal, BigDecimal receitaBruta,
			Endereco endereco, List<Processo> processos) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.receitaBruta = receitaBruta;
		this.endereco = endereco;
		this.processos = processos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public BigDecimal getReceitaBruta() {
		return receitaBruta;
	}

	public void setReceitaBruta(BigDecimal receitaBruta) {
		this.receitaBruta = receitaBruta;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processo> processos) {
		this.processos = processos;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", inscricaoMunicipal="
				+ inscricaoMunicipal + ", receitaBruta=" + receitaBruta + ", endereco=" + endereco + "]";
	}
	
	
}
