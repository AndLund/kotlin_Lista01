class Pessoa (val name:String, val height:Double){

    var birthday:Int = 15
        set(value){
            field = 2021 - value
        }
//        private set

    constructor(name:String, birthday: Int, height:Double):this(name,height){
        this.birthday = birthday
    }

    override fun toString() = "$name ($birthday, $height)"
}

fun main() {
    val p:Pessoa
    p = Pessoa("Anderson", 2000 , 1.8)
    println(p.toString())
}