package com.yao.state;

public class StateTest {

    public static void main(String[] args) {
        test_Editing2Arraignment();
    }

    public static void test_Editing2Arraignment() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId, Status.Editing);
        System.out.println(
                "测试结果(编辑中To提审活动)：{}" + result.toString()
        );
        System.out.println("活动信息：{} 状态：{}" + ActivityService.queryActivityInfo(activityId).toString() + ActivityService.queryActivityInfo(activityId).getStatus());
    }
}
