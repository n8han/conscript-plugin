Setup
-----

This is a plugin for making your own [Conscript][cs] apps. Get started
using it by applying this [giter8][g8] template project.

    g8 n8han/conscript

The sbt 0.11 project it creates will have conscript-plugin
preconfigured, and comes with skeletal sources for your app.

[cs]: https://github.com/n8han/conscript#readme
[g8]: https://github.com/n8han/giter8#readme


Use
---

Start an sbt 0.11 interactive session in your project directory.

    $ sbt # or whatever you've called your sbt 0.11 script

You'll have a few additional tasks (commands) available.

    cs-run app

Runs an app named "app". The name is taken from the directory
containing the launchconfig. In the template project, you have
`src/main/conscript/app/launchconfg` so the name here (and eventual
script name) is "app".

The `cs-run` task does a publish-local for the project, produces a
temporary finished launchconfig, then invokes the launcher in a
separate process. This is a close approximation of how the app will
actually be launched in the script produced by Conscript's `cs`
command. Arguments appended to the task will be passed on to the
launched program:

    cs-run app goodbye world

Alternate Launch
----------------

If your app (like the template app) includes a standard runnable
class, you can run it directly with sbt's `run` task. This is a much
faster way to test the app as you are developing, since it avoids the
overhead of publishing and launching in a separate process.

    run goodbye world

It is also similar to running it deployed as a runnable jar that has
been built either through [assembly][assembly] or
[proguard][proguard]--the most common alternatives to Conscript's
local-repository-based launching.

[assembly]: https://github.com/eed3si9n/sbt-assembly
[proguard]: https://github.com/siasia/xsbt-proguard-plugin
