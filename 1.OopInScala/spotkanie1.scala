import org.scalatest._

abstract class pat {
  // abstract
  def say():String
  // concrete
  def give():String = { "Take it" }
}

trait cat extends pat {
  override def say() = { "Meyaw" }
}

trait dog extends pat {
  override def say() = { "Goof" }
  def giveFive() = { println("I like You!")}
}

trait hungeralways {
  def eat() = { println(s"I wanna eat!!!") }
}

object monster extends dog with cat with hungeralways

class test1 extends FlatSpec {
    s"Monster" should s" say Meyaw" in {
      assert (monster.say contains s"Meyaw")
    }

  it should s" be always hungry" in {
    monster.eat()
    }

  it should s" be dog type" in {
      assert( monster.isInstanceOf[dog] )
    }

  it should s" be cat type" in {
      assert( monster.isInstanceOf[cat] )
    }

  it should s" be treated according to with-rule" in {
      assert( monster.asInstanceOf[cat].say() equals  monster.say() )
    }

  it should s" makes decomposition" in {
      monster.giveFive()
    }

}
