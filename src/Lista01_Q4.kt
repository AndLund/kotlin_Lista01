class Employee(name:String, salary:Double): Person(name){
    var salaryy = salary
}

fun main(){
    val Emp = Employee("Anderson",1000.00)

    println("Nome:${Emp.name}\nSalario:${Emp.salaryy}")
}