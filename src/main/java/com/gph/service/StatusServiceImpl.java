package com.gph.service;


import com.gph.dao.StatusDao;
import com.gph.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Resource
    private StatusDao sd;

    public List<Status> selectAll() {
        return sd.selectAll();
    }

    public Status selectOne(int status_id) {
        return sd.selectOne(status_id);
    }

    public int insert(Status status) {
        return sd.insert(status);
    }

    public int update(Status status) {
        return sd.update(status);
    }

    public int delete(int status_id) {
        return sd.delete(status_id);
    }
}
