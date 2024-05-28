package gen;

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
