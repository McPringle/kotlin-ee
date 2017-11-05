import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val timeservice = project {
    name = "timeservice"
    group = "ch.fihlon.talk.kotlinee.timeservice"
    artifactId = name
    directory = "timeservice"

    dependencies {
        provided("javax:javaee-api:7.0")
        compile("org.jetbrains.kotlin:kotlin-stdlib-jre8:1.1.50")
    }

    assemble {
        war {}
    }
}

val helloservice = project {
    name = "helloservice"
    group = "ch.fihlon.talk.kotlinee.helloservice"
    artifactId = name
    directory = "helloservice"

    dependencies {
        provided("javax:javaee-api:7.0")
        compile("org.jetbrains.kotlin:kotlin-stdlib-jre8:1.1.50")
    }

    assemble {
        war {}
    }
}

