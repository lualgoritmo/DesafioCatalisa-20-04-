import kotlin.system.exitProcess

fun main() {
  menu();
}
fun menu() {
    while (true) {
        var opcao = 0;
        println("Seja bem vindo!");
        println("Cálcular à Media digite 1");
        println("Sair do Programa 2");
        opcao = readln().toInt();
        if (opcao == 1){
            mediaAlunos();
        }
        else if (opcao == 2) {
            exitProcess(0)
        }
        opcao ++;
    }
}
fun mediaAlunos() {
    var notas = DoubleArray(4)
    var soma = 0.0
    var media = 0.0
   for (i in notas.indices) {
       println("Digite a nota ${i + 1}")
       notas[i] = readln().toDouble()

       while (notas[i] < 0 || notas[i] > 10) {
           println("Escreva uma nota >= 0 é < 10")
           println("Digite a nota ${i + 1}")
           notas[i] = readln().toDouble()
       }
       soma +=  notas[i]
   }
    media = soma / notas.size
    println("A média do aluno é: $media")
}


