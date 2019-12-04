fun main(){
    val aparcamiento=Aparcamiento()
    aparcamiento.nome="Garcia Barbon"
    println(aparcamiento.toString())
    println(aparcamiento.plazasLibres)
    aparcamiento.coches=Coches("1234 BCD","12:00","23:00")
    println(aparcamiento.coches.toString())
    val coches=Coches("1411 DPR","20:00","22:25")
    println(coches.toString())
}
/*
Esta clase contiene el main, lo que hace que el proyecto funcione
 */