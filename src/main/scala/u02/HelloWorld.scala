package u02

object HelloWorld extends App:
  val h: String => Boolean = _ == "ciao"
  def neg ( x: (String) => Boolean): (String => Boolean) =
    case n if x(n) => false
    case _ => true

  val neg2 : (String => Boolean) => (String => Boolean) = f => s => !f(s)

  val d = neg(h)


  println(h("ciao"))
  println(h("cao"))
  println(d("ciao"))
  println(d("iao \n\n\n"))

  val p1: (Int, Int, Int) => Boolean = (x,y,z) => x <= y && y == z



