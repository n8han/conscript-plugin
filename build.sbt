sbtPlugin := true

name := "conscript-plugin"

organization := "net.databinder"

version := "0.3.2"

publishTo := Some("Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")