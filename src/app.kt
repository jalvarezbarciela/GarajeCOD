fun main(){
    val aparcamiento=Aparcamiento()
    aparcamiento.nome="Garcia Barbon"
    println(aparcamiento.toString())
    println(aparcamiento.plazasLibres)
    aparcamiento.coche1=Coches("1234 BCD","12:00","23:00")
    println(aparcamiento.coche1.toString())
    val coches=Coches("1411 DPR","20:00","22:25")
    println(coches.toString())
    val aparcamiento2=Aparcamiento("Urzaiz",600,10,Coches("9876 DSF","16:25","22:22"))
    aparcamiento2.toString()
}
/*
Esta clase contiene el main, lo que hace que el proyecto funcione
 */