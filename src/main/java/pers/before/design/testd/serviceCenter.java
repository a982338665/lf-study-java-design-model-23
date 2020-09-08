package pers.before.design.testd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * create by lishengbo 2018/6/12
 *
 * 模拟服务注册中心：
 *      向此服务注册对象保存在List
 */
public class serviceCenter {

        //注册服务信息存储集合
        List<serviceObject> servers= Collections.synchronizedList(new ArrayList<serviceObject>());


        //添加注册用户相关------------------------------------------------
        //注册
        public void add(serviceObject serviceObject){
            servers.add(serviceObject);
        }
        //删除
        public void remove(serviceObject serviceObject){
            servers.remove(serviceObject);
        }


        //服务通知相关-----------------------------------------------------
        //通知内容设置
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
            notifyAllof();
        }

        //通知开始
        public void notifyAllof(){
            for (serviceObject serviceObject:servers
                 ) {
                serviceObject.notifyAllof(content);
            }
        }
}
