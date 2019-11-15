package br.edu.unibratec.livrariadigital.model;
public class Digital extends Tipo {

	private String url;
	private float tamanhoArquivo;

	public Digital(String url, float tamanhoArquivo) {
		super();
		this.url = url;
        this.tamanhoArquivo = tamanhoArquivo;
	}

	public Digital() {

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Digital [url=" + url + ", tamanhoArquivo=" + tamanhoArquivo + "mb" + "]";
	}

	public float getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(float tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}

}
