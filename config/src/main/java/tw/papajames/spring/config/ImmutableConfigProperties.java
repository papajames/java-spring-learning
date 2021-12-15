package tw.papajames.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "mail2")
@ConstructorBinding
public class ImmutableConfigProperties {
    private final String hostName;
    private final int port;
    private final String from;

    public ImmutableConfigProperties(String hostName, int port, String from) {
        this.hostName = hostName;
        this.port = port;
        this.from = from;
    }

    public String getHostName() {
        return hostName;
    }

    public int getPort() {
        return port;
    }

    public String getFrom() {
        return from;
    }
}
