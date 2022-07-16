package com.fordevs;

// json.org dependencies

import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {
    public static void main(String[] args) {

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<student>\n" +
                "    <id>1</id>\n" +
                "    <name>Elen</name>\n" +
                "    <courses>\n" +
                "        <course>\n" +
                "            <courseId>1</courseId>\n" +
                "            <courseName>Java Programming</courseName>\n" +
                "        </course>\n" +
                "        <course>\n" +
                "            <courseId>2</courseId>\n" +
                "            <courseName>Python Programming</courseName>\n" +
                "        </course>\n" +
                "    </courses>\n" +
                "</student>";

        JSONObject jsonObject = XML.toJSONObject(xml);
        System.out.println(jsonObject);
    }
}