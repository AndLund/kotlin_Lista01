open class Person(name: String){
    var name:String?= null
    init{
        this.name = name
    }
}

class Schedule{
    val persons = Array(10){Person("")}

    var i = 0

    fun addPerson(p:Person):Unit{
        if(i<10) {
            persons[i++] = p
        } else
            print("array cheio")
    }

    fun removePerson(name:String):Unit{
        var f = 0
        for(j in 0..i){
            if(persons[j].name.equals(name))
                persons[j].name = ""
                f = 1
            if(j == i && f == 0)
                print("não foi encontrado")
        }
    }

    fun findPerson(name:String):Person{

        var personFound:Person ?= null

        for(j in 0 until i){
            var c = 0
            if(persons[j].name.equals(name)) {
                personFound = persons[j]
                println("Encontrado!")
                c = 1
                break
            }
            if(j == i && c ==0)
                println("não foi encontrado")
        }
        return personFound!!
    }

    fun printSchedule():Unit{
        println("Agenda:")
        for(j in 0 until i){
            if(persons[j].name != "") println(persons[j].name)
        }
    }

    fun printPerson(v:Int):Unit{
        for(j in 0 until i){
            if(j == v) println(persons[v].name)
        }
    }
}

fun main(){
    var sche = Schedule();

    var p1 = Person("Anderson");
    var p2 = Person("Joao");

    sche.addPerson(p1);
    sche.addPerson(p2);

    sche.printPerson(0);
    sche.printSchedule();

    sche.removePerson("Joao");

    sche.printSchedule();

    sche.findPerson("Anderson");
}