package ipfix.ie

sealed trait Semantics
case object Default extends Semantics
case object Quantity extends Semantics
case object TotalCounter extends Semantics
case object DeltaCounter extends Semantics
case object Identifier extends Semantics
case object Flags extends Semantics
case object NoSemantics extends Semantics