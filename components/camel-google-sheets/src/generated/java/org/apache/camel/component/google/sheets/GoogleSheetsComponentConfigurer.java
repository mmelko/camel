/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleSheetsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "configuration": ((GoogleSheetsComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class, value)); return true;
        case "clientFactory": ((GoogleSheetsComponent) target).setClientFactory(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class, value)); return true;
        case "basicPropertyBinding": ((GoogleSheetsComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((GoogleSheetsComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleSheetsComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((GoogleSheetsComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class, value)); return true;
        case "clientfactory": ((GoogleSheetsComponent) target).setClientFactory(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class, value)); return true;
        case "basicpropertybinding": ((GoogleSheetsComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((GoogleSheetsComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleSheetsComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
