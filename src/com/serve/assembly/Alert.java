package com.serve.assembly;

import com.serve.stream.Client;
import com.serve.stream.Server;

public class Alert {
    private String alert;
    public Alert() {

    }
    public Alert(String alert) {
        this.alert = alert;
    }

    public String getAlert() {
        return this.alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public void sendAlert(Player player) {
        Server.manager.sendTB(player, "NSOANHEM",  (this.getAlert() == null ? "" : this.getAlert())+"\n\n- Số người online: " + Client.gI().ninja_size());
    }
}
