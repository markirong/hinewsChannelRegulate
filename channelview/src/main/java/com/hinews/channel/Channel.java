package com.hinews.channel;

public class Channel {
//    String channelName;
//    int channelBelong;


    Object obj;
    int code = -1;

     String channelname;
     String cid;
     String channelselected;
     String order;
     String section_index;
     String ismoved;
     String url;
     String listtype;




//    public Channel(String channelName) {
//        this(channelName, 1, null);
//    }
   public Channel(String channelName) {
        this(channelName, 1+"", null);
    }

    /**
     * @param channelName   频道名称
     */
//    public Channel(String channelName, int channelBelong, Object obj) {
    public Channel(String channelName, String channelBelong, Object obj) {
//        this.channelName = channelName;
//        this.channelBelong = channelBelong;

        this.channelname =channelName;
        this.channelselected = channelBelong;
        this.obj = obj;
    }
    /**
     * @param channelName   频道名称
     */
    public Channel(String channelName, int channelBelong,
                   String listtype,String url) {
        this.channelname = channelName;
        this.channelselected =""+ channelBelong;
        this.listtype= listtype;
        this.url= url;
    }
    /**
     * @param channelName   频道名称
     */
//    public Channel(String channelName, int channelBelong) {
//        this(channelName, channelBelong, null);
//    }
 public Channel(String channelName, String  channelBelong) {
        this(channelName, channelBelong, null);
    }

    /**
     * @param channelName 频道名称
     */
//    public Channel(String channelName, Object obj) {
//        this(channelName, 1, obj);
//    }
    public Channel(String channelName, Object obj) {
        this(channelName, 1+"", obj);
    }

//    public String getChannelName() {
//        return channelName;
//    }
//
//    public void setChannelName(String channelName) {
//        this.channelName = channelName;
//    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }


    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getChannelselected() {
        return channelselected;
    }

    public void setChannelselected(String channelselected) {
        this.channelselected = channelselected;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSection_index() {
        return section_index;
    }

    public void setSection_index(String section_index) {
        this.section_index = section_index;
    }

    public String getIsmoved() {
        return ismoved;
    }

    public void setIsmoved(String ismoved) {
        this.ismoved = ismoved;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getListtype() {
        return listtype;
    }

    public void setListtype(String listtype) {
        this.listtype = listtype;
    }


    @Override
    public String toString() {
        return "Channel{" +
                "channelName='" + channelname
                + '\'' + ", obj=" + obj +
                + '\'' + ", url=" + url +
                + '\'' + ", listtype=" + listtype +
                '}';
    }
}
