libraryDependencies += "net.sf.barcode4j" % "barcode4j" % "2.1"

lazy val root = Project(
  "products", file(".")
).enablePlugins(PlayScala).settings(
  scalaVersion := "2.11.2"
)
