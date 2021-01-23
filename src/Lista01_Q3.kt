class ScheduleList {
    var persons:ArrayList<Person> = arrayListOf();

    fun addPerson(p: Person){
        if(persons.size<10) {
            this.persons.add(p)
        } else
            print("Full list")
    }

    fun printSchedule(){
        persons.forEach(){
            println(it.name)
        }
    }
}

fun main(){
    var scheList = ScheduleList();

    var p1 = Person("Anderson");
    var p2 = Person("Joao");

    scheList.addPerson(p1)
    scheList.addPerson(p2)
    scheList.printSchedule()
}
