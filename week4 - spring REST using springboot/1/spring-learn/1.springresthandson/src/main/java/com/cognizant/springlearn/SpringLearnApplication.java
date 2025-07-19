import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
        SpringLearnApplication app = context.getBean(SpringLearnApplication.class);
        app.displayDate();
        app.displayCountry();
        app.displayCountries();
        LOGGER.info("END");
    }

    public void displayDate() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        String dateStr = "31/12/2018";
        try {
            Date date = format.parse(dateStr);
            LOGGER.debug("Date: {}", date);
        } catch (ParseException e) {
            LOGGER.error("ParseException: ", e);
        }
        LOGGER.info("END");
    }

    public void displayCountry() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        com.cognizant.springlearn.Country country = context.getBean("country", com.cognizant.springlearn.Country.class);
        LOGGER.debug("Country : {}", country.toString());
        // Demonstrate singleton/prototype scope
        com.cognizant.springlearn.Country anotherCountry = context.getBean("country", com.cognizant.springlearn.Country.class);
        LOGGER.debug("Another Country : {}", anotherCountry.toString());
        LOGGER.info("END");
    }

    public void displayCountries() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        @SuppressWarnings("unchecked")
        List<com.cognizant.springlearn.Country> countryList = (List<com.cognizant.springlearn.Country>) context.getBean("countryList");
        LOGGER.debug("Country List : {}", countryList);
        LOGGER.info("END");
    }
}