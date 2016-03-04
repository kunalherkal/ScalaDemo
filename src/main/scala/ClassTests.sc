class PersonVar(var firstName : String, var lastName : String) {
  println(s"Name : $firstName $lastName")
}

val p = new PersonVar("Kunal", "Herkal")
p.firstName
p.lastName
p.firstName = "Kaiser"
p.lastName = "Herkal"
p.firstName
p.lastName
class PersonVal(val firstName : String, val lastName : String) {
  println(s"Name : $firstName $lastName")
}

val p2 = new PersonVal("Kunal", "Herkal")
p2.firstName
p2.lastName
class PersonDefault(firstName : String, lastName : String) {
  println(s"Name : $firstName $lastName")
}

val p3 = new PersonDefault("Kunal", "Herkal")
//p3.firstName
case class CasePersonDefault(firstName : String, lastName : String) {
  println(s"Name : $firstName $lastName")
}

val p4 = CasePersonDefault("Kunal", "Herkal")
p4.firstName

class PersonAuxConstr(var firstName : String, var lastName : String) {
  println(s"Name : $firstName $lastName")

  def this(){
    this("abc","pqr");
  }
}
val p5 = new PersonAuxConstr();