package model;

/**
 * @author FT丶Kuroko
 * @date 2018/12/23 13:14
 */
public class RecentUser {
    private Integer userId;
    private String userName;
    private String imagePath;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {

        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
