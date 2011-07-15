This is a plugin for making your own [Conscript][cs] apps. Use it by
adding a plugin dependency to your project.

**project/plugins/build.sbt**

```scala
libraryDependencies ++= Seq(
  "net.databinder" %% "conscript-plugin" % "0.3.1_sbt0.10.1"
)
```

[cs]: https://github.com/n8han/conscript#readme
