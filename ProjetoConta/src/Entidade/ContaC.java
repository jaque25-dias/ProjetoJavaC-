package Entidade;

public class ContaC {

    private static int contadorDeContas = 1; //Criar conta em ordem crescente
	private int numeroConta;
	private Cliente cliente;
	private Double saldo= 0.00;

	public void Conta(Cliente cliente) {
		this.numeroConta = contadorDeContas;
		this.cliente = cliente;
		contadorDeContas +=1;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	public void depositar (double valor) {
		if (valor > 0) {
			setSaldo(getSaldo()+valor);
			System.out.println("Seu depósito foi processado com sucesso !! ");
		}
		else {
			System.out.println("Não foi possivel realizar o depósito. Refaça a transação !!");
		}
	}
	public void sacar(double valor){
		System.out.println("Realizando um saque ");
		System.out.println("Saldo anterior "+this.saldo);
		
		//Se o tiver dinheiro na conta
		if(valor > 0 && this.getSaldo() >=valor) {		
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!!! ");
		}else { //caso não tenha dinheiro
			System.out.println("Saldo insuficiente");
	}  
	}
    public void transferir(Conta contaPoupanca, Double valor) {
	if (valor > 0 && this.getSaldo() >=valor) {
		setSaldo(getSaldo() - valor);
	contaPoupanca.saldo= contaPoupanca.getSaldo()+ valor;
		System.out.println("Transferência realizada com sucesso!!!");
	} else { //caso não tenha dinheiro
		System.out.println("Não foi possível realizar a Transferência");
}
	}
}

