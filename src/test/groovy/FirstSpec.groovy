/*
https://semaphoreci.com/community/tutorials/stubbing-and-mocking-in-java-with-the-spock-testing-framework
每次修改groovy脚本之后，要使之生效，必须运行mvn clean test(或者mvn clean package)
* 之后才能在idea中使用鼠标点击运行某个测试方法或者测试类.
* 如何优化？跟maven配置有关？
*
* spock在eclipse中也可用，but，eclipse对groovy支持不够好。
* groovy脚本虽然可以运行，但是会报错。
*
*
* blocks: given,and,when,then
*
* Mock() 模拟服务的依赖对象
* >> 指定模拟对象在特定参数时方法调用的返回值
* >>> 指定模拟对象在特定参数时的方法多次调用依次的返回值
*mockObj.method(args)>>res
* setup
*
* 如果想生成测试报告，可以参考https://github.com/renatoathaydes/spock-reports#if-you-are-using-maven
*
* n * obj.method(args) 断言方法调用次数
*
* n * mockobj({it->
*   it.someattr == "hello"
*   it.anotherattr != null
* })
* 断言mock对象的方法参数
*
* Mock的动态响应(@PersistenceContext 依赖注入)
*
* 动态参数（mock对象方法的_参数）
* */
class FirstSpec extends spock.lang.Specification{
    void "测试用例x"(){
        given:"用户没有注册"
        and:"用户执行注册"
        MyService service = Mock()
        def s = "hello world"
        def sep = " "
        service.split("hello world"," ")>>["hello","world"]
        when:"用户输入的用户名不合法"
        def list = service.split(s,sep)
        then:"不允许注册并且给出相关提示"
        println("this is a test："+list)
        list == ["hello","world"]
    }

}
