package com.shop.byitem.handler;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.logging.Logger;
@ControllerAdvice
public class ExceptionsHandler {
private final static Logger LOGGER = (Logger) LoggerFactory.getLogger(ExceptionsHandler.class);
@ExceptionHandler(NullPointerException.class)
public void handleNullPointerException(NullPointerException e) {
    LOGGER.info(e.getMessage());
}
}
