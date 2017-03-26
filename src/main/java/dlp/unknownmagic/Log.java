package dlp.unknownmagic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is the Main Log for the Unknown Magic Mod in which
 * we will use in order to log the UM information to the
 * console. This class implements the Singleton Pattern
 * in which only one Logger of this type will be created
 * so that this is the primary log for the mod.
 */
public final class Log
{
    // Encapsulates the instance of the LOGGER
    private static final Logger LOGGER = LogManager.getLogger (UnknownMagic.MODNAME);

    // Prevents instantiation of object
    private Log () {}

    /**
     * This is the only way to gain access to the Instance of the Logger.
     *
     * @return The LOGGER instance
     */
    public static Logger getInstance ()
    {
        return LOGGER;
    }

    /**
     * This method is used to Log an Info Message.
     *
     * @param message - The message to print to the Log
     */
    public static void info (String message)
    {
        LOGGER.info (message);
    }

    /**
     * This method is used to Log a warning Message.
     *
     * @param message - The message to print to the Log
     */
    public static void warn (String message)
    {
        LOGGER.warn (message);
    }

    /**
     * This method is used to Log an Error Message.
     *
     * @param message - The message to print to the Log
     */
    public static void error (String message)
    {
        LOGGER.error (message);
    }

    /**
     * This method is used to Log a Debug Message.
     *
     * @param message - The message to print to the Log
     */
    public static void debug (String message)
    {
        LOGGER.debug (message);
    }
}
