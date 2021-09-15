function Conta(accountNumer, accountType, accountBalance, name) {
    this.numero = accountNumer
    this.tipo = accountType
    this.saldo = accountBalance
    this.titular = name
    }


let ListaContas = [  new Conta(5486273622,	"Conta Corrente",	27771,	"Abigael Natte")
                    ,new Conta(1183971869,	"Conta Poupança",	8675,	"Ramon Connell")
                    ,new Conta(9582019689,	"Conta Poupança",	27363,	"Jarret Lafuente")
                    ,new Conta(1761924656,	"Conta Poupança",	32415,	"Ansel Ardley")
                    ,new Conta(7401971607,	"Conta Poupança",	18789,	"Jacki Shurmer")
                    ,new Conta(630841470,	"Conta Corrente",	28776,	"Jobi Mawtus")
                    ,new Conta(4223508636,	"Conta Corrente",	2177,	"Thomasin Latour")
                    ,new Conta(185979521,	"Conta Poupança",	25994,	"Lonnie Verheijden")
                    ,new Conta(3151956165,	"Conta Corrente",	7601,	"Alonso Wannan")
                    ,new Conta(2138105881,	"Conta Poupança",	33196,	"Bendite Huggett") ]  
                  
// console.log(ListaContas)     

// let ListaContasJSON = JSON.stringify(ListaContas)

// console.log(ListaContasJSON) 

let banco = {
    clientes: ListaContas,
    consultaCliente: function(titular) {
        for (let i = 0; i < this.clientes.length; i++){
            if (this.clientes[i].titular===titular){
                console.log("Cliente "+this.clientes[i].titular+" encontrado");
                return this.clientes[i]
            }
        }
    },
    depositar: function(titular,valor){
       let conta = this.consultaCliente(titular) 
        if (conta != undefined){
           conta.saldo += valor;
           console.log(`${conta.titular} Seu novo saldo é de ${conta.saldo}`);
       }
    },
    saque: function(titular,valor){
        let conta = this.consultaCliente(titular) 
        if (conta != undefined){
            if (conta.saldo >= valor){
                conta.saldo -= valor
                console.log(`Saque efetuado com sucesso. Seu saldo atual é de ${conta.saldo}`);
            } else {
                console.log("Saldo insuficiente para esta operação");
            }

        }
    }
}



// banco.consultaCliente("Jacki Shurmer") 

// banco.depositar("Jacki Shurmer",500) 

banco.saque("Ramon Connell",8000)