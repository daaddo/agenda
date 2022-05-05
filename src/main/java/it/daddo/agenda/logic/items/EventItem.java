
package it.daddo.agenda.logic.items;

import java.util.Date;

/**
 *
 * @author Anna
 */
public class EventItem {
    private String title;
    private String description;
    private Date date;
    private EventType type;
    private EventPriority priority;

    public EventItem(String title, String description, Date date, EventType type, EventPriority priority) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.type = type;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public EventPriority getPriority() {
        return priority;
    }

    public void setPriority(EventPriority priority) {
        this.priority = priority;
    }
    
    
}
