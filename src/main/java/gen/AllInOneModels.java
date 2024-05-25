package gen;

import java.util.List;
import java.util.Map;

public class ErrorModel {
    private String message;
    private int code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

import java.util.List;

public class Tag {
    public static final List<String> TAG_VALUES = List.of(
        "deadlyassault", "bomb", "hostage", "robbery", "shots", "shooting",
        "stabbing", "suspicious", "threat", "trespass", "vandalism", "explosion",
        "hazmat", "outdoorfire", "rescue", "structurefire", "collision", "hazard",
        "closure", "transit", "looting", "peacefulassembly", "dangerousassembly",
        "gas", "power", "utilitydamage", "deadly", "hate", "injury", "massinjury",
        "officerinvolved", "correction");

    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

import java.util.List;

public class Alert {
    private String _id;
    private List<String> tags;
    private String dateCreated;
    private String location;
    private Point geometry;
    private String title;
    private String description;
    private String certainty;
    private String urgency;
    private String severity;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Point getGeometry() {
        return geometry;
    }

    public void setGeometry(Point geometry) {
        this.geometry = geometry;
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

    public String getCertainty() {
        return certainty;
    }

    public void setCertainty(String certainty) {
        this.certainty = certainty;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}

import java.util.List;

public class Incident {
    private String _id;
    private List<Alert> alerts;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }
}

import java.util.List;
import java.util.Map;

public class Geometry {
    private String type;
    private Point3D coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Point3D getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point3D coordinates) {
        this.coordinates = coordinates;
    }
}

import java.util.List;

public class Point {
    private String type;
    private Point3D coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Point3D getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point3D coordinates) {
        this.coordinates = coordinates;
    }
}

import java.util.List;

public class Point3D {
    private List<Double> coordinates;

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}

