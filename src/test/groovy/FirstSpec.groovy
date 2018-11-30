/*每次修改groovy脚本之后，要使之生效，必须运行mvn clean test(或者mvn clean package)
* 之后才能在idea中使用鼠标点击运行某个测试方法或者测试类
*
* spock在eclipse中也可用，but，eclipse对groovy支持不够好。
* groovy脚本虽然可以运行，但是会报错。*/
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
