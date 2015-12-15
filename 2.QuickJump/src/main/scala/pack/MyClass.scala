// Defines a new type MyClass with a constructor
class MyClass(x: Int, y: Int) {
  // precondition, triggering an IllegalArgumentException if not met
  require(y > 0, "y must be positive")

  // auxiliary constructor
  def this(x: Int) = {
    this(x,0)
  }

  // public method computed every time it is called
  def nb1 = x

  def nb2 = y

  // private method
  private def test(a: Int): Int = ??? // ??? means is not implemented

  // computed only once
  val nb3 = x + y

  // overridden method
  override def toString = x + ", " + y
}

// creates a new object of type
// new MyClass(1, 2)
// new MyClass(3)
