package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
@Component
public class ProductClientFeignHystrix implements ProductClientFeign{
    @Override
    public List<Product> listProdcuts() {
        List<Product> result=new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }
}
