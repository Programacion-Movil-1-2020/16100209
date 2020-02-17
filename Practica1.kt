import java.io.Console
import java.util.logging.ConsoleHandler
var equiposArmados:MutableList<String> = mutableListOf()
var Procesadores = listOf<String>("Intel Core i","Intel Core i5","Intel Core i7")
var Memorias = listOf("Kingston ValueRAM DDR3","HyperX Fury DDR3","HyperX Savage DDR3")
var DiscoDuro = listOf("500GB","1TB","2TB")
fun main() {
    print("1.- Armar un nuevo equipo\n" +
            "2.- Ver equipos armados\n" +
            "3.- Salir \n")
    var opcionEscogida = readLine()
    while(opcionEscogida != "3") {
        when (opcionEscogida) {
            "1" -> armarUnEquipo()
            "2" -> equiposArmados.forEach() {
                print("$it \n")
            }
        }
        print(
            "1.- Armar un nuevo equipo\n" +
                    "2.- Ver equipos armados\n" +
                    "3.- Salir \n"
        )
        opcionEscogida = readLine()
    }
}
fun armarUnEquipo(){
    var equipo:String =""
    print("1.- Procesador\n" +
            "2.- Memoria Ram\n" +
            "3.- Disco duro (almacenamiento)\n" +
            "4.- Finalizar")
    var componenteEscogido =  readLine()
    var resultado=""
    while(componenteEscogido != "4") {
        var escogido:String? = ""
        when (componenteEscogido) {
            "1" -> {
                ImprimirOpciones(Procesadores)
                escogido = readLine()
                equipo += " ${Procesadores.get(escogido!!.toInt() - 1)}"
            }
            "2" -> {
                ImprimirOpciones(Memorias)
                escogido = readLine()
                equipo += " " + Memorias.get(escogido!!.toInt() - 1)

            }
            "3" -> {
                ImprimirOpciones(DiscoDuro)
                escogido = readLine()
                equipo += " " + DiscoDuro.get(escogido!!.toInt() - 1)
            }
        }
        print("1.- Procesador\n" +
                "2.- Memoria Ram\n" +
                "3.- Disco duro (almacenamiento)" +
                "4.- Finalizar")
        componenteEscogido =  readLine()
    }
    equiposArmados.add(equipo)
}
fun ImprimirOpciones(Opciones:List<String>){
        var c = 0
        Opciones.forEach {
            c += 1
            print("$c .- $it \n")
        }
}