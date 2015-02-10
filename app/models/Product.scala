package models

import scalikejdbc._
import skinny.orm._

case class Product(ean: Long, name: String, description: String)

object Product extends SkinnyCRUDMapper[Product] {

  override val defaultAlias = createAlias("p")

  override def extract(rs: WrappedResultSet, n: ResultName[Product]): Product = Product(
    ean = rs.get(n.ean),
    name = rs.get(n.name),
    description = rs.get(n.description))

  override def primaryKeyFieldName = "ean"

  def findByEan(ean: Long) = findById(ean)

  def add(product: Product) =
    createWithAttributes('ean -> product.ean, 'name -> product.name, 'description -> product.description)
  // there should be better way to do this like ... createWithEntity(product)
}
