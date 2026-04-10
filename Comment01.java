/**
 * @author 索晗
 * @version 1.0
 */
public class Comment01{
    public static void main(String[]args){
        System.out.println("Just a comment exercise.");
    }
}
/*标签	            作用	                   适用位置	           示例
@author	      标注类 / 接口的作者	        类 / 接口注释顶部	 @author 张三
@version      标注版本号	                类 / 接口注释顶部	 @version 1.0
@since	      标注从哪个版本开始引入	     类 / 方法 / 字段	 @since JDK 1.8
@see	      关联参考其他类 / 方法	         任意位置	         @see com.example.Utils 或 @see #methodName()
@deprecated	  标记该元素已过时，不推荐使用	  类 / 方法 / 字段	  @deprecated 请使用 newMethod() 替代 */

/*标签	                      作用	                       适用位置	             示例
@param	                说明方法的参数含义、类型、要求	    方法注释	    @param name 用户名，不能为空
@return	                说明方法的返回值含义	           非 void 方法	    @return 处理后的结果字符串
@throws / @exception	说明方法抛出的异常（两者完全等价）	方法注释	    @throws IOException 读取文件失败时抛出*/

/*标签	                                                作用	               适用位置	               示例
{@link}	                              内联链接，直接在注释里跳转其他类 / 方法	  任意位置	     请参考{@link #calc(int)}方法
{@code}	                                 内联代码块，保留代码格式，不被解析	      任意位置	     {@code System.out.println("hello")}
{@inheritDoc}	                          继承父类 / 接口的文档注释	             重写的方法	     直接写在注释里，自动复用父类文档
@serial / @serialField / @serialData	    序列化相关，标注可序列化类的字段	  序列化类 / 字段	序列化开发专用
@param <T>	                              泛型方法的类型参数说明	             泛型方法       	@param <T> 泛型类型，任意对象 */