package ipfix.ie

import java.net.InetAddress
import java.sql.Timestamp
import ipfix.ByteIterCounter
import ipfix.protocol._

object Elements {
  case class OctetDeltaCount(value: Long) extends LongField {
    val info = OctetDeltaCount
  }
  
  object OctetDeltaCount extends IE(1, "octetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = OctetDeltaCount(Unsigned64.load(b, l))
  }

  case class PacketDeltaCount(value: Long) extends LongField {
    val info = PacketDeltaCount
  }
  
  object PacketDeltaCount extends IE(2, "packetDeltaCount", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = PacketDeltaCount(Unsigned64.load(b, l))
  }

  case class DeltaFlowCount(value: Long) extends LongField {
    val info = DeltaFlowCount
  }
  
  object DeltaFlowCount extends IE(3, "deltaFlowCount", Unsigned64, DeltaCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = DeltaFlowCount(Unsigned64.load(b, l))
  }

  case class ProtocolIdentifier(value: Int) extends IntField {
    val info = ProtocolIdentifier
  }
  
  object ProtocolIdentifier extends IE(4, "protocolIdentifier", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ProtocolIdentifier(Unsigned8.load(b, l))
  }

  case class IpClassOfService(value: Int) extends IntField {
    val info = IpClassOfService
  }
  
  object IpClassOfService extends IE(5, "ipClassOfService", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpClassOfService(Unsigned8.load(b, l))
  }

  case class TcpControlBits(value: Int) extends IntField {
    val info = TcpControlBits
  }
  
  object TcpControlBits extends IE(6, "tcpControlBits", Unsigned16, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpControlBits(Unsigned16.load(b, l))
  }

  case class SourceTransportPort(value: Int) extends IntField {
    val info = SourceTransportPort
  }
  
  object SourceTransportPort extends IE(7, "sourceTransportPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SourceTransportPort(Unsigned16.load(b, l))
  }

  case class SourceIPv4Address(value: InetAddress) extends InetField {
    val info = SourceIPv4Address
  }
  
  object SourceIPv4Address extends IE(8, "sourceIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SourceIPv4Address(Ipv4Address.load(b, l))
  }

  case class SourceIPv4PrefixLength(value: Int) extends IntField {
    val info = SourceIPv4PrefixLength
  }
  
  object SourceIPv4PrefixLength extends IE(9, "sourceIPv4PrefixLength", Unsigned8, NoSemantics, Bits) {
    def load(b: ByteIterCounter, l: Int) = SourceIPv4PrefixLength(Unsigned8.load(b, l))
  }

  case class IngressInterface(value: Int) extends IntField {
    val info = IngressInterface
  }
  
  object IngressInterface extends IE(10, "ingressInterface", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IngressInterface(Unsigned32.load(b, l))
  }

  case class DestinationTransportPort(value: Int) extends IntField {
    val info = DestinationTransportPort
  }
  
  object DestinationTransportPort extends IE(11, "destinationTransportPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DestinationTransportPort(Unsigned16.load(b, l))
  }

  case class DestinationIPv4Address(value: InetAddress) extends InetField {
    val info = DestinationIPv4Address
  }
  
  object DestinationIPv4Address extends IE(12, "destinationIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DestinationIPv4Address(Ipv4Address.load(b, l))
  }

  case class DestinationIPv4PrefixLength(value: Int) extends IntField {
    val info = DestinationIPv4PrefixLength
  }
  
  object DestinationIPv4PrefixLength extends IE(13, "destinationIPv4PrefixLength", Unsigned8, NoSemantics, Bits) {
    def load(b: ByteIterCounter, l: Int) = DestinationIPv4PrefixLength(Unsigned8.load(b, l))
  }

  case class EgressInterface(value: Int) extends IntField {
    val info = EgressInterface
  }
  
  object EgressInterface extends IE(14, "egressInterface", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EgressInterface(Unsigned32.load(b, l))
  }

  case class IpNextHopIPv4Address(value: InetAddress) extends InetField {
    val info = IpNextHopIPv4Address
  }
  
  object IpNextHopIPv4Address extends IE(15, "ipNextHopIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpNextHopIPv4Address(Ipv4Address.load(b, l))
  }

  case class BgpSourceAsNumber(value: Int) extends IntField {
    val info = BgpSourceAsNumber
  }
  
  object BgpSourceAsNumber extends IE(16, "bgpSourceAsNumber", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpSourceAsNumber(Unsigned32.load(b, l))
  }

  case class BgpDestinationAsNumber(value: Int) extends IntField {
    val info = BgpDestinationAsNumber
  }
  
  object BgpDestinationAsNumber extends IE(17, "bgpDestinationAsNumber", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpDestinationAsNumber(Unsigned32.load(b, l))
  }

  case class BgpNextHopIPv4Address(value: InetAddress) extends InetField {
    val info = BgpNextHopIPv4Address
  }
  
  object BgpNextHopIPv4Address extends IE(18, "bgpNextHopIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpNextHopIPv4Address(Ipv4Address.load(b, l))
  }

  case class PostMCastPacketDeltaCount(value: Long) extends LongField {
    val info = PostMCastPacketDeltaCount
  }
  
  object PostMCastPacketDeltaCount extends IE(19, "postMCastPacketDeltaCount", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = PostMCastPacketDeltaCount(Unsigned64.load(b, l))
  }

  case class PostMCastOctetDeltaCount(value: Long) extends LongField {
    val info = PostMCastOctetDeltaCount
  }
  
  object PostMCastOctetDeltaCount extends IE(20, "postMCastOctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostMCastOctetDeltaCount(Unsigned64.load(b, l))
  }

  case class FlowEndSysUpTime(value: Int) extends IntField {
    val info = FlowEndSysUpTime
  }
  
  object FlowEndSysUpTime extends IE(21, "flowEndSysUpTime", Unsigned32, NoSemantics, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowEndSysUpTime(Unsigned32.load(b, l))
  }

  case class FlowStartSysUpTime(value: Int) extends IntField {
    val info = FlowStartSysUpTime
  }
  
  object FlowStartSysUpTime extends IE(22, "flowStartSysUpTime", Unsigned32, NoSemantics, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowStartSysUpTime(Unsigned32.load(b, l))
  }

  case class PostOctetDeltaCount(value: Long) extends LongField {
    val info = PostOctetDeltaCount
  }
  
  object PostOctetDeltaCount extends IE(23, "postOctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostOctetDeltaCount(Unsigned64.load(b, l))
  }

  case class PostPacketDeltaCount(value: Long) extends LongField {
    val info = PostPacketDeltaCount
  }
  
  object PostPacketDeltaCount extends IE(24, "postPacketDeltaCount", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = PostPacketDeltaCount(Unsigned64.load(b, l))
  }

  case class MinimumIpTotalLength(value: Long) extends LongField {
    val info = MinimumIpTotalLength
  }
  
  object MinimumIpTotalLength extends IE(25, "minimumIpTotalLength", Unsigned64, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = MinimumIpTotalLength(Unsigned64.load(b, l))
  }

  case class MaximumIpTotalLength(value: Long) extends LongField {
    val info = MaximumIpTotalLength
  }
  
  object MaximumIpTotalLength extends IE(26, "maximumIpTotalLength", Unsigned64, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = MaximumIpTotalLength(Unsigned64.load(b, l))
  }

  case class SourceIPv6Address(value: InetAddress) extends InetField {
    val info = SourceIPv6Address
  }
  
  object SourceIPv6Address extends IE(27, "sourceIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SourceIPv6Address(Ipv6Address.load(b, l))
  }

  case class DestinationIPv6Address(value: InetAddress) extends InetField {
    val info = DestinationIPv6Address
  }
  
  object DestinationIPv6Address extends IE(28, "destinationIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DestinationIPv6Address(Ipv6Address.load(b, l))
  }

  case class SourceIPv6PrefixLength(value: Int) extends IntField {
    val info = SourceIPv6PrefixLength
  }
  
  object SourceIPv6PrefixLength extends IE(29, "sourceIPv6PrefixLength", Unsigned8, NoSemantics, Bits) {
    def load(b: ByteIterCounter, l: Int) = SourceIPv6PrefixLength(Unsigned8.load(b, l))
  }

  case class DestinationIPv6PrefixLength(value: Int) extends IntField {
    val info = DestinationIPv6PrefixLength
  }
  
  object DestinationIPv6PrefixLength extends IE(30, "destinationIPv6PrefixLength", Unsigned8, NoSemantics, Bits) {
    def load(b: ByteIterCounter, l: Int) = DestinationIPv6PrefixLength(Unsigned8.load(b, l))
  }

  case class FlowLabelIPv6(value: Int) extends IntField {
    val info = FlowLabelIPv6
  }
  
  object FlowLabelIPv6 extends IE(31, "flowLabelIPv6", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlowLabelIPv6(Unsigned32.load(b, l))
  }

  case class IcmpTypeCodeIPv4(value: Int) extends IntField {
    val info = IcmpTypeCodeIPv4
  }
  
  object IcmpTypeCodeIPv4 extends IE(32, "icmpTypeCodeIPv4", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IcmpTypeCodeIPv4(Unsigned16.load(b, l))
  }

  case class IgmpType(value: Int) extends IntField {
    val info = IgmpType
  }
  
  object IgmpType extends IE(33, "igmpType", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IgmpType(Unsigned8.load(b, l))
  }

  case class SamplingInterval(value: Int) extends IntField {
    val info = SamplingInterval
  }
  
  object SamplingInterval extends IE(34, "samplingInterval", Unsigned32, Quantity, Packets) {
    def load(b: ByteIterCounter, l: Int) = SamplingInterval(Unsigned32.load(b, l))
  }

  case class SamplingAlgorithm(value: Int) extends IntField {
    val info = SamplingAlgorithm
  }
  
  object SamplingAlgorithm extends IE(35, "samplingAlgorithm", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SamplingAlgorithm(Unsigned8.load(b, l))
  }

  case class FlowActiveTimeout(value: Int) extends IntField {
    val info = FlowActiveTimeout
  }
  
  object FlowActiveTimeout extends IE(36, "flowActiveTimeout", Unsigned16, NoSemantics, Seconds) {
    def load(b: ByteIterCounter, l: Int) = FlowActiveTimeout(Unsigned16.load(b, l))
  }

  case class FlowIdleTimeout(value: Int) extends IntField {
    val info = FlowIdleTimeout
  }
  
  object FlowIdleTimeout extends IE(37, "flowIdleTimeout", Unsigned16, NoSemantics, Seconds) {
    def load(b: ByteIterCounter, l: Int) = FlowIdleTimeout(Unsigned16.load(b, l))
  }

  case class EngineType(value: Int) extends IntField {
    val info = EngineType
  }
  
  object EngineType extends IE(38, "engineType", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EngineType(Unsigned8.load(b, l))
  }

  case class EngineId(value: Int) extends IntField {
    val info = EngineId
  }
  
  object EngineId extends IE(39, "engineId", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EngineId(Unsigned8.load(b, l))
  }

  case class ExportedOctetTotalCount(value: Long) extends LongField {
    val info = ExportedOctetTotalCount
  }
  
  object ExportedOctetTotalCount extends IE(40, "exportedOctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = ExportedOctetTotalCount(Unsigned64.load(b, l))
  }

  case class ExportedMessageTotalCount(value: Long) extends LongField {
    val info = ExportedMessageTotalCount
  }
  
  object ExportedMessageTotalCount extends IE(41, "exportedMessageTotalCount", Unsigned64, TotalCounter, Messages) {
    def load(b: ByteIterCounter, l: Int) = ExportedMessageTotalCount(Unsigned64.load(b, l))
  }

  case class ExportedFlowRecordTotalCount(value: Long) extends LongField {
    val info = ExportedFlowRecordTotalCount
  }
  
  object ExportedFlowRecordTotalCount extends IE(42, "exportedFlowRecordTotalCount", Unsigned64, TotalCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = ExportedFlowRecordTotalCount(Unsigned64.load(b, l))
  }

  case class Ipv4RouterSc(value: InetAddress) extends InetField {
    val info = Ipv4RouterSc
  }
  
  object Ipv4RouterSc extends IE(43, "ipv4RouterSc", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Ipv4RouterSc(Ipv4Address.load(b, l))
  }

  case class SourceIPv4Prefix(value: InetAddress) extends InetField {
    val info = SourceIPv4Prefix
  }
  
  object SourceIPv4Prefix extends IE(44, "sourceIPv4Prefix", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SourceIPv4Prefix(Ipv4Address.load(b, l))
  }

  case class DestinationIPv4Prefix(value: InetAddress) extends InetField {
    val info = DestinationIPv4Prefix
  }
  
  object DestinationIPv4Prefix extends IE(45, "destinationIPv4Prefix", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DestinationIPv4Prefix(Ipv4Address.load(b, l))
  }

  case class MplsTopLabelType(value: Int) extends IntField {
    val info = MplsTopLabelType
  }
  
  object MplsTopLabelType extends IE(46, "mplsTopLabelType", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelType(Unsigned8.load(b, l))
  }

  case class MplsTopLabelIPv4Address(value: InetAddress) extends InetField {
    val info = MplsTopLabelIPv4Address
  }
  
  object MplsTopLabelIPv4Address extends IE(47, "mplsTopLabelIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelIPv4Address(Ipv4Address.load(b, l))
  }

  case class SamplerId(value: Int) extends IntField {
    val info = SamplerId
  }
  
  object SamplerId extends IE(48, "samplerId", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SamplerId(Unsigned8.load(b, l))
  }

  case class SamplerMode(value: Int) extends IntField {
    val info = SamplerMode
  }
  
  object SamplerMode extends IE(49, "samplerMode", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SamplerMode(Unsigned8.load(b, l))
  }

  case class SamplerRandomInterval(value: Int) extends IntField {
    val info = SamplerRandomInterval
  }
  
  object SamplerRandomInterval extends IE(50, "samplerRandomInterval", Unsigned32, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SamplerRandomInterval(Unsigned32.load(b, l))
  }

  case class ClassId(value: Int) extends IntField {
    val info = ClassId
  }
  
  object ClassId extends IE(51, "classId", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ClassId(Unsigned8.load(b, l))
  }

  case class MinimumTTL(value: Int) extends IntField {
    val info = MinimumTTL
  }
  
  object MinimumTTL extends IE(52, "minimumTTL", Unsigned8, NoSemantics, Hops) {
    def load(b: ByteIterCounter, l: Int) = MinimumTTL(Unsigned8.load(b, l))
  }

  case class MaximumTTL(value: Int) extends IntField {
    val info = MaximumTTL
  }
  
  object MaximumTTL extends IE(53, "maximumTTL", Unsigned8, NoSemantics, Hops) {
    def load(b: ByteIterCounter, l: Int) = MaximumTTL(Unsigned8.load(b, l))
  }

  case class FragmentIdentification(value: Int) extends IntField {
    val info = FragmentIdentification
  }
  
  object FragmentIdentification extends IE(54, "fragmentIdentification", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FragmentIdentification(Unsigned32.load(b, l))
  }

  case class PostIpClassOfService(value: Int) extends IntField {
    val info = PostIpClassOfService
  }
  
  object PostIpClassOfService extends IE(55, "postIpClassOfService", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostIpClassOfService(Unsigned8.load(b, l))
  }

  case class SourceMacAddress(value: Array[Byte]) extends BytesField {
    val info = SourceMacAddress
  }
  
  object SourceMacAddress extends IE(56, "sourceMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SourceMacAddress(MacAddress.load(b, l))
  }

  case class PostDestinationMacAddress(value: Array[Byte]) extends BytesField {
    val info = PostDestinationMacAddress
  }
  
  object PostDestinationMacAddress extends IE(57, "postDestinationMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostDestinationMacAddress(MacAddress.load(b, l))
  }

  case class VlanId(value: Int) extends IntField {
    val info = VlanId
  }
  
  object VlanId extends IE(58, "vlanId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = VlanId(Unsigned16.load(b, l))
  }

  case class PostVlanId(value: Int) extends IntField {
    val info = PostVlanId
  }
  
  object PostVlanId extends IE(59, "postVlanId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostVlanId(Unsigned16.load(b, l))
  }

  case class IpVersion(value: Int) extends IntField {
    val info = IpVersion
  }
  
  object IpVersion extends IE(60, "ipVersion", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpVersion(Unsigned8.load(b, l))
  }

  case class FlowDirection(value: Int) extends IntField {
    val info = FlowDirection
  }
  
  object FlowDirection extends IE(61, "flowDirection", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlowDirection(Unsigned8.load(b, l))
  }

  case class IpNextHopIPv6Address(value: InetAddress) extends InetField {
    val info = IpNextHopIPv6Address
  }
  
  object IpNextHopIPv6Address extends IE(62, "ipNextHopIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpNextHopIPv6Address(Ipv6Address.load(b, l))
  }

  case class BgpNextHopIPv6Address(value: InetAddress) extends InetField {
    val info = BgpNextHopIPv6Address
  }
  
  object BgpNextHopIPv6Address extends IE(63, "bgpNextHopIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpNextHopIPv6Address(Ipv6Address.load(b, l))
  }

  case class Ipv6ExtensionHeaders(value: Int) extends IntField {
    val info = Ipv6ExtensionHeaders
  }
  
  object Ipv6ExtensionHeaders extends IE(64, "ipv6ExtensionHeaders", Unsigned32, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Ipv6ExtensionHeaders(Unsigned32.load(b, l))
  }

  case class MplsTopLabelStackSection(value: Array[Byte]) extends BytesField {
    val info = MplsTopLabelStackSection
  }
  
  object MplsTopLabelStackSection extends IE(70, "mplsTopLabelStackSection", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelStackSection(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection2(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection2
  }
  
  object MplsLabelStackSection2 extends IE(71, "mplsLabelStackSection2", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection2(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection3(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection3
  }
  
  object MplsLabelStackSection3 extends IE(72, "mplsLabelStackSection3", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection3(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection4(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection4
  }
  
  object MplsLabelStackSection4 extends IE(73, "mplsLabelStackSection4", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection4(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection5(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection5
  }
  
  object MplsLabelStackSection5 extends IE(74, "mplsLabelStackSection5", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection5(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection6(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection6
  }
  
  object MplsLabelStackSection6 extends IE(75, "mplsLabelStackSection6", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection6(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection7(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection7
  }
  
  object MplsLabelStackSection7 extends IE(76, "mplsLabelStackSection7", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection7(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection8(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection8
  }
  
  object MplsLabelStackSection8 extends IE(77, "mplsLabelStackSection8", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection8(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection9(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection9
  }
  
  object MplsLabelStackSection9 extends IE(78, "mplsLabelStackSection9", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection9(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection10(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection10
  }
  
  object MplsLabelStackSection10 extends IE(79, "mplsLabelStackSection10", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection10(OctetArray.load(b, l))
  }

  case class DestinationMacAddress(value: Array[Byte]) extends BytesField {
    val info = DestinationMacAddress
  }
  
  object DestinationMacAddress extends IE(80, "destinationMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DestinationMacAddress(MacAddress.load(b, l))
  }

  case class PostSourceMacAddress(value: Array[Byte]) extends BytesField {
    val info = PostSourceMacAddress
  }
  
  object PostSourceMacAddress extends IE(81, "postSourceMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostSourceMacAddress(MacAddress.load(b, l))
  }

  case class InterfaceName(value: String) extends StringField {
    val info = InterfaceName
  }
  
  object InterfaceName extends IE(82, "interfaceName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InterfaceName(StringIE.load(b, l))
  }

  case class InterfaceDescription(value: String) extends StringField {
    val info = InterfaceDescription
  }
  
  object InterfaceDescription extends IE(83, "interfaceDescription", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InterfaceDescription(StringIE.load(b, l))
  }

  case class SamplerName(value: String) extends StringField {
    val info = SamplerName
  }
  
  object SamplerName extends IE(84, "samplerName", StringIE, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SamplerName(StringIE.load(b, l))
  }

  case class OctetTotalCount(value: Long) extends LongField {
    val info = OctetTotalCount
  }
  
  object OctetTotalCount extends IE(85, "octetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = OctetTotalCount(Unsigned64.load(b, l))
  }

  case class PacketTotalCount(value: Long) extends LongField {
    val info = PacketTotalCount
  }
  
  object PacketTotalCount extends IE(86, "packetTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = PacketTotalCount(Unsigned64.load(b, l))
  }

  case class FlagsAndSamplerId(value: Int) extends IntField {
    val info = FlagsAndSamplerId
  }
  
  object FlagsAndSamplerId extends IE(87, "flagsAndSamplerId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlagsAndSamplerId(Unsigned32.load(b, l))
  }

  case class FragmentOffset(value: Int) extends IntField {
    val info = FragmentOffset
  }
  
  object FragmentOffset extends IE(88, "fragmentOffset", Unsigned16, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FragmentOffset(Unsigned16.load(b, l))
  }

  case class ForwardingStatus(value: Int) extends IntField {
    val info = ForwardingStatus
  }
  
  object ForwardingStatus extends IE(89, "forwardingStatus", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ForwardingStatus(Unsigned32.load(b, l))
  }

  case class MplsVpnRouteDistinguisher(value: Array[Byte]) extends BytesField {
    val info = MplsVpnRouteDistinguisher
  }
  
  object MplsVpnRouteDistinguisher extends IE(90, "mplsVpnRouteDistinguisher", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsVpnRouteDistinguisher(OctetArray.load(b, l))
  }

  case class MplsTopLabelPrefixLength(value: Int) extends IntField {
    val info = MplsTopLabelPrefixLength
  }
  
  object MplsTopLabelPrefixLength extends IE(91, "mplsTopLabelPrefixLength", Unsigned8, Quantity, Bits) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelPrefixLength(Unsigned8.load(b, l))
  }

  case class SrcTrafficIndex(value: Int) extends IntField {
    val info = SrcTrafficIndex
  }
  
  object SrcTrafficIndex extends IE(92, "srcTrafficIndex", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SrcTrafficIndex(Unsigned32.load(b, l))
  }

  case class DstTrafficIndex(value: Int) extends IntField {
    val info = DstTrafficIndex
  }
  
  object DstTrafficIndex extends IE(93, "dstTrafficIndex", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DstTrafficIndex(Unsigned32.load(b, l))
  }

  case class ApplicationDescription(value: String) extends StringField {
    val info = ApplicationDescription
  }
  
  object ApplicationDescription extends IE(94, "applicationDescription", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ApplicationDescription(StringIE.load(b, l))
  }

  case class ApplicationId(value: Array[Byte]) extends BytesField {
    val info = ApplicationId
  }
  
  object ApplicationId extends IE(95, "applicationId", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ApplicationId(OctetArray.load(b, l))
  }

  case class ApplicationName(value: String) extends StringField {
    val info = ApplicationName
  }
  
  object ApplicationName extends IE(96, "applicationName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ApplicationName(StringIE.load(b, l))
  }

  case class PostIpDiffServCodePoint(value: Int) extends IntField {
    val info = PostIpDiffServCodePoint
  }
  
  object PostIpDiffServCodePoint extends IE(98, "postIpDiffServCodePoint", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostIpDiffServCodePoint(Unsigned8.load(b, l))
  }

  case class MulticastReplicationFactor(value: Int) extends IntField {
    val info = MulticastReplicationFactor
  }
  
  object MulticastReplicationFactor extends IE(99, "multicastReplicationFactor", Unsigned32, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MulticastReplicationFactor(Unsigned32.load(b, l))
  }

  case class ClassName(value: String) extends StringField {
    val info = ClassName
  }
  
  object ClassName extends IE(100, "className", StringIE, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ClassName(StringIE.load(b, l))
  }

  case class ClassificationEngineId(value: Int) extends IntField {
    val info = ClassificationEngineId
  }
  
  object ClassificationEngineId extends IE(101, "classificationEngineId", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ClassificationEngineId(Unsigned8.load(b, l))
  }

  case class Layer2packetSectionOffset(value: Int) extends IntField {
    val info = Layer2packetSectionOffset
  }
  
  object Layer2packetSectionOffset extends IE(102, "layer2packetSectionOffset", Unsigned16, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Layer2packetSectionOffset(Unsigned16.load(b, l))
  }

  case class Layer2packetSectionSize(value: Int) extends IntField {
    val info = Layer2packetSectionSize
  }
  
  object Layer2packetSectionSize extends IE(103, "layer2packetSectionSize", Unsigned16, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Layer2packetSectionSize(Unsigned16.load(b, l))
  }

  case class Layer2packetSectionData(value: Array[Byte]) extends BytesField {
    val info = Layer2packetSectionData
  }
  
  object Layer2packetSectionData extends IE(104, "layer2packetSectionData", OctetArray, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Layer2packetSectionData(OctetArray.load(b, l))
  }

  case class BgpNextAdjacentAsNumber(value: Int) extends IntField {
    val info = BgpNextAdjacentAsNumber
  }
  
  object BgpNextAdjacentAsNumber extends IE(128, "bgpNextAdjacentAsNumber", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpNextAdjacentAsNumber(Unsigned32.load(b, l))
  }

  case class BgpPrevAdjacentAsNumber(value: Int) extends IntField {
    val info = BgpPrevAdjacentAsNumber
  }
  
  object BgpPrevAdjacentAsNumber extends IE(129, "bgpPrevAdjacentAsNumber", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpPrevAdjacentAsNumber(Unsigned32.load(b, l))
  }

  case class ExporterIPv4Address(value: InetAddress) extends InetField {
    val info = ExporterIPv4Address
  }
  
  object ExporterIPv4Address extends IE(130, "exporterIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExporterIPv4Address(Ipv4Address.load(b, l))
  }

  case class ExporterIPv6Address(value: InetAddress) extends InetField {
    val info = ExporterIPv6Address
  }
  
  object ExporterIPv6Address extends IE(131, "exporterIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExporterIPv6Address(Ipv6Address.load(b, l))
  }

  case class DroppedOctetDeltaCount(value: Long) extends LongField {
    val info = DroppedOctetDeltaCount
  }
  
  object DroppedOctetDeltaCount extends IE(132, "droppedOctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = DroppedOctetDeltaCount(Unsigned64.load(b, l))
  }

  case class DroppedPacketDeltaCount(value: Long) extends LongField {
    val info = DroppedPacketDeltaCount
  }
  
  object DroppedPacketDeltaCount extends IE(133, "droppedPacketDeltaCount", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = DroppedPacketDeltaCount(Unsigned64.load(b, l))
  }

  case class DroppedOctetTotalCount(value: Long) extends LongField {
    val info = DroppedOctetTotalCount
  }
  
  object DroppedOctetTotalCount extends IE(134, "droppedOctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = DroppedOctetTotalCount(Unsigned64.load(b, l))
  }

  case class DroppedPacketTotalCount(value: Long) extends LongField {
    val info = DroppedPacketTotalCount
  }
  
  object DroppedPacketTotalCount extends IE(135, "droppedPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = DroppedPacketTotalCount(Unsigned64.load(b, l))
  }

  case class FlowEndReason(value: Int) extends IntField {
    val info = FlowEndReason
  }
  
  object FlowEndReason extends IE(136, "flowEndReason", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlowEndReason(Unsigned8.load(b, l))
  }

  case class CommonPropertiesId(value: Long) extends LongField {
    val info = CommonPropertiesId
  }
  
  object CommonPropertiesId extends IE(137, "commonPropertiesId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = CommonPropertiesId(Unsigned64.load(b, l))
  }

  case class ObservationPointId(value: Long) extends LongField {
    val info = ObservationPointId
  }
  
  object ObservationPointId extends IE(138, "observationPointId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ObservationPointId(Unsigned64.load(b, l))
  }

  case class IcmpTypeCodeIPv6(value: Int) extends IntField {
    val info = IcmpTypeCodeIPv6
  }
  
  object IcmpTypeCodeIPv6 extends IE(139, "icmpTypeCodeIPv6", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IcmpTypeCodeIPv6(Unsigned16.load(b, l))
  }

  case class MplsTopLabelIPv6Address(value: InetAddress) extends InetField {
    val info = MplsTopLabelIPv6Address
  }
  
  object MplsTopLabelIPv6Address extends IE(140, "mplsTopLabelIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelIPv6Address(Ipv6Address.load(b, l))
  }

  case class LineCardId(value: Int) extends IntField {
    val info = LineCardId
  }
  
  object LineCardId extends IE(141, "lineCardId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = LineCardId(Unsigned32.load(b, l))
  }

  case class PortId(value: Int) extends IntField {
    val info = PortId
  }
  
  object PortId extends IE(142, "portId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PortId(Unsigned32.load(b, l))
  }

  case class MeteringProcessId(value: Int) extends IntField {
    val info = MeteringProcessId
  }
  
  object MeteringProcessId extends IE(143, "meteringProcessId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MeteringProcessId(Unsigned32.load(b, l))
  }

  case class ExportingProcessId(value: Int) extends IntField {
    val info = ExportingProcessId
  }
  
  object ExportingProcessId extends IE(144, "exportingProcessId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExportingProcessId(Unsigned32.load(b, l))
  }

  case class TemplateId(value: Int) extends IntField {
    val info = TemplateId
  }
  
  object TemplateId extends IE(145, "templateId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TemplateId(Unsigned16.load(b, l))
  }

  case class WlanChannelId(value: Int) extends IntField {
    val info = WlanChannelId
  }
  
  object WlanChannelId extends IE(146, "wlanChannelId", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = WlanChannelId(Unsigned8.load(b, l))
  }

  case class WlanSSID(value: String) extends StringField {
    val info = WlanSSID
  }
  
  object WlanSSID extends IE(147, "wlanSSID", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = WlanSSID(StringIE.load(b, l))
  }

  case class FlowId(value: Long) extends LongField {
    val info = FlowId
  }
  
  object FlowId extends IE(148, "flowId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlowId(Unsigned64.load(b, l))
  }

  case class ObservationDomainId(value: Int) extends IntField {
    val info = ObservationDomainId
  }
  
  object ObservationDomainId extends IE(149, "observationDomainId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ObservationDomainId(Unsigned32.load(b, l))
  }

  case class FlowStartSeconds(value: Timestamp) extends DateField {
    val info = FlowStartSeconds
  }
  
  object FlowStartSeconds extends IE(150, "flowStartSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = FlowStartSeconds(DateTimeSeconds.load(b, l))
  }

  case class FlowEndSeconds(value: Timestamp) extends DateField {
    val info = FlowEndSeconds
  }
  
  object FlowEndSeconds extends IE(151, "flowEndSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = FlowEndSeconds(DateTimeSeconds.load(b, l))
  }

  case class FlowStartMilliseconds(value: Timestamp) extends DateField {
    val info = FlowStartMilliseconds
  }
  
  object FlowStartMilliseconds extends IE(152, "flowStartMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowStartMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class FlowEndMilliseconds(value: Timestamp) extends DateField {
    val info = FlowEndMilliseconds
  }
  
  object FlowEndMilliseconds extends IE(153, "flowEndMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowEndMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class FlowStartMicroseconds(value: Timestamp) extends DateField {
    val info = FlowStartMicroseconds
  }
  
  object FlowStartMicroseconds extends IE(154, "flowStartMicroseconds", DateTimeMicroseconds, Default, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowStartMicroseconds(DateTimeMicroseconds.load(b, l))
  }

  case class FlowEndMicroseconds(value: Timestamp) extends DateField {
    val info = FlowEndMicroseconds
  }
  
  object FlowEndMicroseconds extends IE(155, "flowEndMicroseconds", DateTimeMicroseconds, Default, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowEndMicroseconds(DateTimeMicroseconds.load(b, l))
  }

  case class FlowStartNanoseconds(value: Timestamp) extends DateField {
    val info = FlowStartNanoseconds
  }
  
  object FlowStartNanoseconds extends IE(156, "flowStartNanoseconds", DateTimeNanoseconds, Default, Nanoseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowStartNanoseconds(DateTimeNanoseconds.load(b, l))
  }

  case class FlowEndNanoseconds(value: Timestamp) extends DateField {
    val info = FlowEndNanoseconds
  }
  
  object FlowEndNanoseconds extends IE(157, "flowEndNanoseconds", DateTimeNanoseconds, Default, Nanoseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowEndNanoseconds(DateTimeNanoseconds.load(b, l))
  }

  case class FlowStartDeltaMicroseconds(value: Int) extends IntField {
    val info = FlowStartDeltaMicroseconds
  }
  
  object FlowStartDeltaMicroseconds extends IE(158, "flowStartDeltaMicroseconds", Unsigned32, NoSemantics, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowStartDeltaMicroseconds(Unsigned32.load(b, l))
  }

  case class FlowEndDeltaMicroseconds(value: Int) extends IntField {
    val info = FlowEndDeltaMicroseconds
  }
  
  object FlowEndDeltaMicroseconds extends IE(159, "flowEndDeltaMicroseconds", Unsigned32, NoSemantics, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowEndDeltaMicroseconds(Unsigned32.load(b, l))
  }

  case class SystemInitTimeMilliseconds(value: Timestamp) extends DateField {
    val info = SystemInitTimeMilliseconds
  }
  
  object SystemInitTimeMilliseconds extends IE(160, "systemInitTimeMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = SystemInitTimeMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class FlowDurationMilliseconds(value: Int) extends IntField {
    val info = FlowDurationMilliseconds
  }
  
  object FlowDurationMilliseconds extends IE(161, "flowDurationMilliseconds", Unsigned32, NoSemantics, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowDurationMilliseconds(Unsigned32.load(b, l))
  }

  case class FlowDurationMicroseconds(value: Int) extends IntField {
    val info = FlowDurationMicroseconds
  }
  
  object FlowDurationMicroseconds extends IE(162, "flowDurationMicroseconds", Unsigned32, NoSemantics, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowDurationMicroseconds(Unsigned32.load(b, l))
  }

  case class ObservedFlowTotalCount(value: Long) extends LongField {
    val info = ObservedFlowTotalCount
  }
  
  object ObservedFlowTotalCount extends IE(163, "observedFlowTotalCount", Unsigned64, TotalCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = ObservedFlowTotalCount(Unsigned64.load(b, l))
  }

  case class IgnoredPacketTotalCount(value: Long) extends LongField {
    val info = IgnoredPacketTotalCount
  }
  
  object IgnoredPacketTotalCount extends IE(164, "ignoredPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = IgnoredPacketTotalCount(Unsigned64.load(b, l))
  }

  case class IgnoredOctetTotalCount(value: Long) extends LongField {
    val info = IgnoredOctetTotalCount
  }
  
  object IgnoredOctetTotalCount extends IE(165, "ignoredOctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = IgnoredOctetTotalCount(Unsigned64.load(b, l))
  }

  case class NotSentFlowTotalCount(value: Long) extends LongField {
    val info = NotSentFlowTotalCount
  }
  
  object NotSentFlowTotalCount extends IE(166, "notSentFlowTotalCount", Unsigned64, TotalCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = NotSentFlowTotalCount(Unsigned64.load(b, l))
  }

  case class NotSentPacketTotalCount(value: Long) extends LongField {
    val info = NotSentPacketTotalCount
  }
  
  object NotSentPacketTotalCount extends IE(167, "notSentPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = NotSentPacketTotalCount(Unsigned64.load(b, l))
  }

  case class NotSentOctetTotalCount(value: Long) extends LongField {
    val info = NotSentOctetTotalCount
  }
  
  object NotSentOctetTotalCount extends IE(168, "notSentOctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = NotSentOctetTotalCount(Unsigned64.load(b, l))
  }

  case class DestinationIPv6Prefix(value: InetAddress) extends InetField {
    val info = DestinationIPv6Prefix
  }
  
  object DestinationIPv6Prefix extends IE(169, "destinationIPv6Prefix", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DestinationIPv6Prefix(Ipv6Address.load(b, l))
  }

  case class SourceIPv6Prefix(value: InetAddress) extends InetField {
    val info = SourceIPv6Prefix
  }
  
  object SourceIPv6Prefix extends IE(170, "sourceIPv6Prefix", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SourceIPv6Prefix(Ipv6Address.load(b, l))
  }

  case class PostOctetTotalCount(value: Long) extends LongField {
    val info = PostOctetTotalCount
  }
  
  object PostOctetTotalCount extends IE(171, "postOctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostOctetTotalCount(Unsigned64.load(b, l))
  }

  case class PostPacketTotalCount(value: Long) extends LongField {
    val info = PostPacketTotalCount
  }
  
  object PostPacketTotalCount extends IE(172, "postPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = PostPacketTotalCount(Unsigned64.load(b, l))
  }

  case class FlowKeyIndicator(value: Long) extends LongField {
    val info = FlowKeyIndicator
  }
  
  object FlowKeyIndicator extends IE(173, "flowKeyIndicator", Unsigned64, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlowKeyIndicator(Unsigned64.load(b, l))
  }

  case class PostMCastPacketTotalCount(value: Long) extends LongField {
    val info = PostMCastPacketTotalCount
  }
  
  object PostMCastPacketTotalCount extends IE(174, "postMCastPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = PostMCastPacketTotalCount(Unsigned64.load(b, l))
  }

  case class PostMCastOctetTotalCount(value: Long) extends LongField {
    val info = PostMCastOctetTotalCount
  }
  
  object PostMCastOctetTotalCount extends IE(175, "postMCastOctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostMCastOctetTotalCount(Unsigned64.load(b, l))
  }

  case class IcmpTypeIPv4(value: Int) extends IntField {
    val info = IcmpTypeIPv4
  }
  
  object IcmpTypeIPv4 extends IE(176, "icmpTypeIPv4", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IcmpTypeIPv4(Unsigned8.load(b, l))
  }

  case class IcmpCodeIPv4(value: Int) extends IntField {
    val info = IcmpCodeIPv4
  }
  
  object IcmpCodeIPv4 extends IE(177, "icmpCodeIPv4", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IcmpCodeIPv4(Unsigned8.load(b, l))
  }

  case class IcmpTypeIPv6(value: Int) extends IntField {
    val info = IcmpTypeIPv6
  }
  
  object IcmpTypeIPv6 extends IE(178, "icmpTypeIPv6", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IcmpTypeIPv6(Unsigned8.load(b, l))
  }

  case class IcmpCodeIPv6(value: Int) extends IntField {
    val info = IcmpCodeIPv6
  }
  
  object IcmpCodeIPv6 extends IE(179, "icmpCodeIPv6", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IcmpCodeIPv6(Unsigned8.load(b, l))
  }

  case class UdpSourcePort(value: Int) extends IntField {
    val info = UdpSourcePort
  }
  
  object UdpSourcePort extends IE(180, "udpSourcePort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = UdpSourcePort(Unsigned16.load(b, l))
  }

  case class UdpDestinationPort(value: Int) extends IntField {
    val info = UdpDestinationPort
  }
  
  object UdpDestinationPort extends IE(181, "udpDestinationPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = UdpDestinationPort(Unsigned16.load(b, l))
  }

  case class TcpSourcePort(value: Int) extends IntField {
    val info = TcpSourcePort
  }
  
  object TcpSourcePort extends IE(182, "tcpSourcePort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpSourcePort(Unsigned16.load(b, l))
  }

  case class TcpDestinationPort(value: Int) extends IntField {
    val info = TcpDestinationPort
  }
  
  object TcpDestinationPort extends IE(183, "tcpDestinationPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpDestinationPort(Unsigned16.load(b, l))
  }

  case class TcpSequenceNumber(value: Int) extends IntField {
    val info = TcpSequenceNumber
  }
  
  object TcpSequenceNumber extends IE(184, "tcpSequenceNumber", Unsigned32, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpSequenceNumber(Unsigned32.load(b, l))
  }

  case class TcpAcknowledgementNumber(value: Int) extends IntField {
    val info = TcpAcknowledgementNumber
  }
  
  object TcpAcknowledgementNumber extends IE(185, "tcpAcknowledgementNumber", Unsigned32, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpAcknowledgementNumber(Unsigned32.load(b, l))
  }

  case class TcpWindowSize(value: Int) extends IntField {
    val info = TcpWindowSize
  }
  
  object TcpWindowSize extends IE(186, "tcpWindowSize", Unsigned16, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpWindowSize(Unsigned16.load(b, l))
  }

  case class TcpUrgentPointer(value: Int) extends IntField {
    val info = TcpUrgentPointer
  }
  
  object TcpUrgentPointer extends IE(187, "tcpUrgentPointer", Unsigned16, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpUrgentPointer(Unsigned16.load(b, l))
  }

  case class TcpHeaderLength(value: Int) extends IntField {
    val info = TcpHeaderLength
  }
  
  object TcpHeaderLength extends IE(188, "tcpHeaderLength", Unsigned8, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = TcpHeaderLength(Unsigned8.load(b, l))
  }

  case class IpHeaderLength(value: Int) extends IntField {
    val info = IpHeaderLength
  }
  
  object IpHeaderLength extends IE(189, "ipHeaderLength", Unsigned8, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = IpHeaderLength(Unsigned8.load(b, l))
  }

  case class TotalLengthIPv4(value: Int) extends IntField {
    val info = TotalLengthIPv4
  }
  
  object TotalLengthIPv4 extends IE(190, "totalLengthIPv4", Unsigned16, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = TotalLengthIPv4(Unsigned16.load(b, l))
  }

  case class PayloadLengthIPv6(value: Int) extends IntField {
    val info = PayloadLengthIPv6
  }
  
  object PayloadLengthIPv6 extends IE(191, "payloadLengthIPv6", Unsigned16, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = PayloadLengthIPv6(Unsigned16.load(b, l))
  }

  case class IpTTL(value: Int) extends IntField {
    val info = IpTTL
  }
  
  object IpTTL extends IE(192, "ipTTL", Unsigned8, NoSemantics, Hops) {
    def load(b: ByteIterCounter, l: Int) = IpTTL(Unsigned8.load(b, l))
  }

  case class NextHeaderIPv6(value: Int) extends IntField {
    val info = NextHeaderIPv6
  }
  
  object NextHeaderIPv6 extends IE(193, "nextHeaderIPv6", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NextHeaderIPv6(Unsigned8.load(b, l))
  }

  case class MplsPayloadLength(value: Int) extends IntField {
    val info = MplsPayloadLength
  }
  
  object MplsPayloadLength extends IE(194, "mplsPayloadLength", Unsigned32, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = MplsPayloadLength(Unsigned32.load(b, l))
  }

  case class IpDiffServCodePoint(value: Int) extends IntField {
    val info = IpDiffServCodePoint
  }
  
  object IpDiffServCodePoint extends IE(195, "ipDiffServCodePoint", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpDiffServCodePoint(Unsigned8.load(b, l))
  }

  case class IpPrecedence(value: Int) extends IntField {
    val info = IpPrecedence
  }
  
  object IpPrecedence extends IE(196, "ipPrecedence", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpPrecedence(Unsigned8.load(b, l))
  }

  case class FragmentFlags(value: Int) extends IntField {
    val info = FragmentFlags
  }
  
  object FragmentFlags extends IE(197, "fragmentFlags", Unsigned8, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FragmentFlags(Unsigned8.load(b, l))
  }

  case class OctetDeltaSumOfSquares(value: Long) extends LongField {
    val info = OctetDeltaSumOfSquares
  }
  
  object OctetDeltaSumOfSquares extends IE(198, "octetDeltaSumOfSquares", Unsigned64, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = OctetDeltaSumOfSquares(Unsigned64.load(b, l))
  }

  case class OctetTotalSumOfSquares(value: Long) extends LongField {
    val info = OctetTotalSumOfSquares
  }
  
  object OctetTotalSumOfSquares extends IE(199, "octetTotalSumOfSquares", Unsigned64, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = OctetTotalSumOfSquares(Unsigned64.load(b, l))
  }

  case class MplsTopLabelTTL(value: Int) extends IntField {
    val info = MplsTopLabelTTL
  }
  
  object MplsTopLabelTTL extends IE(200, "mplsTopLabelTTL", Unsigned8, NoSemantics, Hops) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelTTL(Unsigned8.load(b, l))
  }

  case class MplsLabelStackLength(value: Int) extends IntField {
    val info = MplsLabelStackLength
  }
  
  object MplsLabelStackLength extends IE(201, "mplsLabelStackLength", Unsigned32, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackLength(Unsigned32.load(b, l))
  }

  case class MplsLabelStackDepth(value: Int) extends IntField {
    val info = MplsLabelStackDepth
  }
  
  object MplsLabelStackDepth extends IE(202, "mplsLabelStackDepth", Unsigned32, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackDepth(Unsigned32.load(b, l))
  }

  case class MplsTopLabelExp(value: Int) extends IntField {
    val info = MplsTopLabelExp
  }
  
  object MplsTopLabelExp extends IE(203, "mplsTopLabelExp", Unsigned8, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsTopLabelExp(Unsigned8.load(b, l))
  }

  case class IpPayloadLength(value: Int) extends IntField {
    val info = IpPayloadLength
  }
  
  object IpPayloadLength extends IE(204, "ipPayloadLength", Unsigned32, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = IpPayloadLength(Unsigned32.load(b, l))
  }

  case class UdpMessageLength(value: Int) extends IntField {
    val info = UdpMessageLength
  }
  
  object UdpMessageLength extends IE(205, "udpMessageLength", Unsigned16, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = UdpMessageLength(Unsigned16.load(b, l))
  }

  case class IsMulticast(value: Int) extends IntField {
    val info = IsMulticast
  }
  
  object IsMulticast extends IE(206, "isMulticast", Unsigned8, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IsMulticast(Unsigned8.load(b, l))
  }

  case class Ipv4IHL(value: Int) extends IntField {
    val info = Ipv4IHL
  }
  
  object Ipv4IHL extends IE(207, "ipv4IHL", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Ipv4IHL(Unsigned8.load(b, l))
  }

  case class Ipv4Options(value: Int) extends IntField {
    val info = Ipv4Options
  }
  
  object Ipv4Options extends IE(208, "ipv4Options", Unsigned32, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Ipv4Options(Unsigned32.load(b, l))
  }

  case class TcpOptions(value: Long) extends LongField {
    val info = TcpOptions
  }
  
  object TcpOptions extends IE(209, "tcpOptions", Unsigned64, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpOptions(Unsigned64.load(b, l))
  }

  case class PaddingOctets(value: Array[Byte]) extends BytesField {
    val info = PaddingOctets
  }
  
  object PaddingOctets extends IE(210, "paddingOctets", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PaddingOctets(OctetArray.load(b, l))
  }

  case class CollectorIPv4Address(value: InetAddress) extends InetField {
    val info = CollectorIPv4Address
  }
  
  object CollectorIPv4Address extends IE(211, "collectorIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = CollectorIPv4Address(Ipv4Address.load(b, l))
  }

  case class CollectorIPv6Address(value: InetAddress) extends InetField {
    val info = CollectorIPv6Address
  }
  
  object CollectorIPv6Address extends IE(212, "collectorIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = CollectorIPv6Address(Ipv6Address.load(b, l))
  }

  case class ExportInterface(value: Int) extends IntField {
    val info = ExportInterface
  }
  
  object ExportInterface extends IE(213, "exportInterface", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExportInterface(Unsigned32.load(b, l))
  }

  case class ExportProtocolVersion(value: Int) extends IntField {
    val info = ExportProtocolVersion
  }
  
  object ExportProtocolVersion extends IE(214, "exportProtocolVersion", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExportProtocolVersion(Unsigned8.load(b, l))
  }

  case class ExportTransportProtocol(value: Int) extends IntField {
    val info = ExportTransportProtocol
  }
  
  object ExportTransportProtocol extends IE(215, "exportTransportProtocol", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExportTransportProtocol(Unsigned8.load(b, l))
  }

  case class CollectorTransportPort(value: Int) extends IntField {
    val info = CollectorTransportPort
  }
  
  object CollectorTransportPort extends IE(216, "collectorTransportPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = CollectorTransportPort(Unsigned16.load(b, l))
  }

  case class ExporterTransportPort(value: Int) extends IntField {
    val info = ExporterTransportPort
  }
  
  object ExporterTransportPort extends IE(217, "exporterTransportPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExporterTransportPort(Unsigned16.load(b, l))
  }

  case class TcpSynTotalCount(value: Long) extends LongField {
    val info = TcpSynTotalCount
  }
  
  object TcpSynTotalCount extends IE(218, "tcpSynTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TcpSynTotalCount(Unsigned64.load(b, l))
  }

  case class TcpFinTotalCount(value: Long) extends LongField {
    val info = TcpFinTotalCount
  }
  
  object TcpFinTotalCount extends IE(219, "tcpFinTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TcpFinTotalCount(Unsigned64.load(b, l))
  }

  case class TcpRstTotalCount(value: Long) extends LongField {
    val info = TcpRstTotalCount
  }
  
  object TcpRstTotalCount extends IE(220, "tcpRstTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TcpRstTotalCount(Unsigned64.load(b, l))
  }

  case class TcpPshTotalCount(value: Long) extends LongField {
    val info = TcpPshTotalCount
  }
  
  object TcpPshTotalCount extends IE(221, "tcpPshTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TcpPshTotalCount(Unsigned64.load(b, l))
  }

  case class TcpAckTotalCount(value: Long) extends LongField {
    val info = TcpAckTotalCount
  }
  
  object TcpAckTotalCount extends IE(222, "tcpAckTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TcpAckTotalCount(Unsigned64.load(b, l))
  }

  case class TcpUrgTotalCount(value: Long) extends LongField {
    val info = TcpUrgTotalCount
  }
  
  object TcpUrgTotalCount extends IE(223, "tcpUrgTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TcpUrgTotalCount(Unsigned64.load(b, l))
  }

  case class IpTotalLength(value: Long) extends LongField {
    val info = IpTotalLength
  }
  
  object IpTotalLength extends IE(224, "ipTotalLength", Unsigned64, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = IpTotalLength(Unsigned64.load(b, l))
  }

  case class PostNATSourceIPv4Address(value: InetAddress) extends InetField {
    val info = PostNATSourceIPv4Address
  }
  
  object PostNATSourceIPv4Address extends IE(225, "postNATSourceIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostNATSourceIPv4Address(Ipv4Address.load(b, l))
  }

  case class PostNATDestinationIPv4Address(value: InetAddress) extends InetField {
    val info = PostNATDestinationIPv4Address
  }
  
  object PostNATDestinationIPv4Address extends IE(226, "postNATDestinationIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostNATDestinationIPv4Address(Ipv4Address.load(b, l))
  }

  case class PostNAPTSourceTransportPort(value: Int) extends IntField {
    val info = PostNAPTSourceTransportPort
  }
  
  object PostNAPTSourceTransportPort extends IE(227, "postNAPTSourceTransportPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostNAPTSourceTransportPort(Unsigned16.load(b, l))
  }

  case class PostNAPTDestinationTransportPort(value: Int) extends IntField {
    val info = PostNAPTDestinationTransportPort
  }
  
  object PostNAPTDestinationTransportPort extends IE(228, "postNAPTDestinationTransportPort", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostNAPTDestinationTransportPort(Unsigned16.load(b, l))
  }

  case class NatOriginatingAddressRealm(value: Int) extends IntField {
    val info = NatOriginatingAddressRealm
  }
  
  object NatOriginatingAddressRealm extends IE(229, "natOriginatingAddressRealm", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NatOriginatingAddressRealm(Unsigned8.load(b, l))
  }

  case class NatEvent(value: Int) extends IntField {
    val info = NatEvent
  }
  
  object NatEvent extends IE(230, "natEvent", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NatEvent(Unsigned8.load(b, l))
  }

  case class InitiatorOctets(value: Long) extends LongField {
    val info = InitiatorOctets
  }
  
  object InitiatorOctets extends IE(231, "initiatorOctets", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = InitiatorOctets(Unsigned64.load(b, l))
  }

  case class ResponderOctets(value: Long) extends LongField {
    val info = ResponderOctets
  }
  
  object ResponderOctets extends IE(232, "responderOctets", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = ResponderOctets(Unsigned64.load(b, l))
  }

  case class FirewallEvent(value: Int) extends IntField {
    val info = FirewallEvent
  }
  
  object FirewallEvent extends IE(233, "firewallEvent", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FirewallEvent(Unsigned8.load(b, l))
  }

  case class IngressVRFID(value: Int) extends IntField {
    val info = IngressVRFID
  }
  
  object IngressVRFID extends IE(234, "ingressVRFID", Unsigned32, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IngressVRFID(Unsigned32.load(b, l))
  }

  case class EgressVRFID(value: Int) extends IntField {
    val info = EgressVRFID
  }
  
  object EgressVRFID extends IE(235, "egressVRFID", Unsigned32, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EgressVRFID(Unsigned32.load(b, l))
  }

  case class VRFname(value: String) extends StringField {
    val info = VRFname
  }
  
  object VRFname extends IE(236, "VRFname", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = VRFname(StringIE.load(b, l))
  }

  case class PostMplsTopLabelExp(value: Int) extends IntField {
    val info = PostMplsTopLabelExp
  }
  
  object PostMplsTopLabelExp extends IE(237, "postMplsTopLabelExp", Unsigned8, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostMplsTopLabelExp(Unsigned8.load(b, l))
  }

  case class TcpWindowScale(value: Int) extends IntField {
    val info = TcpWindowScale
  }
  
  object TcpWindowScale extends IE(238, "tcpWindowScale", Unsigned16, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TcpWindowScale(Unsigned16.load(b, l))
  }

  case class BiflowDirection(value: Int) extends IntField {
    val info = BiflowDirection
  }
  
  object BiflowDirection extends IE(239, "biflowDirection", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BiflowDirection(Unsigned8.load(b, l))
  }

  case class EthernetHeaderLength(value: Int) extends IntField {
    val info = EthernetHeaderLength
  }
  
  object EthernetHeaderLength extends IE(240, "ethernetHeaderLength", Unsigned8, Quantity, Octets) {
    def load(b: ByteIterCounter, l: Int) = EthernetHeaderLength(Unsigned8.load(b, l))
  }

  case class EthernetPayloadLength(value: Int) extends IntField {
    val info = EthernetPayloadLength
  }
  
  object EthernetPayloadLength extends IE(241, "ethernetPayloadLength", Unsigned16, Quantity, Octets) {
    def load(b: ByteIterCounter, l: Int) = EthernetPayloadLength(Unsigned16.load(b, l))
  }

  case class EthernetTotalLength(value: Int) extends IntField {
    val info = EthernetTotalLength
  }
  
  object EthernetTotalLength extends IE(242, "ethernetTotalLength", Unsigned16, Quantity, Octets) {
    def load(b: ByteIterCounter, l: Int) = EthernetTotalLength(Unsigned16.load(b, l))
  }

  case class Dot1qVlanId(value: Int) extends IntField {
    val info = Dot1qVlanId
  }
  
  object Dot1qVlanId extends IE(243, "dot1qVlanId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qVlanId(Unsigned16.load(b, l))
  }

  case class Dot1qPriority(value: Int) extends IntField {
    val info = Dot1qPriority
  }
  
  object Dot1qPriority extends IE(244, "dot1qPriority", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qPriority(Unsigned8.load(b, l))
  }

  case class Dot1qCustomerVlanId(value: Int) extends IntField {
    val info = Dot1qCustomerVlanId
  }
  
  object Dot1qCustomerVlanId extends IE(245, "dot1qCustomerVlanId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qCustomerVlanId(Unsigned16.load(b, l))
  }

  case class Dot1qCustomerPriority(value: Int) extends IntField {
    val info = Dot1qCustomerPriority
  }
  
  object Dot1qCustomerPriority extends IE(246, "dot1qCustomerPriority", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qCustomerPriority(Unsigned8.load(b, l))
  }

  case class MetroEvcId(value: String) extends StringField {
    val info = MetroEvcId
  }
  
  object MetroEvcId extends IE(247, "metroEvcId", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MetroEvcId(StringIE.load(b, l))
  }

  case class MetroEvcType(value: Int) extends IntField {
    val info = MetroEvcType
  }
  
  object MetroEvcType extends IE(248, "metroEvcType", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MetroEvcType(Unsigned8.load(b, l))
  }

  case class PseudoWireId(value: Int) extends IntField {
    val info = PseudoWireId
  }
  
  object PseudoWireId extends IE(249, "pseudoWireId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PseudoWireId(Unsigned32.load(b, l))
  }

  case class PseudoWireType(value: Int) extends IntField {
    val info = PseudoWireType
  }
  
  object PseudoWireType extends IE(250, "pseudoWireType", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PseudoWireType(Unsigned16.load(b, l))
  }

  case class PseudoWireControlWord(value: Int) extends IntField {
    val info = PseudoWireControlWord
  }
  
  object PseudoWireControlWord extends IE(251, "pseudoWireControlWord", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PseudoWireControlWord(Unsigned32.load(b, l))
  }

  case class IngressPhysicalInterface(value: Int) extends IntField {
    val info = IngressPhysicalInterface
  }
  
  object IngressPhysicalInterface extends IE(252, "ingressPhysicalInterface", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IngressPhysicalInterface(Unsigned32.load(b, l))
  }

  case class EgressPhysicalInterface(value: Int) extends IntField {
    val info = EgressPhysicalInterface
  }
  
  object EgressPhysicalInterface extends IE(253, "egressPhysicalInterface", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EgressPhysicalInterface(Unsigned32.load(b, l))
  }

  case class PostDot1qVlanId(value: Int) extends IntField {
    val info = PostDot1qVlanId
  }
  
  object PostDot1qVlanId extends IE(254, "postDot1qVlanId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostDot1qVlanId(Unsigned16.load(b, l))
  }

  case class PostDot1qCustomerVlanId(value: Int) extends IntField {
    val info = PostDot1qCustomerVlanId
  }
  
  object PostDot1qCustomerVlanId extends IE(255, "postDot1qCustomerVlanId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostDot1qCustomerVlanId(Unsigned16.load(b, l))
  }

  case class EthernetType(value: Int) extends IntField {
    val info = EthernetType
  }
  
  object EthernetType extends IE(256, "ethernetType", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EthernetType(Unsigned16.load(b, l))
  }

  case class PostIpPrecedence(value: Int) extends IntField {
    val info = PostIpPrecedence
  }
  
  object PostIpPrecedence extends IE(257, "postIpPrecedence", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostIpPrecedence(Unsigned8.load(b, l))
  }

  case class CollectionTimeMilliseconds(value: Timestamp) extends DateField {
    val info = CollectionTimeMilliseconds
  }
  
  object CollectionTimeMilliseconds extends IE(258, "collectionTimeMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = CollectionTimeMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class ExportSctpStreamId(value: Int) extends IntField {
    val info = ExportSctpStreamId
  }
  
  object ExportSctpStreamId extends IE(259, "exportSctpStreamId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExportSctpStreamId(Unsigned16.load(b, l))
  }

  case class MaxExportSeconds(value: Timestamp) extends DateField {
    val info = MaxExportSeconds
  }
  
  object MaxExportSeconds extends IE(260, "maxExportSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = MaxExportSeconds(DateTimeSeconds.load(b, l))
  }

  case class MaxFlowEndSeconds(value: Timestamp) extends DateField {
    val info = MaxFlowEndSeconds
  }
  
  object MaxFlowEndSeconds extends IE(261, "maxFlowEndSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = MaxFlowEndSeconds(DateTimeSeconds.load(b, l))
  }

  case class MessageMD5Checksum(value: Array[Byte]) extends BytesField {
    val info = MessageMD5Checksum
  }
  
  object MessageMD5Checksum extends IE(262, "messageMD5Checksum", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MessageMD5Checksum(OctetArray.load(b, l))
  }

  case class MessageScope(value: Int) extends IntField {
    val info = MessageScope
  }
  
  object MessageScope extends IE(263, "messageScope", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MessageScope(Unsigned8.load(b, l))
  }

  case class MinExportSeconds(value: Timestamp) extends DateField {
    val info = MinExportSeconds
  }
  
  object MinExportSeconds extends IE(264, "minExportSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = MinExportSeconds(DateTimeSeconds.load(b, l))
  }

  case class MinFlowStartSeconds(value: Timestamp) extends DateField {
    val info = MinFlowStartSeconds
  }
  
  object MinFlowStartSeconds extends IE(265, "minFlowStartSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = MinFlowStartSeconds(DateTimeSeconds.load(b, l))
  }

  case class OpaqueOctets(value: Array[Byte]) extends BytesField {
    val info = OpaqueOctets
  }
  
  object OpaqueOctets extends IE(266, "opaqueOctets", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = OpaqueOctets(OctetArray.load(b, l))
  }

  case class SessionScope(value: Int) extends IntField {
    val info = SessionScope
  }
  
  object SessionScope extends IE(267, "sessionScope", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SessionScope(Unsigned8.load(b, l))
  }

  case class MaxFlowEndMicroseconds(value: Timestamp) extends DateField {
    val info = MaxFlowEndMicroseconds
  }
  
  object MaxFlowEndMicroseconds extends IE(268, "maxFlowEndMicroseconds", DateTimeMicroseconds, Default, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = MaxFlowEndMicroseconds(DateTimeMicroseconds.load(b, l))
  }

  case class MaxFlowEndMilliseconds(value: Timestamp) extends DateField {
    val info = MaxFlowEndMilliseconds
  }
  
  object MaxFlowEndMilliseconds extends IE(269, "maxFlowEndMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = MaxFlowEndMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class MaxFlowEndNanoseconds(value: Timestamp) extends DateField {
    val info = MaxFlowEndNanoseconds
  }
  
  object MaxFlowEndNanoseconds extends IE(270, "maxFlowEndNanoseconds", DateTimeNanoseconds, Default, Nanoseconds) {
    def load(b: ByteIterCounter, l: Int) = MaxFlowEndNanoseconds(DateTimeNanoseconds.load(b, l))
  }

  case class MinFlowStartMicroseconds(value: Timestamp) extends DateField {
    val info = MinFlowStartMicroseconds
  }
  
  object MinFlowStartMicroseconds extends IE(271, "minFlowStartMicroseconds", DateTimeMicroseconds, Default, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = MinFlowStartMicroseconds(DateTimeMicroseconds.load(b, l))
  }

  case class MinFlowStartMilliseconds(value: Timestamp) extends DateField {
    val info = MinFlowStartMilliseconds
  }
  
  object MinFlowStartMilliseconds extends IE(272, "minFlowStartMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = MinFlowStartMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class MinFlowStartNanoseconds(value: Timestamp) extends DateField {
    val info = MinFlowStartNanoseconds
  }
  
  object MinFlowStartNanoseconds extends IE(273, "minFlowStartNanoseconds", DateTimeNanoseconds, Default, Nanoseconds) {
    def load(b: ByteIterCounter, l: Int) = MinFlowStartNanoseconds(DateTimeNanoseconds.load(b, l))
  }

  case class CollectorCertificate(value: Array[Byte]) extends BytesField {
    val info = CollectorCertificate
  }
  
  object CollectorCertificate extends IE(274, "collectorCertificate", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = CollectorCertificate(OctetArray.load(b, l))
  }

  case class ExporterCertificate(value: Array[Byte]) extends BytesField {
    val info = ExporterCertificate
  }
  
  object ExporterCertificate extends IE(275, "exporterCertificate", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ExporterCertificate(OctetArray.load(b, l))
  }

  case class DataRecordsReliability(value: Boolean) extends BoolField {
    val info = DataRecordsReliability
  }
  
  object DataRecordsReliability extends IE(276, "dataRecordsReliability", BooleanIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DataRecordsReliability(BooleanIE.load(b, l))
  }

  case class ObservationPointType(value: Int) extends IntField {
    val info = ObservationPointType
  }
  
  object ObservationPointType extends IE(277, "observationPointType", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ObservationPointType(Unsigned8.load(b, l))
  }

  case class NewConnectionDeltaCount(value: Int) extends IntField {
    val info = NewConnectionDeltaCount
  }
  
  object NewConnectionDeltaCount extends IE(278, "newConnectionDeltaCount", Unsigned32, DeltaCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NewConnectionDeltaCount(Unsigned32.load(b, l))
  }

  case class ConnectionSumDurationSeconds(value: Long) extends LongField {
    val info = ConnectionSumDurationSeconds
  }
  
  object ConnectionSumDurationSeconds extends IE(279, "connectionSumDurationSeconds", Unsigned64, NoSemantics, Seconds) {
    def load(b: ByteIterCounter, l: Int) = ConnectionSumDurationSeconds(Unsigned64.load(b, l))
  }

  case class ConnectionTransactionId(value: Long) extends LongField {
    val info = ConnectionTransactionId
  }
  
  object ConnectionTransactionId extends IE(280, "connectionTransactionId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ConnectionTransactionId(Unsigned64.load(b, l))
  }

  case class PostNATSourceIPv6Address(value: InetAddress) extends InetField {
    val info = PostNATSourceIPv6Address
  }
  
  object PostNATSourceIPv6Address extends IE(281, "postNATSourceIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostNATSourceIPv6Address(Ipv6Address.load(b, l))
  }

  case class PostNATDestinationIPv6Address(value: InetAddress) extends InetField {
    val info = PostNATDestinationIPv6Address
  }
  
  object PostNATDestinationIPv6Address extends IE(282, "postNATDestinationIPv6Address", Ipv6Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PostNATDestinationIPv6Address(Ipv6Address.load(b, l))
  }

  case class NatPoolId(value: Int) extends IntField {
    val info = NatPoolId
  }
  
  object NatPoolId extends IE(283, "natPoolId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NatPoolId(Unsigned32.load(b, l))
  }

  case class NatPoolName(value: String) extends StringField {
    val info = NatPoolName
  }
  
  object NatPoolName extends IE(284, "natPoolName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NatPoolName(StringIE.load(b, l))
  }

  case class AnonymizationFlags(value: Int) extends IntField {
    val info = AnonymizationFlags
  }
  
  object AnonymizationFlags extends IE(285, "anonymizationFlags", Unsigned16, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = AnonymizationFlags(Unsigned16.load(b, l))
  }

  case class AnonymizationTechnique(value: Int) extends IntField {
    val info = AnonymizationTechnique
  }
  
  object AnonymizationTechnique extends IE(286, "anonymizationTechnique", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = AnonymizationTechnique(Unsigned16.load(b, l))
  }

  case class InformationElementIndex(value: Int) extends IntField {
    val info = InformationElementIndex
  }
  
  object InformationElementIndex extends IE(287, "informationElementIndex", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementIndex(Unsigned16.load(b, l))
  }

  case class P2pTechnology(value: String) extends StringField {
    val info = P2pTechnology
  }
  
  object P2pTechnology extends IE(288, "p2pTechnology", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = P2pTechnology(StringIE.load(b, l))
  }

  case class TunnelTechnology(value: String) extends StringField {
    val info = TunnelTechnology
  }
  
  object TunnelTechnology extends IE(289, "tunnelTechnology", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = TunnelTechnology(StringIE.load(b, l))
  }

  case class EncryptedTechnology(value: String) extends StringField {
    val info = EncryptedTechnology
  }
  
  object EncryptedTechnology extends IE(290, "encryptedTechnology", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EncryptedTechnology(StringIE.load(b, l))
  }

  case class BgpValidityState(value: Int) extends IntField {
    val info = BgpValidityState
  }
  
  object BgpValidityState extends IE(294, "bgpValidityState", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = BgpValidityState(Unsigned8.load(b, l))
  }

  case class IPSecSPI(value: Int) extends IntField {
    val info = IPSecSPI
  }
  
  object IPSecSPI extends IE(295, "IPSecSPI", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IPSecSPI(Unsigned32.load(b, l))
  }

  case class GreKey(value: Int) extends IntField {
    val info = GreKey
  }
  
  object GreKey extends IE(296, "greKey", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = GreKey(Unsigned32.load(b, l))
  }

  case class NatType(value: Int) extends IntField {
    val info = NatType
  }
  
  object NatType extends IE(297, "natType", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = NatType(Unsigned8.load(b, l))
  }

  case class InitiatorPackets(value: Long) extends LongField {
    val info = InitiatorPackets
  }
  
  object InitiatorPackets extends IE(298, "initiatorPackets", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = InitiatorPackets(Unsigned64.load(b, l))
  }

  case class ResponderPackets(value: Long) extends LongField {
    val info = ResponderPackets
  }
  
  object ResponderPackets extends IE(299, "responderPackets", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = ResponderPackets(Unsigned64.load(b, l))
  }

  case class ObservationDomainName(value: String) extends StringField {
    val info = ObservationDomainName
  }
  
  object ObservationDomainName extends IE(300, "observationDomainName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ObservationDomainName(StringIE.load(b, l))
  }

  case class SelectionSequenceId(value: Long) extends LongField {
    val info = SelectionSequenceId
  }
  
  object SelectionSequenceId extends IE(301, "selectionSequenceId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SelectionSequenceId(Unsigned64.load(b, l))
  }

  case class SelectorId(value: Long) extends LongField {
    val info = SelectorId
  }
  
  object SelectorId extends IE(302, "selectorId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SelectorId(Unsigned64.load(b, l))
  }

  case class InformationElementId(value: Int) extends IntField {
    val info = InformationElementId
  }
  
  object InformationElementId extends IE(303, "informationElementId", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementId(Unsigned16.load(b, l))
  }

  case class SelectorAlgorithm(value: Int) extends IntField {
    val info = SelectorAlgorithm
  }
  
  object SelectorAlgorithm extends IE(304, "selectorAlgorithm", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SelectorAlgorithm(Unsigned16.load(b, l))
  }

  case class SamplingPacketInterval(value: Int) extends IntField {
    val info = SamplingPacketInterval
  }
  
  object SamplingPacketInterval extends IE(305, "samplingPacketInterval", Unsigned32, Quantity, Packets) {
    def load(b: ByteIterCounter, l: Int) = SamplingPacketInterval(Unsigned32.load(b, l))
  }

  case class SamplingPacketSpace(value: Int) extends IntField {
    val info = SamplingPacketSpace
  }
  
  object SamplingPacketSpace extends IE(306, "samplingPacketSpace", Unsigned32, Quantity, Packets) {
    def load(b: ByteIterCounter, l: Int) = SamplingPacketSpace(Unsigned32.load(b, l))
  }

  case class SamplingTimeInterval(value: Int) extends IntField {
    val info = SamplingTimeInterval
  }
  
  object SamplingTimeInterval extends IE(307, "samplingTimeInterval", Unsigned32, Quantity, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = SamplingTimeInterval(Unsigned32.load(b, l))
  }

  case class SamplingTimeSpace(value: Int) extends IntField {
    val info = SamplingTimeSpace
  }
  
  object SamplingTimeSpace extends IE(308, "samplingTimeSpace", Unsigned32, Quantity, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = SamplingTimeSpace(Unsigned32.load(b, l))
  }

  case class SamplingSize(value: Int) extends IntField {
    val info = SamplingSize
  }
  
  object SamplingSize extends IE(309, "samplingSize", Unsigned32, Quantity, Packets) {
    def load(b: ByteIterCounter, l: Int) = SamplingSize(Unsigned32.load(b, l))
  }

  case class SamplingPopulation(value: Int) extends IntField {
    val info = SamplingPopulation
  }
  
  object SamplingPopulation extends IE(310, "samplingPopulation", Unsigned32, Quantity, Packets) {
    def load(b: ByteIterCounter, l: Int) = SamplingPopulation(Unsigned32.load(b, l))
  }

  case class SamplingProbability(value: Double) extends DoubleField {
    val info = SamplingProbability
  }
  
  object SamplingProbability extends IE(311, "samplingProbability", Float64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SamplingProbability(Float64.load(b, l))
  }

  case class DataLinkFrameSize(value: Int) extends IntField {
    val info = DataLinkFrameSize
  }
  
  object DataLinkFrameSize extends IE(312, "dataLinkFrameSize", Unsigned16, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DataLinkFrameSize(Unsigned16.load(b, l))
  }

  case class IpHeaderPacketSection(value: Array[Byte]) extends BytesField {
    val info = IpHeaderPacketSection
  }
  
  object IpHeaderPacketSection extends IE(313, "ipHeaderPacketSection", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpHeaderPacketSection(OctetArray.load(b, l))
  }

  case class IpPayloadPacketSection(value: Array[Byte]) extends BytesField {
    val info = IpPayloadPacketSection
  }
  
  object IpPayloadPacketSection extends IE(314, "ipPayloadPacketSection", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IpPayloadPacketSection(OctetArray.load(b, l))
  }

  case class DataLinkFrameSection(value: Array[Byte]) extends BytesField {
    val info = DataLinkFrameSection
  }
  
  object DataLinkFrameSection extends IE(315, "dataLinkFrameSection", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DataLinkFrameSection(OctetArray.load(b, l))
  }

  case class MplsLabelStackSection(value: Array[Byte]) extends BytesField {
    val info = MplsLabelStackSection
  }
  
  object MplsLabelStackSection extends IE(316, "mplsLabelStackSection", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsLabelStackSection(OctetArray.load(b, l))
  }

  case class MplsPayloadPacketSection(value: Array[Byte]) extends BytesField {
    val info = MplsPayloadPacketSection
  }
  
  object MplsPayloadPacketSection extends IE(317, "mplsPayloadPacketSection", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = MplsPayloadPacketSection(OctetArray.load(b, l))
  }

  case class SelectorIdTotalPktsObserved(value: Long) extends LongField {
    val info = SelectorIdTotalPktsObserved
  }
  
  object SelectorIdTotalPktsObserved extends IE(318, "selectorIdTotalPktsObserved", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = SelectorIdTotalPktsObserved(Unsigned64.load(b, l))
  }

  case class SelectorIdTotalPktsSelected(value: Long) extends LongField {
    val info = SelectorIdTotalPktsSelected
  }
  
  object SelectorIdTotalPktsSelected extends IE(319, "selectorIdTotalPktsSelected", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = SelectorIdTotalPktsSelected(Unsigned64.load(b, l))
  }

  case class AbsoluteError(value: Double) extends DoubleField {
    val info = AbsoluteError
  }
  
  object AbsoluteError extends IE(320, "absoluteError", Float64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = AbsoluteError(Float64.load(b, l))
  }

  case class RelativeError(value: Double) extends DoubleField {
    val info = RelativeError
  }
  
  object RelativeError extends IE(321, "relativeError", Float64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = RelativeError(Float64.load(b, l))
  }

  case class ObservationTimeSeconds(value: Timestamp) extends DateField {
    val info = ObservationTimeSeconds
  }
  
  object ObservationTimeSeconds extends IE(322, "observationTimeSeconds", DateTimeSeconds, Default, Seconds) {
    def load(b: ByteIterCounter, l: Int) = ObservationTimeSeconds(DateTimeSeconds.load(b, l))
  }

  case class ObservationTimeMilliseconds(value: Timestamp) extends DateField {
    val info = ObservationTimeMilliseconds
  }
  
  object ObservationTimeMilliseconds extends IE(323, "observationTimeMilliseconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = ObservationTimeMilliseconds(DateTimeMilliseconds.load(b, l))
  }

  case class ObservationTimeMicroseconds(value: Timestamp) extends DateField {
    val info = ObservationTimeMicroseconds
  }
  
  object ObservationTimeMicroseconds extends IE(324, "observationTimeMicroseconds", DateTimeMicroseconds, Default, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = ObservationTimeMicroseconds(DateTimeMicroseconds.load(b, l))
  }

  case class ObservationTimeNanoseconds(value: Timestamp) extends DateField {
    val info = ObservationTimeNanoseconds
  }
  
  object ObservationTimeNanoseconds extends IE(325, "observationTimeNanoseconds", DateTimeNanoseconds, Default, Nanoseconds) {
    def load(b: ByteIterCounter, l: Int) = ObservationTimeNanoseconds(DateTimeNanoseconds.load(b, l))
  }

  case class DigestHashValue(value: Long) extends LongField {
    val info = DigestHashValue
  }
  
  object DigestHashValue extends IE(326, "digestHashValue", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DigestHashValue(Unsigned64.load(b, l))
  }

  case class HashIPPayloadOffset(value: Long) extends LongField {
    val info = HashIPPayloadOffset
  }
  
  object HashIPPayloadOffset extends IE(327, "hashIPPayloadOffset", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashIPPayloadOffset(Unsigned64.load(b, l))
  }

  case class HashIPPayloadSize(value: Long) extends LongField {
    val info = HashIPPayloadSize
  }
  
  object HashIPPayloadSize extends IE(328, "hashIPPayloadSize", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashIPPayloadSize(Unsigned64.load(b, l))
  }

  case class HashOutputRangeMin(value: Long) extends LongField {
    val info = HashOutputRangeMin
  }
  
  object HashOutputRangeMin extends IE(329, "hashOutputRangeMin", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashOutputRangeMin(Unsigned64.load(b, l))
  }

  case class HashOutputRangeMax(value: Long) extends LongField {
    val info = HashOutputRangeMax
  }
  
  object HashOutputRangeMax extends IE(330, "hashOutputRangeMax", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashOutputRangeMax(Unsigned64.load(b, l))
  }

  case class HashSelectedRangeMin(value: Long) extends LongField {
    val info = HashSelectedRangeMin
  }
  
  object HashSelectedRangeMin extends IE(331, "hashSelectedRangeMin", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashSelectedRangeMin(Unsigned64.load(b, l))
  }

  case class HashSelectedRangeMax(value: Long) extends LongField {
    val info = HashSelectedRangeMax
  }
  
  object HashSelectedRangeMax extends IE(332, "hashSelectedRangeMax", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashSelectedRangeMax(Unsigned64.load(b, l))
  }

  case class HashDigestOutput(value: Boolean) extends BoolField {
    val info = HashDigestOutput
  }
  
  object HashDigestOutput extends IE(333, "hashDigestOutput", BooleanIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashDigestOutput(BooleanIE.load(b, l))
  }

  case class HashInitialiserValue(value: Long) extends LongField {
    val info = HashInitialiserValue
  }
  
  object HashInitialiserValue extends IE(334, "hashInitialiserValue", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashInitialiserValue(Unsigned64.load(b, l))
  }

  case class SelectorName(value: String) extends StringField {
    val info = SelectorName
  }
  
  object SelectorName extends IE(335, "selectorName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SelectorName(StringIE.load(b, l))
  }

  case class UpperCILimit(value: Double) extends DoubleField {
    val info = UpperCILimit
  }
  
  object UpperCILimit extends IE(336, "upperCILimit", Float64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = UpperCILimit(Float64.load(b, l))
  }

  case class LowerCILimit(value: Double) extends DoubleField {
    val info = LowerCILimit
  }
  
  object LowerCILimit extends IE(337, "lowerCILimit", Float64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = LowerCILimit(Float64.load(b, l))
  }

  case class ConfidenceLevel(value: Double) extends DoubleField {
    val info = ConfidenceLevel
  }
  
  object ConfidenceLevel extends IE(338, "confidenceLevel", Float64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ConfidenceLevel(Float64.load(b, l))
  }

  case class InformationElementDataType(value: Int) extends IntField {
    val info = InformationElementDataType
  }
  
  object InformationElementDataType extends IE(339, "informationElementDataType", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementDataType(Unsigned8.load(b, l))
  }

  case class InformationElementDescription(value: String) extends StringField {
    val info = InformationElementDescription
  }
  
  object InformationElementDescription extends IE(340, "informationElementDescription", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementDescription(StringIE.load(b, l))
  }

  case class InformationElementName(value: String) extends StringField {
    val info = InformationElementName
  }
  
  object InformationElementName extends IE(341, "informationElementName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementName(StringIE.load(b, l))
  }

  case class InformationElementRangeBegin(value: Long) extends LongField {
    val info = InformationElementRangeBegin
  }
  
  object InformationElementRangeBegin extends IE(342, "informationElementRangeBegin", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementRangeBegin(Unsigned64.load(b, l))
  }

  case class InformationElementRangeEnd(value: Long) extends LongField {
    val info = InformationElementRangeEnd
  }
  
  object InformationElementRangeEnd extends IE(343, "informationElementRangeEnd", Unsigned64, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementRangeEnd(Unsigned64.load(b, l))
  }

  case class InformationElementSemantics(value: Int) extends IntField {
    val info = InformationElementSemantics
  }
  
  object InformationElementSemantics extends IE(344, "informationElementSemantics", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementSemantics(Unsigned8.load(b, l))
  }

  case class InformationElementUnits(value: Int) extends IntField {
    val info = InformationElementUnits
  }
  
  object InformationElementUnits extends IE(345, "informationElementUnits", Unsigned16, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = InformationElementUnits(Unsigned16.load(b, l))
  }

  case class PrivateEnterpriseNumber(value: Int) extends IntField {
    val info = PrivateEnterpriseNumber
  }
  
  object PrivateEnterpriseNumber extends IE(346, "privateEnterpriseNumber", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PrivateEnterpriseNumber(Unsigned32.load(b, l))
  }

  case class VirtualStationInterfaceId(value: Array[Byte]) extends BytesField {
    val info = VirtualStationInterfaceId
  }
  
  object VirtualStationInterfaceId extends IE(347, "virtualStationInterfaceId", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = VirtualStationInterfaceId(OctetArray.load(b, l))
  }

  case class VirtualStationInterfaceName(value: String) extends StringField {
    val info = VirtualStationInterfaceName
  }
  
  object VirtualStationInterfaceName extends IE(348, "virtualStationInterfaceName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = VirtualStationInterfaceName(StringIE.load(b, l))
  }

  case class VirtualStationUUID(value: Array[Byte]) extends BytesField {
    val info = VirtualStationUUID
  }
  
  object VirtualStationUUID extends IE(349, "virtualStationUUID", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = VirtualStationUUID(OctetArray.load(b, l))
  }

  case class VirtualStationName(value: String) extends StringField {
    val info = VirtualStationName
  }
  
  object VirtualStationName extends IE(350, "virtualStationName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = VirtualStationName(StringIE.load(b, l))
  }

  case class Layer2SegmentId(value: Long) extends LongField {
    val info = Layer2SegmentId
  }
  
  object Layer2SegmentId extends IE(351, "layer2SegmentId", Unsigned64, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Layer2SegmentId(Unsigned64.load(b, l))
  }

  case class Layer2OctetDeltaCount(value: Long) extends LongField {
    val info = Layer2OctetDeltaCount
  }
  
  object Layer2OctetDeltaCount extends IE(352, "layer2OctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = Layer2OctetDeltaCount(Unsigned64.load(b, l))
  }

  case class Layer2OctetTotalCount(value: Long) extends LongField {
    val info = Layer2OctetTotalCount
  }
  
  object Layer2OctetTotalCount extends IE(353, "layer2OctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = Layer2OctetTotalCount(Unsigned64.load(b, l))
  }

  case class IngressUnicastPacketTotalCount(value: Long) extends LongField {
    val info = IngressUnicastPacketTotalCount
  }
  
  object IngressUnicastPacketTotalCount extends IE(354, "ingressUnicastPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = IngressUnicastPacketTotalCount(Unsigned64.load(b, l))
  }

  case class IngressMulticastPacketTotalCount(value: Long) extends LongField {
    val info = IngressMulticastPacketTotalCount
  }
  
  object IngressMulticastPacketTotalCount extends IE(355, "ingressMulticastPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = IngressMulticastPacketTotalCount(Unsigned64.load(b, l))
  }

  case class IngressBroadcastPacketTotalCount(value: Long) extends LongField {
    val info = IngressBroadcastPacketTotalCount
  }
  
  object IngressBroadcastPacketTotalCount extends IE(356, "ingressBroadcastPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = IngressBroadcastPacketTotalCount(Unsigned64.load(b, l))
  }

  case class EgressUnicastPacketTotalCount(value: Long) extends LongField {
    val info = EgressUnicastPacketTotalCount
  }
  
  object EgressUnicastPacketTotalCount extends IE(357, "egressUnicastPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = EgressUnicastPacketTotalCount(Unsigned64.load(b, l))
  }

  case class EgressBroadcastPacketTotalCount(value: Long) extends LongField {
    val info = EgressBroadcastPacketTotalCount
  }
  
  object EgressBroadcastPacketTotalCount extends IE(358, "egressBroadcastPacketTotalCount", Unsigned64, TotalCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = EgressBroadcastPacketTotalCount(Unsigned64.load(b, l))
  }

  case class MonitoringIntervalStartMilliSeconds(value: Timestamp) extends DateField {
    val info = MonitoringIntervalStartMilliSeconds
  }
  
  object MonitoringIntervalStartMilliSeconds extends IE(359, "monitoringIntervalStartMilliSeconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = MonitoringIntervalStartMilliSeconds(DateTimeMilliseconds.load(b, l))
  }

  case class MonitoringIntervalEndMilliSeconds(value: Timestamp) extends DateField {
    val info = MonitoringIntervalEndMilliSeconds
  }
  
  object MonitoringIntervalEndMilliSeconds extends IE(360, "monitoringIntervalEndMilliSeconds", DateTimeMilliseconds, Default, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = MonitoringIntervalEndMilliSeconds(DateTimeMilliseconds.load(b, l))
  }

  case class PortRangeStart(value: Int) extends IntField {
    val info = PortRangeStart
  }
  
  object PortRangeStart extends IE(361, "portRangeStart", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PortRangeStart(Unsigned16.load(b, l))
  }

  case class PortRangeEnd(value: Int) extends IntField {
    val info = PortRangeEnd
  }
  
  object PortRangeEnd extends IE(362, "portRangeEnd", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PortRangeEnd(Unsigned16.load(b, l))
  }

  case class PortRangeStepSize(value: Int) extends IntField {
    val info = PortRangeStepSize
  }
  
  object PortRangeStepSize extends IE(363, "portRangeStepSize", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PortRangeStepSize(Unsigned16.load(b, l))
  }

  case class PortRangeNumPorts(value: Int) extends IntField {
    val info = PortRangeNumPorts
  }
  
  object PortRangeNumPorts extends IE(364, "portRangeNumPorts", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PortRangeNumPorts(Unsigned16.load(b, l))
  }

  case class StaMacAddress(value: Array[Byte]) extends BytesField {
    val info = StaMacAddress
  }
  
  object StaMacAddress extends IE(365, "staMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = StaMacAddress(MacAddress.load(b, l))
  }

  case class StaIPv4Address(value: InetAddress) extends InetField {
    val info = StaIPv4Address
  }
  
  object StaIPv4Address extends IE(366, "staIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = StaIPv4Address(Ipv4Address.load(b, l))
  }

  case class WtpMacAddress(value: Array[Byte]) extends BytesField {
    val info = WtpMacAddress
  }
  
  object WtpMacAddress extends IE(367, "wtpMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = WtpMacAddress(MacAddress.load(b, l))
  }

  case class IngressInterfaceType(value: Int) extends IntField {
    val info = IngressInterfaceType
  }
  
  object IngressInterfaceType extends IE(368, "ingressInterfaceType", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IngressInterfaceType(Unsigned32.load(b, l))
  }

  case class EgressInterfaceType(value: Int) extends IntField {
    val info = EgressInterfaceType
  }
  
  object EgressInterfaceType extends IE(369, "egressInterfaceType", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = EgressInterfaceType(Unsigned32.load(b, l))
  }

  case class RtpSequenceNumber(value: Int) extends IntField {
    val info = RtpSequenceNumber
  }
  
  object RtpSequenceNumber extends IE(370, "rtpSequenceNumber", Unsigned16, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = RtpSequenceNumber(Unsigned16.load(b, l))
  }

  case class UserName(value: String) extends StringField {
    val info = UserName
  }
  
  object UserName extends IE(371, "userName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = UserName(StringIE.load(b, l))
  }

  case class ApplicationCategoryName(value: String) extends StringField {
    val info = ApplicationCategoryName
  }
  
  object ApplicationCategoryName extends IE(372, "applicationCategoryName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ApplicationCategoryName(StringIE.load(b, l))
  }

  case class ApplicationSubCategoryName(value: String) extends StringField {
    val info = ApplicationSubCategoryName
  }
  
  object ApplicationSubCategoryName extends IE(373, "applicationSubCategoryName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ApplicationSubCategoryName(StringIE.load(b, l))
  }

  case class ApplicationGroupName(value: String) extends StringField {
    val info = ApplicationGroupName
  }
  
  object ApplicationGroupName extends IE(374, "applicationGroupName", StringIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ApplicationGroupName(StringIE.load(b, l))
  }

  case class OriginalFlowsPresent(value: Long) extends LongField {
    val info = OriginalFlowsPresent
  }
  
  object OriginalFlowsPresent extends IE(375, "originalFlowsPresent", Unsigned64, DeltaCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = OriginalFlowsPresent(Unsigned64.load(b, l))
  }

  case class OriginalFlowsInitiated(value: Long) extends LongField {
    val info = OriginalFlowsInitiated
  }
  
  object OriginalFlowsInitiated extends IE(376, "originalFlowsInitiated", Unsigned64, DeltaCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = OriginalFlowsInitiated(Unsigned64.load(b, l))
  }

  case class OriginalFlowsCompleted(value: Long) extends LongField {
    val info = OriginalFlowsCompleted
  }
  
  object OriginalFlowsCompleted extends IE(377, "originalFlowsCompleted", Unsigned64, DeltaCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = OriginalFlowsCompleted(Unsigned64.load(b, l))
  }

  case class DistinctCountOfSourceIPAddress(value: Long) extends LongField {
    val info = DistinctCountOfSourceIPAddress
  }
  
  object DistinctCountOfSourceIPAddress extends IE(378, "distinctCountOfSourceIPAddress", Unsigned64, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DistinctCountOfSourceIPAddress(Unsigned64.load(b, l))
  }

  case class DistinctCountOfDestinationIPAddress(value: Long) extends LongField {
    val info = DistinctCountOfDestinationIPAddress
  }
  
  object DistinctCountOfDestinationIPAddress extends IE(379, "distinctCountOfDestinationIPAddress", Unsigned64, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DistinctCountOfDestinationIPAddress(Unsigned64.load(b, l))
  }

  case class DistinctCountOfSourceIPv4Address(value: Int) extends IntField {
    val info = DistinctCountOfSourceIPv4Address
  }
  
  object DistinctCountOfSourceIPv4Address extends IE(380, "distinctCountOfSourceIPv4Address", Unsigned32, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DistinctCountOfSourceIPv4Address(Unsigned32.load(b, l))
  }

  case class DistinctCountOfDestinationIPv4Address(value: Int) extends IntField {
    val info = DistinctCountOfDestinationIPv4Address
  }
  
  object DistinctCountOfDestinationIPv4Address extends IE(381, "distinctCountOfDestinationIPv4Address", Unsigned32, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DistinctCountOfDestinationIPv4Address(Unsigned32.load(b, l))
  }

  case class DistinctCountOfSourceIPv6Address(value: Long) extends LongField {
    val info = DistinctCountOfSourceIPv6Address
  }
  
  object DistinctCountOfSourceIPv6Address extends IE(382, "distinctCountOfSourceIPv6Address", Unsigned64, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DistinctCountOfSourceIPv6Address(Unsigned64.load(b, l))
  }

  case class DistinctCountOfDestinationIPv6Address(value: Long) extends LongField {
    val info = DistinctCountOfDestinationIPv6Address
  }
  
  object DistinctCountOfDestinationIPv6Address extends IE(383, "distinctCountOfDestinationIPv6Address", Unsigned64, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DistinctCountOfDestinationIPv6Address(Unsigned64.load(b, l))
  }

  case class ValueDistributionMethod(value: Int) extends IntField {
    val info = ValueDistributionMethod
  }
  
  object ValueDistributionMethod extends IE(384, "valueDistributionMethod", Unsigned8, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = ValueDistributionMethod(Unsigned8.load(b, l))
  }

  case class Rfc3550JitterMilliseconds(value: Int) extends IntField {
    val info = Rfc3550JitterMilliseconds
  }
  
  object Rfc3550JitterMilliseconds extends IE(385, "rfc3550JitterMilliseconds", Unsigned32, Quantity, Milliseconds) {
    def load(b: ByteIterCounter, l: Int) = Rfc3550JitterMilliseconds(Unsigned32.load(b, l))
  }

  case class Rfc3550JitterMicroseconds(value: Int) extends IntField {
    val info = Rfc3550JitterMicroseconds
  }
  
  object Rfc3550JitterMicroseconds extends IE(386, "rfc3550JitterMicroseconds", Unsigned32, Quantity, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = Rfc3550JitterMicroseconds(Unsigned32.load(b, l))
  }

  case class Rfc3550JitterNanoseconds(value: Int) extends IntField {
    val info = Rfc3550JitterNanoseconds
  }
  
  object Rfc3550JitterNanoseconds extends IE(387, "rfc3550JitterNanoseconds", Unsigned32, Quantity, Nanoseconds) {
    def load(b: ByteIterCounter, l: Int) = Rfc3550JitterNanoseconds(Unsigned32.load(b, l))
  }

  case class Dot1qDEI(value: Boolean) extends BoolField {
    val info = Dot1qDEI
  }
  
  object Dot1qDEI extends IE(388, "dot1qDEI", BooleanIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qDEI(BooleanIE.load(b, l))
  }

  case class Dot1qCustomerDEI(value: Boolean) extends BoolField {
    val info = Dot1qCustomerDEI
  }
  
  object Dot1qCustomerDEI extends IE(389, "dot1qCustomerDEI", BooleanIE, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qCustomerDEI(BooleanIE.load(b, l))
  }

  case class FlowSelectorAlgorithm(value: Int) extends IntField {
    val info = FlowSelectorAlgorithm
  }
  
  object FlowSelectorAlgorithm extends IE(390, "flowSelectorAlgorithm", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = FlowSelectorAlgorithm(Unsigned16.load(b, l))
  }

  case class FlowSelectedOctetDeltaCount(value: Long) extends LongField {
    val info = FlowSelectedOctetDeltaCount
  }
  
  object FlowSelectedOctetDeltaCount extends IE(391, "flowSelectedOctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = FlowSelectedOctetDeltaCount(Unsigned64.load(b, l))
  }

  case class FlowSelectedPacketDeltaCount(value: Long) extends LongField {
    val info = FlowSelectedPacketDeltaCount
  }
  
  object FlowSelectedPacketDeltaCount extends IE(392, "flowSelectedPacketDeltaCount", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = FlowSelectedPacketDeltaCount(Unsigned64.load(b, l))
  }

  case class FlowSelectedFlowDeltaCount(value: Long) extends LongField {
    val info = FlowSelectedFlowDeltaCount
  }
  
  object FlowSelectedFlowDeltaCount extends IE(393, "flowSelectedFlowDeltaCount", Unsigned64, DeltaCounter, Flows) {
    def load(b: ByteIterCounter, l: Int) = FlowSelectedFlowDeltaCount(Unsigned64.load(b, l))
  }

  case class SelectorIDTotalFlowsObserved(value: Long) extends LongField {
    val info = SelectorIDTotalFlowsObserved
  }
  
  object SelectorIDTotalFlowsObserved extends IE(394, "selectorIDTotalFlowsObserved", Unsigned64, NoSemantics, Flows) {
    def load(b: ByteIterCounter, l: Int) = SelectorIDTotalFlowsObserved(Unsigned64.load(b, l))
  }

  case class SelectorIDTotalFlowsSelected(value: Long) extends LongField {
    val info = SelectorIDTotalFlowsSelected
  }
  
  object SelectorIDTotalFlowsSelected extends IE(395, "selectorIDTotalFlowsSelected", Unsigned64, NoSemantics, Flows) {
    def load(b: ByteIterCounter, l: Int) = SelectorIDTotalFlowsSelected(Unsigned64.load(b, l))
  }

  case class SamplingFlowInterval(value: Long) extends LongField {
    val info = SamplingFlowInterval
  }
  
  object SamplingFlowInterval extends IE(396, "samplingFlowInterval", Unsigned64, NoSemantics, Flows) {
    def load(b: ByteIterCounter, l: Int) = SamplingFlowInterval(Unsigned64.load(b, l))
  }

  case class SamplingFlowSpacing(value: Long) extends LongField {
    val info = SamplingFlowSpacing
  }
  
  object SamplingFlowSpacing extends IE(397, "samplingFlowSpacing", Unsigned64, NoSemantics, Flows) {
    def load(b: ByteIterCounter, l: Int) = SamplingFlowSpacing(Unsigned64.load(b, l))
  }

  case class FlowSamplingTimeInterval(value: Long) extends LongField {
    val info = FlowSamplingTimeInterval
  }
  
  object FlowSamplingTimeInterval extends IE(398, "flowSamplingTimeInterval", Unsigned64, NoSemantics, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowSamplingTimeInterval(Unsigned64.load(b, l))
  }

  case class FlowSamplingTimeSpacing(value: Long) extends LongField {
    val info = FlowSamplingTimeSpacing
  }
  
  object FlowSamplingTimeSpacing extends IE(399, "flowSamplingTimeSpacing", Unsigned64, NoSemantics, Microseconds) {
    def load(b: ByteIterCounter, l: Int) = FlowSamplingTimeSpacing(Unsigned64.load(b, l))
  }

  case class HashFlowDomain(value: Int) extends IntField {
    val info = HashFlowDomain
  }
  
  object HashFlowDomain extends IE(400, "hashFlowDomain", Unsigned16, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = HashFlowDomain(Unsigned16.load(b, l))
  }

  case class TransportOctetDeltaCount(value: Long) extends LongField {
    val info = TransportOctetDeltaCount
  }
  
  object TransportOctetDeltaCount extends IE(401, "transportOctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = TransportOctetDeltaCount(Unsigned64.load(b, l))
  }

  case class TransportPacketDeltaCount(value: Long) extends LongField {
    val info = TransportPacketDeltaCount
  }
  
  object TransportPacketDeltaCount extends IE(402, "transportPacketDeltaCount", Unsigned64, DeltaCounter, Packets) {
    def load(b: ByteIterCounter, l: Int) = TransportPacketDeltaCount(Unsigned64.load(b, l))
  }

  case class OriginalExporterIPv4Address(value: InetAddress) extends InetField {
    val info = OriginalExporterIPv4Address
  }
  
  object OriginalExporterIPv4Address extends IE(403, "originalExporterIPv4Address", Ipv4Address, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = OriginalExporterIPv4Address(Ipv4Address.load(b, l))
  }

  case class OriginalExporterIPv6Address(value: InetAddress) extends InetField {
    val info = OriginalExporterIPv6Address
  }
  
  object OriginalExporterIPv6Address extends IE(404, "originalExporterIPv6Address", Ipv6Address, NoSemantics, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = OriginalExporterIPv6Address(Ipv6Address.load(b, l))
  }

  case class OriginalObservationDomainId(value: Int) extends IntField {
    val info = OriginalObservationDomainId
  }
  
  object OriginalObservationDomainId extends IE(405, "originalObservationDomainId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = OriginalObservationDomainId(Unsigned32.load(b, l))
  }

  case class IntermediateProcessId(value: Int) extends IntField {
    val info = IntermediateProcessId
  }
  
  object IntermediateProcessId extends IE(406, "intermediateProcessId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IntermediateProcessId(Unsigned32.load(b, l))
  }

  case class IgnoredDataRecordTotalCount(value: Long) extends LongField {
    val info = IgnoredDataRecordTotalCount
  }
  
  object IgnoredDataRecordTotalCount extends IE(407, "ignoredDataRecordTotalCount", Unsigned64, TotalCounter, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = IgnoredDataRecordTotalCount(Unsigned64.load(b, l))
  }

  case class DataLinkFrameType(value: Int) extends IntField {
    val info = DataLinkFrameType
  }
  
  object DataLinkFrameType extends IE(408, "dataLinkFrameType", Unsigned16, Flags, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = DataLinkFrameType(Unsigned16.load(b, l))
  }

  case class SectionOffset(value: Int) extends IntField {
    val info = SectionOffset
  }
  
  object SectionOffset extends IE(409, "sectionOffset", Unsigned16, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SectionOffset(Unsigned16.load(b, l))
  }

  case class SectionExportedOctets(value: Int) extends IntField {
    val info = SectionExportedOctets
  }
  
  object SectionExportedOctets extends IE(410, "sectionExportedOctets", Unsigned16, Quantity, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = SectionExportedOctets(Unsigned16.load(b, l))
  }

  case class Dot1qServiceInstanceTag(value: Array[Byte]) extends BytesField {
    val info = Dot1qServiceInstanceTag
  }
  
  object Dot1qServiceInstanceTag extends IE(411, "dot1qServiceInstanceTag", OctetArray, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qServiceInstanceTag(OctetArray.load(b, l))
  }

  case class Dot1qServiceInstanceId(value: Int) extends IntField {
    val info = Dot1qServiceInstanceId
  }
  
  object Dot1qServiceInstanceId extends IE(412, "dot1qServiceInstanceId", Unsigned32, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qServiceInstanceId(Unsigned32.load(b, l))
  }

  case class Dot1qServiceInstancePriority(value: Int) extends IntField {
    val info = Dot1qServiceInstancePriority
  }
  
  object Dot1qServiceInstancePriority extends IE(413, "dot1qServiceInstancePriority", Unsigned8, Identifier, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qServiceInstancePriority(Unsigned8.load(b, l))
  }

  case class Dot1qCustomerSourceMacAddress(value: Array[Byte]) extends BytesField {
    val info = Dot1qCustomerSourceMacAddress
  }
  
  object Dot1qCustomerSourceMacAddress extends IE(414, "dot1qCustomerSourceMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qCustomerSourceMacAddress(MacAddress.load(b, l))
  }

  case class Dot1qCustomerDestinationMacAddress(value: Array[Byte]) extends BytesField {
    val info = Dot1qCustomerDestinationMacAddress
  }
  
  object Dot1qCustomerDestinationMacAddress extends IE(415, "dot1qCustomerDestinationMacAddress", MacAddress, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = Dot1qCustomerDestinationMacAddress(MacAddress.load(b, l))
  }

  case class PostLayer2OctetDeltaCount(value: Long) extends LongField {
    val info = PostLayer2OctetDeltaCount
  }
  
  object PostLayer2OctetDeltaCount extends IE(417, "postLayer2OctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostLayer2OctetDeltaCount(Unsigned64.load(b, l))
  }

  case class PostMCastLayer2OctetDeltaCount(value: Long) extends LongField {
    val info = PostMCastLayer2OctetDeltaCount
  }
  
  object PostMCastLayer2OctetDeltaCount extends IE(418, "postMCastLayer2OctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostMCastLayer2OctetDeltaCount(Unsigned64.load(b, l))
  }

  case class PostLayer2OctetTotalCount(value: Long) extends LongField {
    val info = PostLayer2OctetTotalCount
  }
  
  object PostLayer2OctetTotalCount extends IE(420, "postLayer2OctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostLayer2OctetTotalCount(Unsigned64.load(b, l))
  }

  case class PostMCastLayer2OctetTotalCount(value: Long) extends LongField {
    val info = PostMCastLayer2OctetTotalCount
  }
  
  object PostMCastLayer2OctetTotalCount extends IE(421, "postMCastLayer2OctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = PostMCastLayer2OctetTotalCount(Unsigned64.load(b, l))
  }

  case class MinimumLayer2TotalLength(value: Long) extends LongField {
    val info = MinimumLayer2TotalLength
  }
  
  object MinimumLayer2TotalLength extends IE(422, "minimumLayer2TotalLength", Unsigned64, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = MinimumLayer2TotalLength(Unsigned64.load(b, l))
  }

  case class MaximumLayer2TotalLength(value: Long) extends LongField {
    val info = MaximumLayer2TotalLength
  }
  
  object MaximumLayer2TotalLength extends IE(423, "maximumLayer2TotalLength", Unsigned64, NoSemantics, Octets) {
    def load(b: ByteIterCounter, l: Int) = MaximumLayer2TotalLength(Unsigned64.load(b, l))
  }

  case class DroppedLayer2OctetDeltaCount(value: Long) extends LongField {
    val info = DroppedLayer2OctetDeltaCount
  }
  
  object DroppedLayer2OctetDeltaCount extends IE(424, "droppedLayer2OctetDeltaCount", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = DroppedLayer2OctetDeltaCount(Unsigned64.load(b, l))
  }

  case class DroppedLayer2OctetTotalCount(value: Long) extends LongField {
    val info = DroppedLayer2OctetTotalCount
  }
  
  object DroppedLayer2OctetTotalCount extends IE(425, "droppedLayer2OctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = DroppedLayer2OctetTotalCount(Unsigned64.load(b, l))
  }

  case class IgnoredLayer2OctetTotalCount(value: Long) extends LongField {
    val info = IgnoredLayer2OctetTotalCount
  }
  
  object IgnoredLayer2OctetTotalCount extends IE(426, "ignoredLayer2OctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = IgnoredLayer2OctetTotalCount(Unsigned64.load(b, l))
  }

  case class NotSentLayer2OctetTotalCount(value: Long) extends LongField {
    val info = NotSentLayer2OctetTotalCount
  }
  
  object NotSentLayer2OctetTotalCount extends IE(427, "notSentLayer2OctetTotalCount", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = NotSentLayer2OctetTotalCount(Unsigned64.load(b, l))
  }

  case class Layer2OctetDeltaSumOfSquares(value: Long) extends LongField {
    val info = Layer2OctetDeltaSumOfSquares
  }
  
  object Layer2OctetDeltaSumOfSquares extends IE(428, "layer2OctetDeltaSumOfSquares", Unsigned64, DeltaCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = Layer2OctetDeltaSumOfSquares(Unsigned64.load(b, l))
  }

  case class Layer2OctetTotalSumOfSquares(value: Long) extends LongField {
    val info = Layer2OctetTotalSumOfSquares
  }
  
  object Layer2OctetTotalSumOfSquares extends IE(429, "layer2OctetTotalSumOfSquares", Unsigned64, TotalCounter, Octets) {
    def load(b: ByteIterCounter, l: Int) = Layer2OctetTotalSumOfSquares(Unsigned64.load(b, l))
  }

  case class Layer2FrameDeltaCount(value: Long) extends LongField {
    val info = Layer2FrameDeltaCount
  }
  
  object Layer2FrameDeltaCount extends IE(430, "layer2FrameDeltaCount", Unsigned64, DeltaCounter, Frames) {
    def load(b: ByteIterCounter, l: Int) = Layer2FrameDeltaCount(Unsigned64.load(b, l))
  }

  case class Layer2FrameTotalCount(value: Long) extends LongField {
    val info = Layer2FrameTotalCount
  }
  
  object Layer2FrameTotalCount extends IE(431, "layer2FrameTotalCount", Unsigned64, TotalCounter, Frames) {
    def load(b: ByteIterCounter, l: Int) = Layer2FrameTotalCount(Unsigned64.load(b, l))
  }

  case class PseudoWireDestinationIPv4Address(value: InetAddress) extends InetField {
    val info = PseudoWireDestinationIPv4Address
  }
  
  object PseudoWireDestinationIPv4Address extends IE(432, "pseudoWireDestinationIPv4Address", Ipv4Address, Default, NoUnits) {
    def load(b: ByteIterCounter, l: Int) = PseudoWireDestinationIPv4Address(Ipv4Address.load(b, l))
  }

  case class IgnoredLayer2FrameTotalCount(value: Long) extends LongField {
    val info = IgnoredLayer2FrameTotalCount
  }
  
  object IgnoredLayer2FrameTotalCount extends IE(433, "ignoredLayer2FrameTotalCount", Unsigned64, TotalCounter, Frames) {
    def load(b: ByteIterCounter, l: Int) = IgnoredLayer2FrameTotalCount(Unsigned64.load(b, l))
  }
}
