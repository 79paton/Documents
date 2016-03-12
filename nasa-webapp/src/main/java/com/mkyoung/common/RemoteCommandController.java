package com.mkyoung.common;

import com.mkyoung.common.Circle;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.util.Date;

/**
 * Created by 79Paton on 12/03/2016.
 */
@RequestScoped
@Named
public class RemoteCommandController {

    private String subject;
    private Date date;
    private Circle circle;
    private Coords coords;

    public void parametersAssigned() {
        final FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "ActionListener called",
                "Parameters assigned");

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

//    public Circle getCircle() {
//        return circle;
//    }
//
//    public void setCircle(final Circle circle) {
//        this.circle = circle;
//    }
}
