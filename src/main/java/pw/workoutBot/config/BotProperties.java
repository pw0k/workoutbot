package pw.workoutBot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "telegram")
@Getter
@Setter
public class BotProperties {
    private String botName;
    private String token;
    private Long testChat;
    private Long generalChat;
}
