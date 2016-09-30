package prefeitura.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Processo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
	private String relatoFiscalizacao;	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataRelato = Calendar.getInstance();	
	private String fiscalResponsavel;
	
	@ManyToOne
	private Fornecedor fornecedor = new Fornecedor();
	
	private String codigo;
	
	public Processo() {
	}
	
	public Processo(Integer id, String relatoFiscalizacao, Calendar dataRelato, String fiscalResponsavel,
			Fornecedor fornecedor, String codigo) {
		super();
		this.id = id;
		this.relatoFiscalizacao = relatoFiscalizacao;
		this.dataRelato = dataRelato;
		this.fiscalResponsavel = fiscalResponsavel;
		this.fornecedor = fornecedor;
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRelatoFiscalizacao() {
		return relatoFiscalizacao;
	}

	public void setRelatoFiscalizacao(String relatoFiscalizacao) {
		this.relatoFiscalizacao = relatoFiscalizacao;
	}

	public Calendar getDataRelato() {
		return dataRelato;
	}

	public void setDataRelato(Calendar dataRelato) {
		this.dataRelato = dataRelato;
	}

	public String getFiscalResponsavel() {
		return fiscalResponsavel;
	}

	public void setFiscalResponsavel(String fiscalResponsavel) {
		this.fiscalResponsavel = fiscalResponsavel;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}