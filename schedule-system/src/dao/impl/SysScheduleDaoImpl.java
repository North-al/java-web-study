package dao.impl;

import dao.BaseDao;
import dao.SysScheduleDao;
import pojo.SysSchedule;

import java.util.List;

public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "INSERT INTO sys_schedule VALUES (DEFAULT, ?, ?, ?)";
        return this.baseUpdate(sql, schedule.getUserId(), schedule.getTitle(), schedule.getCompleted());
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "SELECT * FROM sys_schedule";
        return this.baseQuery(SysSchedule.class, sql);
    }
}
