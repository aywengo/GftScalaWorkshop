trait X { def check(): Unit }

trait A extends X { abstract override def check() = { println("A"); super.check() } }

trait B extends X { abstract override def check() = { println("B"); super.check() } }

class Y extends X { def check() = () }

class C extends Y with B with A

new C().check()
