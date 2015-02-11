package ipfix.ie

sealed trait Units
case object Bits extends Units
case object Packets extends Units
case object Flows extends Units
case object Octets extends Units
case object NoUnits extends Units
case object Seconds extends Units
case object Milliseconds extends Units
case object Microseconds extends Units
case object Nanoseconds extends Units
case object Messages extends Units
case object Hops extends Units
case object Entries extends Units
case object Frames extends Units