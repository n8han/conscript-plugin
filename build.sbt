sbtPlugin := true

name := "conscript-plugin"

organization := "net.databinder"

version := "0.3.3"

homepage := Some(url("https://github.com/n8han/conscript"))

publishTo :=
  Some("releases" at
       "https://oss.sonatype.org/service/local/staging/deploy/maven2")

licenses := Seq("LGPL v3" -> url("http://www.gnu.org/licenses/lgpl.txt"))

pomExtra := (
  <scm>
    <url>git@github.com:n8han/conscript-plugin.git</url>
    <connection>scm:git:git@github.com:n8han/conscript-plugin.git</connection>
  </scm>
  <developers>
    <developer>
      <id>n8han</id>
      <name>Nathan Hamblen</name>
      <url>http://github.com/n8han</url>
    </developer>
  </developers>)

