
lazy val root = (project in file(".")).enablePlugins(PlayScala).settings(
  name := "play-for-scala-book-app",
  version := "0.1",
  scalaVersion := "2.11.5",
  resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
  libraryDependencies ++= Seq(
    jdbc,
    "net.sf.barcode4j" % "barcode4j" % "2.1",
    "org.skinny-framework" %% "skinny-orm"                   % "1.3.+",
    "org.scalikejdbc" %% "scalikejdbc-config"                % "2.2.3",
    "org.scalikejdbc" %% "scalikejdbc-play-dbplugin-adapter" % "2.3.4",
    "com.github.tototoshi" %% "play-flyway"                  % "1.2.+",
    "commons-dbcp"    %  "commons-dbcp"                      % "1.4",
    "com.h2database"       %  "h2"                           % "1.4.+"
  )
).settings(scalariformSettings: _*)


