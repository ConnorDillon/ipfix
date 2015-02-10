package ipfix.ie

object SnakeCase {
  def apply(str: String): String = {
    def loop(lst: List[Char], prev: Char='X'): List[Char] = lst match {
      case List() => List()
      case List(x) => List(x.toLower)
      case x :: xs if (prev.isLower || prev.isDigit) && x.isUpper => '_' :: x.toLower :: loop(xs, x)
      case x :: xs => x.toLower :: loop(xs, x)
    }
    loop(str.toList).mkString("")
  }
}