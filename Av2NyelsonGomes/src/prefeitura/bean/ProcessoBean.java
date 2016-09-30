package prefeitura.bean;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import prefeitura.dao.DAO;
import prefeitura.dao.FornecedorDAO;
import prefeitura.model.Fornecedor;
import prefeitura.model.Processo;

@ManagedBean
@ViewScoped
public class ProcessoBean {
	
	private Processo processo = new Processo();
	private Integer processoId;	

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Integer getProcessoId() {
		return processoId;
	}

	public void setProcessoId(Integer processoId) {
		this.processoId = processoId;
	}

	public List<Processo> getProcessos() {
		return new DAO<Processo>(Processo.class).listaTodos();
	}	
	
	public void carregarPeloId() {
		this.processo = new DAO<Processo>(Processo.class).buscaPorId(this.processoId);
	}
	
	public void persistir() {
		String rn = new SimpleDateFormat("yyyyMMddHHmmss").format(processo.getDataRelato().getTime());
		rn = rn+processo.getFornecedor().getCnpj();
		this.processo.setCodigo(rn);
		
		if(this.processo.getId() == null) {
			new DAO<Processo>(Processo.class).adiciona(this.processo);
		} else {
			new DAO<Processo>(Processo.class).atualiza(this.processo);
		}
		processo = new Processo();

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo com sucesso! Código: " + rn, null));
	}
	
	public void buscar() {
		String cnpj = this.processo.getFornecedor().getCnpj();
		Fornecedor f = new FornecedorDAO().buscaFornecedorPorCNPJ(cnpj);
		if(f == null) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor " + cnpj + " não encontrado!"));
			f = new Fornecedor();
		}
		this.processo.setFornecedor(f);
	}
	
	public void excluir(Processo processo) {
		new DAO<Processo>(Processo.class).remove(processo);
	}
}
