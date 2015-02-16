package models

object Order {
  def backlog(warehouse: String): String = {
    // this takes a long time
    Thread.sleep(1000 * 5)

    "order1234"
  }
}
