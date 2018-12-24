package bsuir.coursach.gleb.myredditreader;

import java.util.ArrayList;
import java.util.List;

public class XmlPicker {

    private String TAG = "XML Extract";

    private String htmlTag;
    private String xmlLine;

    public XmlPicker(String htmlTag, String xmlLine) {
        this.htmlTag = htmlTag;
        this.xmlLine = xmlLine;
    }

    public List<String> extract(){
        List<String> result = new ArrayList<>();

        String[] splitXML = xmlLine.split(htmlTag + "\"");

        return result;
    }
}
