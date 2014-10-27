wsgen -wsdl -keep -d ../output -cp . test.CalculatorImpl

//生成wsdl文件.在class目录下执行..服务器部署时候没用
wsgen -wsdl -keep -d D:\logs -cp . com.test.jaxws.server.CalculatorImpl  

D:\mine\TestJaxwsServer\target\classes\com\test\jaxws\server\CalculatorImpl.class

//生成客户端代码.启动服务之后执行.生成的java文件供客户端使用
wsimport -keep -d D:\logs http://localhost:30647/TestJaxwsServer/calculator?wsdl

拦截器是web.xml中WSServletContextListener读取同目录下的sun-jaxws文件,web.xml配置的拦截无效

wsgen生成的wsdl文件相当于http://localhost:30647/TestJaxwsServer/calculator?wsdl
即wsimport -keep -d D:\logs http://localhost:30647/TestJaxwsServer/calculator?wsdl
与wsimport -keep -d D:\logs CalculatorImplService.wsdl时一个效果

注:一下实测还是需要web.xml的上下问监听和sun-jaxws.xml(误,源于wsdl路径错误,去掉这两个文件之后的路径为
http://localhost:30647/TestJaxwsServer/CalculatorImplService?wsdl)
如果是glassfish，则不需要sun-jaxws.xml
在servlet3.0容器中，并不需要web.xml，请忽略下面。如果部署在2.5中，则需要声明webservice的servlet。
glassfish4是首个支持JavaEE 7的容器,即支持servlet3.1

ws学习,异步/同步,事务处理,调用在线的ws服务