package server;

import java.io.Serializable;

public class DatabaseConfiguration  implements Serializable {
    private String host;
    private int port;
    private String base;
    private String login;
    private String password;

    public  DatabaseConfiguration() {

    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getBase() {
        return base;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
