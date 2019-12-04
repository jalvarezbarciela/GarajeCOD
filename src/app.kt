fun main(){
    val aparcamiento=Aparcamiento()
    //instanciamos un objeto
    aparcamiento.nome="Garcia Barbon"
    //cambiamos el valor de una variable del objeto
    println(aparcamiento.toString())
    //mostramos los valores de las variables
    println(aparcamiento.plazasLibres)
    //mostramos el valor de plazasLibres
    aparcamiento.coche1=Coches("1234 BCD","12:00","23:00")
    //Cambiamos el valor de coche1
    println(aparcamiento.coche1.toString())
    //mostramos el valor de coche1
    val aparcamiento2=Aparcamiento("Urzaiz",600,10,Coches("9876 DSF","16:25","22:22"))
    //instanciamos un objeto de tipo aparcamiento
    aparcamiento2.toString()
    //mostramos los valores del objeto
}
/*
Esta clase contiene el main, lo que hace que el proyecto funcione

 */