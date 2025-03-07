programa {
  inteiro numeroUm, numeroDois
  funcao inicio() {
    escreva ("Digite um número para A e outro para B: \n")
    leia (numeroUm,numeroDois)

    numeroUm = numeroUm + numeroDois
    numeroDois = numeroUm - numeroDois
    numeroUm = numeroUm - numeroDois    

    escreva ("A = ",numeroUm, "\nB = ", numeroDois)
  }
}
