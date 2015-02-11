package ipfix.protocol

import java.net.InetAddress
import java.sql.{PreparedStatement, Timestamp}
import ipfix.ie.IE

sealed trait Field {
  val info: IE
  val value: Any
  def insert(statement: PreparedStatement, idx: Int): Unit
}

trait IntField extends Field {
  val value: Int
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setInt(idx, value)
}

trait LongField extends Field {
  val value: Long
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setLong(idx, value)
}

trait FloatField extends Field {
  val value: Float
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setFloat(idx, value)
}

trait DoubleField extends Field {
  val value: Double
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setDouble(idx, value)
}

trait InetField extends Field {
  val value: InetAddress
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setString(idx, value.getHostAddress)
}

trait StringField extends Field {
  val value: String
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setString(idx, value)
}

trait BoolField extends Field {
  val value: Boolean
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setBoolean(idx, value)
}

trait BytesField extends Field {
  val value: Array[Byte]
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setBytes(idx, value)
}

trait DateField extends Field {
  val value: Timestamp
  def insert(statement: PreparedStatement, idx: Int): Unit = statement.setTimestamp(idx, value)
}