package test;

import dao.BaseDao;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBaseDao {

    private static BaseDao baseDao;

    @BeforeClass
    public static void setUp() {
//         Initialize the baseDao object here
//         For example: baseDao = new BaseDaoImpl();
         baseDao = new BaseDao();
    }

    @Test
    public void testBaseQueryObject() {
        Long i = baseDao.baseQueryObject(Long.class, "SELECT count(*) FROM sys_user");
        System.out.println("Count: " + i);
    }
}
