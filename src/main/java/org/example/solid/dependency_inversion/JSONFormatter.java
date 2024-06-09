package org.example.solid.dependency_inversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JSONFormatter implements Formatter {
  public String format(Message message) throws FormatException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule());
    try {
      return mapper.writeValueAsString(message);
    } catch (JsonProcessingException e) {
      log.error("An error occurred: ", e);
      throw new FormatException(e);
    }
  }
}
