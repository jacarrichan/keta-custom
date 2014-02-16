keta-custom
===========

一个开源的、安全的、可扩展的定制化平台。

QQ交流群：22714096

在线效果查看http://ketayao.com/keta-custom

操作手册http://ketayao.com


----------------------------------------------------------------------
#sample运行步骤:     

    * 新建keta_custom数据库,导入[sql\mysql\keta_custom.sql]中的脚本;    
    * 将keta-custom-component中的[jdbc.properties]改为自己本地的配置信息;     
	* 执行test目录中的QuickStartServer启动项目，访问默认地址http://localhost:9090/sample/login;
	* 默认用户名admin/123456 ;   
	* 若想关闭验证码功能,请将keta-custom-main项目applicationContext-shiro.xml文件中shiroDbRealm这个bean的useCaptcha属性置为false;
	
#patchca验证码插件
 
  * 请在github上下载，解压后执行 mvn install 放进本地仓库就可以使用了        
  * 获取地址: https://github.com/pusuo/patchca
  
----------------------------------------------------------------------
#snapshot
*查看日志
 ![image](https://raw.github.com/jacarrichan/keta-custom/master/snapshot/log.jpg)
 
*模块管理
 ![image](https://raw.github.com/jacarrichan/keta-custom/master/snapshot/module.jpg)
 
---------------------------------------------------------------------- 