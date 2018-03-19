package com.waga.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 19, 2018, 11:41:51 AM
 */
@Aspect
@Configuration
public class SchedulerSpyConfiguration {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.waga.schedule..*.*(..))")
    public void before(final JoinPoint joinPoint) {
        logger.info(" Running schedule {}", joinPoint);
    }

    @After("execution(* com.waga.schedule..*.*(..))")
    public void after(final JoinPoint joinPoint) {
        logger.info(" Finished running schedule {}", joinPoint);
    }

}
