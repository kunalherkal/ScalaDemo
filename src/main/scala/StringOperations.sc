val str1 = "Scala"
println(str1)
val str2 = "Language"
println(str2)
println(str1 + str2)
def toUpperCaseCustom(c : Char) =  {
  c.toUpper}
str2.foreach(toUpperCaseCustom)
for (c <- str1) println(c)
"hello".getBytes.foreach(println)
str1.filter(_ == 'a').foreach(println)
for (c <- str2) println(c.toUpper)
str2.map(c => c.toUpper)
for {
  c <- str2
} yield {
  c.toUpper
}
val numPattern = "[0-9]+".r
val stringForNumberPattern = "123 is a number and so is 101"
numPattern.findFirstIn(stringForNumberPattern)
numPattern.findAllIn(stringForNumberPattern).toArray
val list = numPattern.findAllIn(stringForNumberPattern).toList
list.map(println)
for(i <- 1 to 10) println(i)
(1 to 10).foreach(println)
for {
  i <- 1 to 10
  if i % 2 == 0
} println(i)

(1 to 10).filter( _%2 == 0).foreach(println)

(1 to 10).foreach {
  i => if (i % 2 == 0) {
    println(i)
  }
}

for {
  i <- 1 to 10
  if (i%2 ==0)
  if(i != 2)
} println(i)

(1 to 10).filter(_%2 ==0).filter(_!=2).foreach(println)
val values = for(i <- 1 to 10) yield i
(1 to 10).map(i => i)

for {
  i <- 1 to 3
  j <- 1 to 3
  k <- 1 to 3
} println(s"i = $i, j = $j, k = $k")