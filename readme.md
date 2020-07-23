# day01_01maven_conflict
- 解决maven工程中jar包依赖问题方案  
    1.直接依赖优先级大于传递依赖  
    2.第一声明优先原则：哪个jar包的坐标在靠上的位置，这个jar包就是先声明的(适用于间接依赖)  
    3.排除法，配置exclusions标签(推荐)

# day01_02maven_multi_module
- maven多工程拆分讲解
    - mvc三层架构的拆分
    - 拆分完成后三种启动方式  
        a.使用父工程的tomcat插件启动day01_02maven_multi_module->Plugins->tomcat7->tomcat7:run  
        b.使用本地tomcat启动  
        c.先使用父工程day01_02maven_multi_module->lifecycle->install安装所有模块，然后再启动maven_web模块Plugins->tomcat7->tomcat7:run



















