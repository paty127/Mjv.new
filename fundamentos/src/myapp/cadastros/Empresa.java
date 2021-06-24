package myapp.cadastros;

public class Empresa  {
	private Cadastro cadastro;
	private Long im;
	private Long ie;
	
	public Empresa(Long ie,Long im ) {
		this.im = im;
		this.ie = ie;
	}
	
	public Long getIm() {
		return im;
	}
	
	public void setIm(Long im) {
		this.im = im;
	}

	public void setIe(Long ie) {
		this.ie = ie;
	}

	public Long getIe() {
		return ie;
	}
	
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
}