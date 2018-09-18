package cn.java.entity;

public class Topic {
    private Integer topicId;

    private Integer orderId;

    private Integer userId;

    private Integer topicUserId;

    private String topicContent;

    private Integer topicReplyCount;

    private String topicPic;

    private String topicOrderId;

    private Integer topicGoodsId;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTopicUserId() {
        return topicUserId;
    }

    public void setTopicUserId(Integer topicUserId) {
        this.topicUserId = topicUserId;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public Integer getTopicReplyCount() {
        return topicReplyCount;
    }

    public void setTopicReplyCount(Integer topicReplyCount) {
        this.topicReplyCount = topicReplyCount;
    }

    public String getTopicPic() {
        return topicPic;
    }

    public void setTopicPic(String topicPic) {
        this.topicPic = topicPic;
    }

    public String getTopicOrderId() {
        return topicOrderId;
    }

    public void setTopicOrderId(String topicOrderId) {
        this.topicOrderId = topicOrderId;
    }

    public Integer getTopicGoodsId() {
        return topicGoodsId;
    }

    public void setTopicGoodsId(Integer topicGoodsId) {
        this.topicGoodsId = topicGoodsId;
    }
}