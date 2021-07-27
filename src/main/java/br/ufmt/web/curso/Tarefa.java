package br.ufmt.web.curso;

@Entity
@Table(name = " tarefa")
public class Tarefa {
	@Id
	private Long id;
	private String descricao;
	private boolean finalizado;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_finalizado", nullable = true)
	private Calendar dataFinalizacao;
	
	
	public Tarefa() {
		// TODO Auto-generated constructor stub
	}

	// GETS
	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean getFinalizado() {
		return finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	// SETS
	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
