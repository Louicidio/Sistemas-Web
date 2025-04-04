class Endereco {
    constructor(
      public rua: string,
      public numero: number,
      public cidade: string,
      public estado: string
    ) {}
  }
  
  class Telefone {
    constructor(public ddd: string, public numero: number, public tipo: string) {}
  }
  
  class Produto {
    constructor(
      public codigo: number,
      public descricao: string,
      public valor: number
    ) {}
  }
  
  class Cliente {
    constructor(
      public nome: string,
      public cpf: number,
      public data_nascimento: number,
      public sexo: string,
      public endereco: Endereco,
      public telefones: Telefone[]
    ) {}
  }
  
  class Venda {
    constructor(
      public codigo: number,
      public data: number,
      public cliente: Cliente,
      public produtos: Produto[]
    ) {}
  
    calcularTotal(): number {
      return this.produtos.reduce((total, produto) => total + produto.valor, 0);
    }
  }
  
  // Exemplo de uso:
  const endereco = new Endereco("Rua Karpinski", 1818, "Guarapuava", "Parana");
  const telefone1 = new Telefone("43", 996563773, "Celular");
  const cliente = new Cliente("Luiz", 2274832752, 12112004, "M", endereco, [
    telefone1,
  ]);
  
  const produto1 = new Produto(1237, "Bolacha Trakinas", 3.49);
  const produto2 = new Produto(2389, "Coca-Cola 350ml", 4.50);
  const venda = new Venda(1, 31032004, cliente, [produto1, produto2]);
  
  console.log("Total da venda:", venda.calcularTotal());
  