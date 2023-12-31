package com.trevormessengerdev.emailService.emailServiceForSMTP.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;




/**
 * The class Properties reader.
 * Requires key.properties file in root directory.
 */
public final class PropertiesReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesReader.class);

    private static final Properties PROPERTIES;

    private static final String PROP_FILE = "key.properties";


    private PropertiesReader() {
    }

    static {
        PROPERTIES = new Properties();
        final URL props = ClassLoader.getSystemResource(PROP_FILE);

        try {
            PROPERTIES.load(props.openStream());

        } catch (IOException ex) {

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(ex.getClass().getName() + "PropertiesReader method");
            }
        }
    }

    /**
     * Method getProperty.
     *
     * @param name String name file.
     * @return Return property
     */
    public static String getProperty(final String name) {

        return PROPERTIES.getProperty(name);
    }
}