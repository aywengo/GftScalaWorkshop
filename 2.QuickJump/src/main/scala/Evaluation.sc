//
// Evaluation Rules
//
def example = 2 // evaluated when called
val example1 = 2 // evaluated immediately
lazy val example2 = 2 // evaluated once when needed

def squareN(x: Double) = {} // call by value
def squareV(x: => Double) = {} // call by name

def act() = {
  println("Act like a fool!")
  1
}

def callByValue(x: Int) = {
  println("x1=" + x)
  println("x2=" + x)
}
callByValue(act())

def callByName(x: => Int) = {
  println("x1=" + x)
  println("x2=" + x)
}
callByName(act())

def myBindings(bindings: Int*): Unit = {
  bindings.foreach(b => print(b))
}
myBindings(1,2,3,4)
// bindings is a sequence of int,
// containing a varying # of arguments