package com.me.rocks.kafka.message;

import com.me.rocks.kafka.AbstractShould;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.me.rocks.kafka.AbstractShould.UserType.JUNIOR;
import static org.junit.Assert.assertNotNull;

public class AvroModelShould {

    private static final Logger log = LoggerFactory.getLogger(AvroModelShould.class);

    @Test public void
    should_model_extends_parent_avro_message_can_get_schema() {
        AbstractShould.DifferentUser user = new AbstractShould.DifferentUser();
        user.setFavoriteColor("red");
        user.setFavoriteNumber(10);
        user.setName("samuel");
        user.setUserType(JUNIOR.toString());

        String schema = user.getSchema();

        assertNotNull(schema);
    }
}