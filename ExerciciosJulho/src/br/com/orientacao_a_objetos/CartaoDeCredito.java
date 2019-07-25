package br.com.orientacao_a_objetos;

public class CartaoDeCredito {
	
	//Atributos
	
		private int numeroCartao;
		private String dataValidade;
		private Cliente cliente;
		
		public void CartaoDeCerdito(int numeroCartao) {
			
			this.numeroCartao = numeroCartao;
			
		}

		public int getNumeroCartao() {
			return numeroCartao;
		}

		public void setNumeroCartao(int numeroCartao) {
			this.numeroCartao = numeroCartao;
		}

		public String getDataValidade() {
			return dataValidade;
		}

		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

}
