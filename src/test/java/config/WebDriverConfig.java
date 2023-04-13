package config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config
{
    @Config.Key("baseUrl")
    @DefaultValue("https://rabota.by")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("version")
    @DefaultValue("100.0")
    String getVersion();

    @Key("remoteUrl")
    String getRemoteURL();
}
