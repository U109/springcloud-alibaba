sentinel : 

java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar

其中 -Dserver.port=8080 用于指定 Sentinel 控制台端口为 8080。

参数	作用
-Dcsp.sentinel.dashboard.server=localhost:8080	向 Sentinel 接入端指定控制台的地址
-Dproject.name=sentinel-dashboard	向 Sentinel 指定应用名称，比如上面对应的应用名称就为 sentinel-dashboard
从 Sentinel 1.6.0 起，Sentinel 控制台引入基本的登录功能，默认用户名和密码都是 sentinel。用户可以通过如下参数进行配置：

-Dsentinel.dashboard.auth.username=sentinel 用于指定控制台的登录用户名为 sentinel；
-Dsentinel.dashboard.auth.password=123456 用于指定控制台的登录密码为 123456；如果省略这两个参数，默认用户和密码均为 sentinel；
-Dserver.servlet.session.timeout=7200 用于指定 Spring Boot 服务端 session 的过期时间，如 7200 表示 7200 秒；60m 表示 60 分钟，默认为 30 分钟
