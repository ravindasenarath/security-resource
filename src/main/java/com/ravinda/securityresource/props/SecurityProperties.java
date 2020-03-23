package com.ravinda.securityresource.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

@ConfigurationProperties("security")
public class SecurityProperties {

    private JwtProperties jwt;

    public JwtProperties getJwt() {
        return jwt;
    }

    public void setJwt(JwtProperties jwt) {
        this.jwt = jwt;
    }

    public static class JwtProperties {

        private String rsaPub;

        public String getRsaPub() {
            return rsaPub;
        }

        public void setRsaPub(String rsaPub) {
            this.rsaPub = rsaPub;
        }
    }

}
