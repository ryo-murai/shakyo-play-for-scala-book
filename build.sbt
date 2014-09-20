lazy val root = Project(
  "products", file(".")
).enablePlugins(PlayScala).settings(
  scalaVersion := "2.11.2"
)
