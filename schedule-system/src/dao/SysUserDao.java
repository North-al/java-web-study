package dao;

public interface SysUserDao {
    public int addUser(String username, String password);
    public boolean updateUser(String username, String password);
}
