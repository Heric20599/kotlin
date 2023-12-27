fun main(){
    var k=9;
    var j=10;

    var heroo =car("hero","herohonda",67)
    println(heroo.carname)
    heroo.driver()

}
class car(var carname:String,var carModel:String,var price:Int){
    fun driver(){
        println("${carname},${carModel}  is driving")
    }

}