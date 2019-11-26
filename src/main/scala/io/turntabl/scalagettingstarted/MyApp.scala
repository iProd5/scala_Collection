package io.turntabl.scalagettingstarted

object MyApp extends App {
val myNameAndFavPLang = ("Phoenix", "Scala")
//  val myName, favPLang = myNameAndFavPLang
val (myName, favPLang )= myNameAndFavPLang
  println(myName)
  println(favPLang)

//  map f countries
val countries = Map("uk"-> "England", "USA"->"Washington", "Ghana"->"Accra") +
  ("Togo"->"somewhere", "Nigeria"->"Lagos")


//  checking for norway
  val norway = countries.getOrElse("Norway","unknown")
  println(norway)

//  friends set
  val friends = Set("Franklin", "Phoenix", "Samuel", "Samuel")
  println(friends.count(_=="Samuel"))

//  List of names
  val ListOfNames = List("phoenix","Samuel","Franklin") foreach(println)

}
