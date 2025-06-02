package model;

public class Admin {
    private String adminId;
    private String name;
    private int permissionLevel;

    public Admin(String adminId, String name, int permissionLevel) {
        this.adminId = adminId;
        this.name = name;
        this.permissionLevel = permissionLevel;
    }

    public void reviewArticle(Article article, boolean approved) {
        // 审核逻辑（可拓展）
    }

    public String viewUserInfo(User user) {
        return "User ID: " + user.getUserId() + ", Nickname: " + user.getNickname();
    }

    public void muteUser(User user) {
        user.setMuted(true);
    }

    // Getters and Setters

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}
