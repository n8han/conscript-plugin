This is a plugin for making your own [Conscript][cs] apps. Use it by adding
a plugin source dependency to your project.

**project/plugins/project/build.scala**

```scala
import sbt._

object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn( conscript )
  lazy val conscript = uri("git://github.com/n8han/conscript-plugin.git#0.1.2")
}
```

[cs]: https://github.com/n8han/conscript#readme
