wsgen -wsdl -keep -d ../output -cp . test.CalculatorImpl

//生成wsdl文件.在class目录下执行..服务器部署时候没用
wsgen -wsdl -keep -d D:\logs -cp . com.test.jaxws.server.CalculatorImpl  

D:\mine\TestJaxwsServer\target\classes\com\test\jaxws\server\CalculatorImpl.class

//生成客户端代码.启动服务之后执行.生成的java文件供客户端使用
wsimport -keep -d D:\logs http://localhost:30647/TestJaxwsServer/calculator?wsdl

http://localhost:8088/calculator?wsdl
