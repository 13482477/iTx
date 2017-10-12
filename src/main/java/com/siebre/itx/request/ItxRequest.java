package com.siebre.itx.request;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class ItxRequest {

    /**
     * 传输协议
     */
    private TransportType transportType;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 消息类型
     */
    private MessageType messageType;

    private Object message;

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
