package ipfix

import java.nio.ByteOrder

import akka.util.{ByteString, ByteIterator}

class ByteIterCounter(byteIter: ByteIterator) {
  implicit val order = ByteOrder.BIG_ENDIAN

  private var cnt = 0
  def count = cnt

  def hasNext: Boolean = byteIter.hasNext

  def next() = { cnt += 1; byteIter.next() }
  def getBytes(num: Int): Array[Byte] = { cnt += num; Array.fill(num)(next()) }

  def getByte = { cnt += 1; byteIter.getByte }
  def getShort = { cnt += 2; byteIter.getShort }
  def getInt = { cnt += 4; byteIter.getInt }
  def getLong = { cnt += 8; byteIter.getLong }
  def getFloat = { cnt += 4; byteIter.getFloat }
  def getDouble = { cnt += 8; byteIter.getFloat }

  def getU8AsInt = u8ToInt(getByte)
  def getU16AsInt = u16ToInt(getShort)
  def getU32AsInt = u32ToInt(getInt)
  def getU32AsLong = u32ToLong(getInt)
  def getU64AsLong = u64ToLong(getLong)

  def u8ToInt(u8: Byte): Int = {
    if (u8 < 0) 255 + u8 + 1
    else u8
  }

  def u16ToInt(u16: Short): Int = {
    if (u16 < 0) 65535 + u16 + 1
    else u16
  }

  def u32ToInt(u32: Int): Int = {
    if (u32 < 0) 2147483647
    else u32
  }

  def u32ToLong(u32: Int): Long = {
    if (u32 < 0) 4294967295L + u32 + 1
    else u32
  }

  def u64ToLong(u64: Long): Long = {
    if (u64 < 0L) 9223372036854775807L
    else u64
  }
}

object ByteIterCounter {
  def apply(byteString: ByteString) = new ByteIterCounter(byteString.iterator)
}