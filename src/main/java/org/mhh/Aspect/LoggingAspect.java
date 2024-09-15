package org.mhh.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("@annotation(org.mhh.Log.Loggable)")
    public void loggableMethods() {
    }

    @Around("loggableMethods()")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Entering method: {} with parameter: {}", methodName, args);
        long startTime = System.currentTimeMillis();
        Object result = null;
        try {
            result = joinPoint.proceed();
            return result;
        } catch (Exception e) {
            logger.error("Exception in method {}: {}", methodName, e.getMessage());
            throw e;
        } finally {
            long endTime = System.currentTimeMillis();
            logger.info("Exiting method: {}. Execution time: {} ms", methodName, (endTime - startTime));
            logger.info("Method {} returned: {}", methodName, result);
        }
    }

}