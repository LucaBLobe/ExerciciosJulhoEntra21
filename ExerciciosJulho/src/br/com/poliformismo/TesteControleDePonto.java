package br.com.poliformismo;

public class TesteControleDePonto {
	
	public static void main(String[] args) {
		GerentesBanco gere1 = new GerentesBanco();
		gere1.setNome("Luiz");
		gere1.setCodigo(111);
		
		TelefonistasBanco tele1 = new TelefonistasBanco();
		tele1.setNome("Amanada");
		tele1.setCodigo(101);
		
		ControleDePonto ponto = new ControleDePonto();
		
		ponto.registraEntrada(gere1);
		ponto.registraEntrada(tele1);
		ponto.registraSaida(gere1);
		ponto.registraSaida(tele1);
	}

}
