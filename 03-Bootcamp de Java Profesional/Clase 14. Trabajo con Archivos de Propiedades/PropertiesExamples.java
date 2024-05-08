public class PropertiesExamples {

    public static void main(String[] args) {

        // Cargar propiedades desde archivo de configuración
        String configPath = "configuration.properties";

        Properties props = new Properties();
        props.load(new FileInputStream(configPath));


        // Cargar propiedades desde archivo de configuración xml
        String xmlConfigPath = "configuration.xml";
        props.loadFromXML(new FileInputStream(xmlConfigPath));

        // Obtener propiedad

        String version = props.getProperty("version");
        float versionFloat = (float) props.get("version");

        // Escribir propiedad
        props.setProperty("name", "Cristina Mariscal");

        // Eliminar propiedad
        appProps.remove("version");  

        // Almacenar propiedades
        props.store(new FileWriter(configPath), "some description or comment");

        // Almacenar propiedades en XML
        props.storeToXML(new FileOutputStream(xmlConfigPath), "some description or comment");

        // Itera sobre propiedades
        Enumeration<Object> valueEnumeration = props.elements();
        while (valueEnumeration.hasMoreElements()) {
            System.out.println(valueEnumeration.nextElement());
        }

        // Iterar sobre los nombres de las propiedades
        for (String key : props.stringPropertyNames()) {
            String value = props.getProperty(key);
            System.out.println(key + ": " + value);
        }

        // Validar existencia
        boolean exists = props.containsKey("key");

        
        // Propiedades por defecto
        String defaultConfigPath = "defaultConfig.properties";
        Properties defaultProps = new Properties();
        defaultProps.load(new FileInputStream(defaultConfigPath));

        String appConfigPath = configPath;
        Properties appProps = new Properties(defaultProps);
        appProps.load(new FileInputStream(appConfigPath));


        // Crear un objeto locale
        Locale locale = new Locale("en", "US");

        Locale locale = new Locale.Builder()
            .setLanguage("fr")
            .setRegion("CA")
            .setScript("Latn")
            .build();


    }
}
