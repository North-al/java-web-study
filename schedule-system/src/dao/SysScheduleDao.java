package dao;

import pojo.SysSchedule;

import java.util.List;

public interface SysScheduleDao {
    public int addSchedule(SysSchedule schedule);

    public  List<SysSchedule> findAll();
}


