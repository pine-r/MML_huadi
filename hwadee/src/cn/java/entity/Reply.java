package cn.java.entity;

public class Reply {
    private Integer replyId;

    private Integer topicId;

    private Integer replytoUserId;

    private Integer replyFromserId;

    private String replyContent;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getReplytoUserId() {
        return replytoUserId;
    }

    public void setReplytoUserId(Integer replytoUserId) {
        this.replytoUserId = replytoUserId;
    }

    public Integer getReplyFromserId() {
        return replyFromserId;
    }

    public void setReplyFromserId(Integer replyFromserId) {
        this.replyFromserId = replyFromserId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
}