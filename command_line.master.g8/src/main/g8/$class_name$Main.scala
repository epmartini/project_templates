package $package_name$.$name$


import com.emarsys.logging.Loggable
import com.emarsys.logging.JULUpdater
import com.emarsys.deebee._
import java.sql.Connection

object $class_name$Main extends Loggable {


    private def initializeConnection( jdbcURL: String ): Unit = {
        Class.forName( "org.postgresql.Driver" )
        ConnectionBuilder.init( "e3db", new DriverManagerConnectionOpener( jdbcURL ) )
    }

    private def usage(): Unit = {
        println("$class_name$")
        println("===============================")
        println(" ")
        println("Command Line Parameters:")
        println("------------------------")

        println("-h: this help" )

    }


    def main( args: Array[ String ] ) {

        val config: $class_name$Config = $class_name$Config()

        //initialize loggin
        JULUpdater( $class_name$Config.logConfigFile ).update()

        if ( ( args.exists( _ == "-h" ) || ( args.length == 0 ) ) {
            usage()
            return
        }
    }

    private def usage(): Unit = {
        println("Unique Calculator")
        println("===============================")
        println(" ")
        println("Command Line Parameters:")
        println("------------------------")

        println("-versions: it will process just the version launches" )

        println("-launches: it will process all the whitelisted launches excluding the version one" )

        println("-sql=<query returning launches>")

    }



}