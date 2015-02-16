package models

case class Preparation(
  orderNumber: String,
  product: Product,
  quantity: Int,
  location: String)

object PickList {
  def find(warehouse: String): List[Preparation] = {
    val product = Product(5010255079763L, "Large paper clips", "Large paper clips 100 pack")
    val loc = "Aisle 42 bin 7"
    List(
      Preparation("3141592", product, 200, loc),
      Preparation("6535897", product, 500, loc),
      Preparation("93", product, 100, loc)
    )
  }
}

