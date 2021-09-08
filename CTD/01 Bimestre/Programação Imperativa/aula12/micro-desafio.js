function Conta(accountNumer, accountType, accountBalance, name) {
    this.numero = accountNumer,
    this.tipo = accountType,
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
                  
console.log(ListaContas)     

let ListaContasJSON = JSON.stringify(ListaContas)

console.log(ListaContasJSON) 

/* function banco(lstCnts){
    
}
 */

/* 

 function Account(accountNumer, accountType, accountBalance, name, document) {
    this.accountNumer = accountNumer,
    this.accountType = accountType,
    this.accountBalance = accountBalance
    // Aqui um exemplo diferente
    this.accountHolder = {
        name: name,
        document: document
    }
} 



let newAccount = new Account (
    "000001",
    "01",
    "1500",
    "Diego Reis", 
    "00000000000"
)

console.log(newAccount)

let contaJson = JSON.stringify(newAccount)

console.log(contaJson) 

*/
