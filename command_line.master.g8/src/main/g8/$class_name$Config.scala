package $package_name$.$name$

import com.emarsys.config.ConfigBuilder
import net.lag.configgy.Config

import com.emarsys.config._
import com.emarsys.config.ConfigBuilder
import org.joda.time.Duration
import net.lag.configgy.Config


final class $class_name$Config(
    val jdbcURL: String
) {
    /** generate from configuration file */
    def this( config: Config) = this(

        config.getString( "jdbcURL" ).get
    )

}

object $class_name$Config extends ConfigBuilder[ $class_name$Config ] {

     override val name = "$class_name$"

     override protected def apply(config: net.lag.configgy.Config ): $class_name$Config = {
         new $class_name$Config( config )
     }
 }
