package com.yao.state.impl;

import com.yao.state.ActivityService;
import com.yao.state.Result;
import com.yao.state.State;
import com.yao.state.Status;

public class DoingState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可审核通过");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可撤销审核");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Close);
        return new Result("0000", "活动关闭成功");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可开启");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可重复执行");
    }
}
