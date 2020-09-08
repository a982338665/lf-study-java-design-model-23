package pers.before.design.observer;

/**
 * create by lishengbo on 2018-05-29 16:53
 *
 * 具体的观察者对象，实现更新的方法，使自身状态和目标状态一致
 */
public class ConcreteObserver implements Observer {

    //观察者状态----与目标状态保持一致
    private String obserberStatus;


    /**
     * 获取目标类的状态同步到观察者状态中
     * @param target
     */
    public void update(target target) {
        obserberStatus=((ConcreteTarget)target).getSubjectStatus();
    }
}
