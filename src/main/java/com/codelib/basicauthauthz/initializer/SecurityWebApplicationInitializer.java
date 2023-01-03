package com.codelib.basicauthauthz.initializer;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * We customize {@link AbstractSecurityWebApplicationInitializer} to enable
 * the {@link org.springframework.security.web.session.HttpSessionEventPublisher}
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    @Override
    protected boolean enableHttpSessionEventPublisher() {
        return true;
    }
}
